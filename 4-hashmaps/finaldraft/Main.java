// Programmer: Akiel Aries
// Date: 07/07/2021
// Complete the code for Hashes.java and Main.java. 
// Use the Assignment6Sol.java as a reference as well as GetHash.java.
// "We're in the endgame now." - Stephen Strange, M.D., Ph.D.
// https://pics.me.me/were-in-the-endgame-now-when-the-power-point-goes-38463881.png

import java.io.*;
import java.util.*;
import java.security.NoSuchAlgorithmException;

public class Main {
    // declare array with max length of 25. The input file must 
    // have 25 entries.
    public static final int ARR_LENGTH = 25;

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // setup the hash map here
        // declare new string values for main man and leading lady
        String mMan = "Mega Man";
        String lLady = "Lucina";
        // create new generic hash map taking string vals later being taken from
        // filename
        Map<String, String> hashedNamesHM = new HashMap<>();
        Hashes hashes = new Hashes();
        // point to file holding contents for hashmap
        String filename = "/Users/akiel/Desktop/Titties/college/MyWorkspace/Classes/Mesa_CC/CSC205AB(OOP_Data_Structures)/4-hashmaps/finaldraft/names.txt";

        // declare name array holding names as string elements
        String[] namesArr;
        // read names from the file names.txt 
        namesArr = readNames(filename);
        System.out.println(filename);
        System.out.println("The list of items has been processed");

        //print out every element in the array
        for(int i = 0; i < namesArr.length; i++){
            System.out.println(namesArr[i]);
            hashes.makeHash(namesArr[i]);
            hashedNamesHM.put(namesArr[i], hashes.getHashedStr());
        }

        System.out.println(hashedNamesHM.toString());

        // find your main man using .get method
        if (hashedNamesHM.containsKey(mMan)) {
            System.out.println(" = " + hashedNamesHM.get(mMan));
        }
        // if the main man is not found in the .txt source file
        // invoke the following else statement
        else {
            System.out.println("The HashMap does not contain " + mMan + ".");
        }

        // find your leading lady
        if (hashedNamesHM.containsKey(lLady)) {
            System.out.println(" = " + hashedNamesHM.get(lLady));
        }
        // if the leading lady is not found in the .txt source file
        // invoke the following else statement
        else {
            System.out.println("The HashMap does not contain " + lLady + ".");
        }
    }

    // read the names from names.txt and put them into an array
    public static String[] readNames(String filename){
        // declare new String array with names from filename
        String[] names = new String[ARR_LENGTH];
        int index = 0;
        // using try and catch with a BufferedReader to read the text 
        // from an input file in this case names.txt. 
        try{
            // declare new BR file reader pointing to the filename in this case
            // names.txt as declared above.
            // using BR requires to catch or delare to be thrown an IOException.
            BufferedReader BR = new BufferedReader(new FileReader(filename));
            // create new readLine() method called indexLineto read each line 
            // from filename.
            String indexLine = BR.readLine();
            while(indexLine != null && index < ARR_LENGTH){
                names[index++] = indexLine;
                indexLine = BR.readLine();
            }
            // using close() to close the scanner method and release resources
            // in stream.
            BR.close();
        }
        catch(FileNotFoundException error){
            error.printStackTrace();
        }
        // catching the IOException due to the use of the BufferedRead and readLine
        // methods used above.
        catch(IOException error){
            error.printStackTrace();
        }

        return names;
    }
}
