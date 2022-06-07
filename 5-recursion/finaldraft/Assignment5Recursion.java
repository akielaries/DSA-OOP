// Programmer: Akiel Aries
// Date: 07/12/2021
// You are to write a class called Assignment5Recursion. 
// In the class, you will write 3 public methods.   
// The goal is to implement The squares puzzle problem: 
// “How many one-by-one squares will be generated by an algorithm that starts 
// with a single square and, on each iteration, adds squares all around the outside.” 

// Assignment5Recursion class
public class Assignment5Recursion{
    
    // static method returning an int representing
    // the number of squares 
    public static int puzzleFormula(int n){
        // implement the formula 2(n^2)+2n+1
        return 2*(n*n)+(2*n)+1;
    }

    // method used to return an int that represent 
    // the number of squares and implement the summation formula
    // ((2n)+1)+2(n∑i=1)(2i-1))
    public static int puzzleLoop(int n){
        // breaking the formula into parts, implement the first
        // section, (2n)+1))
        int SUMMATION = ((2*n)+1);

        // implementing the next section, (n∑i=1)
        // by using a for loop setting i=1 with i being <= 
        // variable n
        for(int i = 1; i<=n; i++){
            // implement the next part of the formula,2(2i-1)
            // and adding the result to the rest of the equation using
            // +=
            SUMMATION += (2*(2*i-1));
        }
        return SUMMATION;
    }
    // method used to return an int representing the squares
    // implementing:
    // S(0)=1
    // S(n)=S(n-1)+4n FOR n>= 1
    public static int puzzleRecurse(int n){
        if(n == 0){
            return 1;
        }
        else{
            return puzzleRecurse(n-1)+4*n;
        }
    }
}
