// Programmer: Akiel Aries
// Date: 07/07/2021
// Complete the code for Hashes.java and Main.java. 
// Use the Assignment6Sol.java as a reference as well as GetHash.java.
// "Let's get together and hash it out." - Tony Stark

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashes {
    // declare new string hashStr
    private String hashStr;

    // declae makeHash method with String declarations accounting for 
    // NoSuchAlgorithmException
    public void makeHash(String hashName) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] byteArr = md.digest(hashName.getBytes(StandardCharsets.UTF_8));

        StringBuilder buildStr = new StringBuilder();
        // format the input string
        for (byte b : byteArr) {
            buildStr.append(String.format("%02x", b));
        }

        this.hashStr = buildStr.toString();
    }

    // return the hash string
    public String getHashedStr() {
        return this.hashStr;
    }

}

