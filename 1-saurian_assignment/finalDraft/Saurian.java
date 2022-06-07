// Programmer: Akiel Aries
// Date: 06/16/2021
// The Saurian class has the ability to translate English to Saurian
// and Saurian to English

// Disclaimer:
// The given assignment description, project files, code files and/or solution files
// should not be made available in a public form via methods such as online hosting
// in code repositories, educational resource hosting websites, etc. These projects
// and related files can be hosted in private repositories for situations such as
// showing example work at job interviews, personal reference for future class
// projects, etc.

public class Saurian{

    // constants used for translating
    // note M = M and m = m so M and m are not needed
    // array for capital and lowercase English letters
    public static final char[] ENGLISHARR = {'A','B','C','D','E','F','G','H','I','J',
		'K','L','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
		'a','b','c','d','e','f','g','h','i','j','k','l','n','o','p',
		'q','r','s','t','u','v','w','x','y','z'};

    // array for capital and lowercase Saurian letters
    public static final char[] SAURIANARR = {'U','R','S','T','O','V','W','X','A','Z',
		'B','C','D','E','F','G','H','J','K','I','L','N','P','O','Q',
		'u','r','s','t','o','v','w','x','a','z','b','c','d','e','f',
		'g','h','j','k','i','l','n','p','o','q'};

    // should be the same length for ENGLISHARR and SAURIANARR
    public static final int ARRLENGTH = ENGLISHARR.length; 

    // private string holding english phrase
    private String english;
    // private string holding saurian phrase
    private String saurian;

    // public default constructor setting values to 
    // english and saurian strings
    public Saurian(){
        // use 'this' keyword to reference the object throughout the program
        // (found this way of referencing objects on stackoverflow)
        this.english = "";
        this.saurian = "";
    }
    
    // public overloaded constructor accepting two parameters
    // one parameter is the String input from driver, the other
    // is a Bool determining is the String input was english or saurian
    public Saurian(String input, Boolean type){
        // if statement to determine T/F on saurian or english phrases entered
		// T will result in the english phrase
        if(type == true){
            this.english = input;
            this.translateEngToSaurian(input);
        }
		// if T is not satisfied then result will be saurian
        else{
            this.saurian = input;
            this.translateSaurianToEng(input);
        }
    }

    // public getter method for english strings returning the english val
    public String getEnglish(){
        return this.english;
    }

    // public getter method for saurian strings returing the saurian val
    public String getSaurian(){
        return this.saurian;
    }

    // public setter method for english strings
    // method should update english string along with saurian string
    public void setEnglish(String input){
        this.english = input;
        this.translateEngToSaurian(input);
    }

    // public setter method for saurian strings
    // method should update saurian string along with english string
    public void setSaurian(String input){
        this.saurian = input;
        this.translateSaurianToEng(input);
    }
    // public int method returning an int. should scan array's first elements to determine match 
    // node method was inspired from a stackoverflow/chegg post when I was stuck
    public int node(char[]arr, char goal){
        // for loop specifying that the nth value in the array can not be null
		// ++n for pre increments
		// found reference to '\0' on stackoverflow 
        for(int n = 0; arr[n] != '\0'; ++n){
            // if the array at the nth slot is equivelent to the
            // goal, return the value at n
            if(arr[n] == goal){
                return n;
            }
        }
		// return 0 if exception is not met
        return 0;
    }
    // public translation method from english to saurian with no return type
    // this method relies off of provided strings in the driver file
	// used stackoverflow for aid on the for loop and w3schools for
	// .length()
    private void translateEngToSaurian(String englishToSaurian){
        this.saurian = "";
		// for loop using length() function to determine length of first
		// char in given input string 
        for(int n = 0; n < englishToSaurian.length(); n++){
			// if loop using isAlphabetic to determine if the phrase is
			// in order at the nth character
            if(Character.isAlphabetic(englishToSaurian.charAt(n))){
                int node = node(ENGLISHARR, englishToSaurian.charAt(n));
                this.saurian += SAURIANARR[node];
            }
			// if given string does not satisfy the given condition then
			// add the saurian value back to engtosar string at the 
			// given char
            else{
                this.saurian += englishToSaurian.charAt(n);
            }
        }
    }

    // public translation method doing conversion from saurian to english
    // method has no return type and will rely off char arrays in driver file
    private void translateSaurianToEng(String saurianToEnglish){
        this.english = "";
		// for loop using length() function to determine length of first
		// char in given input string
        for(int n = 0; n < saurianToEnglish.length(); n++){
			// if else using isAlphabetic detmining if phrase is in
			// correct order at the nth character
            if(Character.isAlphabetic(saurianToEnglish.charAt(n))){
                int node = node(SAURIANARR, saurianToEnglish.charAt(n));
                this.english += ENGLISHARR[node];            }
			// if the above condition is not met return the value back to
			// saurtoeng at the nth char
            else{	
                this.english += saurianToEnglish.charAt(n);
            }
        }   
    }

    // public string method combining english and saurian translations
    // to give to callee
    public String toString(){
        String combined_trans = "";
        combined_trans += "English Translation: " + this.english + "\n";
        combined_trans += "Saurian Translation: " + this.saurian + "\n";
        return combined_trans;
    }
}

