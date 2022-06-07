// import File, FileNotFoundException and Scanner classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*---------------------------------------------------------------------------
// AUTHOR:
// SPECIFICATION:   This program is about file i/o
// INSTRUCTIONS:    Read the following code skeleton and add your own code
//                  according to the comments. When you see
//                  //--> that is where you need to add code.
//-------------------------------------------------------------------------*/
public class Assignment6Sol
{
        /*
         * The objective of this program is to read address records from a file that
         * contains 5 address records and extracts just the names and then prints
         * them to the screen. The file is formatted like
         *
         * Name: <name>
         * Phone Number: <number>
         * Address: <address>
         * ------------
         * Name: <name>
         * Phone Number: <number>
         * Address: <address>
         * ------------
         */

        public static void main(String[] args)
        {
                Scanner scan = new Scanner(System.in);
                String inputFile;

                //instantiate an object of type ReadRecord
                //-->
                Assignment6Sol rr = new Assignment6Sol();

                //declare an array of strings called names
                String[] names;

                //User input will be like address.txt
                //Ask the user for the input file
                //-->
                //-->
                System.out.println("Please input the name of the input file.");
                inputFile = scan.next();

                //get the list of names from the file
                names = rr.readNames(inputFile);

                //print the names
                rr.printNames(names);
        }

        // method that returns a String array of names read from the file
        public String[] readNames(String filename)
        {
                String[] names = new String[6];
                String currentLine = "";
                // create an integer named index and initialize it to 0
                //-->
                int index = 0;

                try
                {
                        //make a new scanner object that will read from the file
                        Scanner in = new Scanner(new File(filename));

                        //loop as long as the scanner still has contents (use the hasNext method)
                        while(in.hasNext())
                        {
                                //if the current line has "Name" in it, add the name (starts at the
                                //7th character) to the array and increase the index
                                if(currentLine.contains("Name"))
                                {
                                        names[index] = currentLine.substring(6);
                                        index++;
                                }
                                //read the next line from the file
                                currentLine = in.nextLine();
                        }

                        //print a message saying the address book file is done being read
                        //-->
                        System.out.println("The address book is finished being read.");

                }
                catch (FileNotFoundException e)
                {
                        // print the exception message
                        e.printStackTrace();
                }

                //return the array of names
                return names;
        }

        public void printNames(String[] names)
        {
                //print out every element in the array
                for(int i = 0; i < names.length; i++)
                {
                        System.out.println(names[i]);
                }
        }
}
