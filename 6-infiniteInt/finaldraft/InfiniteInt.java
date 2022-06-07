/*
Programmer: Akiel Aries
Date: 07/18/2021
Description: Program:Write a new class called InfiniteInt.   
We can (theoretically) store an “infinite” integer by linking together
nodes that hold actual completeintegers.   For this program, just store 
3 digits in each node (concept is the same, but we won’t have to generate 
hundreds of digits to test it).
*/


import java.lang.String;

public class InfiniteInt<E> extends DLList implements Comparable {
    
    // default constructor initially using super() changed to 
    // addLast(0); to satisfy test 1
    public InfiniteInt() {
        addLast(0);
        //super();
    }

    // parameterized constructor checking for illegal strings containing non-digits
    // and throwing an exception if. recieving string argument and building
    // linked list as met.
    public InfiniteInt(String str) {
        // specifying what characters will meet the non-digit exception
        boolean anyLetters = str.matches(".*[a-zA-Z]+.*");
            
            // if condition is met throw new IllegalArgumentException
            if (anyLetters == true){
                throw new IllegalArgumentException("Error: Invalid data type.");
            }

            double inputLength = str.length() % 3;
            int inputLengthDiv = str.length() / 3;

            if(inputLength == 0) {
                // creating a substring with the first 3 numbers 
                for(int i = 0; i < inputLengthDiv; i++) {
                    String substr = str.substring(0, 3);
                    int parsedStr = Integer.parseInt(substr);
                    addFirst(parsedStr);
                    str = str.substring(3);
                } 
            }      

            else if(inputLength == 1) {
                String substr = str.substring(0, 1);
                int parsedStr = Integer.parseInt(substr);
                addFirst(parsedStr);
                str = str.substring(1);
                
                for(int i = 0; i < inputLengthDiv; i++) {
                    substr = str.substring(0, 3);
                    parsedStr = Integer.parseInt(substr);
                    addFirst(parsedStr);
                    str = str.substring(3);
                }
            }

            else if(inputLength == 2) {
                String substr = str.substring(0, 2);
                int parsedStr = Integer.parseInt(substr);
                addFirst(parsedStr);
                str = str.substring(2);
                for(int i = 0; i < inputLengthDiv; i++) {
            } 
        }
        toString();
    }

    // static method recieving 2 InfiniteInts as arguments, adding them up, and finally
    // returning the II with the total. Traverse backwards.
    public static InfiniteInt add(InfiniteInt i_int1, InfiniteInt i_int2) {
        DLList <Integer> expList = new DLList <Integer>();
        DLLNode <Integer> ptr1 = i_int1.head;
        DLLNode <Integer> ptr2 = i_int2.head;
        int numToReturn = 0;
        int rem = 0;
        String exp = "";

        // if the 2 ints are the same size then add the ptr data and have the ptrs
        // point to next
        if(i_int1.size() == i_int2.size()) {

            while(ptr1 != null) {
                expList.addFirst(ptr1.data + ptr2.data);
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            } 
        }
        // if i_int1 is bigger than i_int2 
        else if(i_int1.size() > i_int2.size()) {
            
            //add remainder from previous iteration, if there is one
            while(ptr1 != null) {
                ptr1.data = ptr1.data + rem;
                rem = 0;
                
                // if ptr2 has data then add it up
                if(ptr2 !=null) {
                    numToReturn = ptr1.data + ptr2.data;
                    ptr2 = ptr2.next;
                }
                
                //if empty return ptr1 data
                // if ptr2 is empty return ptr1's data
                else if(ptr2 == null) {
                    numToReturn = ptr1.data;    
                }

                //if the returning number has more than 3 digits
                if(numToReturn > 999) {
                    rem = (numToReturn - (numToReturn % 1000)) / 1000;
                    numToReturn = numToReturn % 1000;
                }
                // adds last 3 digits to DLList
                expList.addFirst(numToReturn);
                ptr1 = ptr1.next;
            }
        }
        else if(i_int1.size() < i_int2.size()){

            // if there is a remainder add it 
            while(ptr2 != null){
                ptr2.data = ptr2.data + rem;
                rem = 0;

                // if ptr1 contains any data add it together
                if(ptr1 != null){
                    numToReturn = ptr1.data + ptr2.data;
                    ptr1 = ptr1.next;
                }

                // if ptr1 is empty return the data in ptr2
                else if(ptr1 == null){
                    numToReturn = ptr2.data;
                }

                //if the returning number has more than 3 digits
                if(numToReturn > 999){
                    rem = (numToReturn - (numToReturn % 1000)) / 1000;
                    numToReturn = numToReturn % 1000;
                }
                // adds last 3 digits to DLList
                expList.addFirst(numToReturn);
                ptr2 = ptr2.next;
            }
        }

        // remove all illegal chars
        exp = expList.toString().replaceAll(",","").replaceAll("[\\p{Ps}\\p{Pe}]", "").replaceAll(" ", "");    
        return new InfiniteInt(exp);
    }

    // compares two numbers
    // implements the comparable interface, returning 1 if the InfiniteInt is greater
    // than what's passed, 0 if the II is the same as what's passed. 
    public int compareTo(Object o)
    //public int InfiniteInt.compareTo(Object o)
    {
        if(o instanceof InfiniteInt){
            InfiniteInt thing = new InfiniteInt(reverseString(((InfiniteInt) o).revAndRemoveToString()));
            DLLNode<Integer> ptr1 = this.head;
            DLLNode<Integer> ptr2 = thing.head;

            //if first number is larger, return 1
            if(this.size() > thing.size()){
                return 1;
            }

            //if second number is larger, return -1
            else if(this.size() < thing.size()){
                return -1; 
            }

            else{
                while(ptr1 != null){

                    //if first node of ptr1 is bigger, return 1
                    if(ptr1.data > ptr2.data){
                        return 1; 
                    }

                    //if first node of ptr2 is bigger, return -1
                    else if(ptr1.data < ptr2.data){
                        return -1; 
                    }

                    //do the same operation with the next node
                    else {
                        ptr1 = ptr1.next;
                        ptr2 = ptr2.next;
                    }
                }
                // return 0 if both numbers are =
                return 0;
            }
        }
        else{
            // thrown ClassCastException for test 20
            throw new ClassCastException();
        }
    }
    
    // toString() method that will override the one in the superclass.  
    // toString() method should return the String representation of the integer with no 
    // spaces between the digits.
    public String toString(){
        String exp = "";
        DLLNode<E> ptr = tail;
            
            while(ptr != null) {
                
                if(ptr != tail){

                    //if node has one number add two zeros and one comma
                    if(String.valueOf(ptr).length() == 1){
                        exp = exp + "," + "00" + ptr.data;
                        ptr = ptr.prev;
                    }
                    
                    //if node has two numbers add one zero and one
                    else if(String.valueOf(ptr).length() == 2) {
                        exp = exp + "," + "0" + ptr.data;
                        ptr = ptr.prev;
                    }

                    // if note has three numbers add a comma
                    else{
                        exp = exp + "," + ptr.data;
                        ptr = ptr.prev;
                    }
                }
                // concatonate data and move to next node
                else{
                    exp = exp + ptr.data;
                    ptr = ptr.prev;
                }
            }
            return exp.trim();
    }

    // A reverse toString() method that will also remove all commas from the String. 
    // It should take a number such as 123,456 and return 654321 to be called in rev&remove
    public String reverseString(String str){
        String exp = "";

        for (int i = str.length()-1; i > -1; i--){
            exp = (exp + str.charAt(i));
        }
        return exp; 
    }

    // reverse&rem string method that calls the reverseString method and 
    // removes commas
    public String revAndRemoveToString(){
        String str = reverseString(String.valueOf(this));
        str = str.replaceAll(",","");
        return str.replaceAll(" ","");
    } 
    
    // A replaceCommasWithHyphens() method that replaces the comments generated 
    // by the toString() with hyphens and returns the String.
    public String replaceCommasWithHyphens(){
        return String.valueOf(this).replaceAll(",", "-");
    }

    public String getGraderHash(){
        return "10492c8b5346c510398e8492c9eb528c";
    }

}