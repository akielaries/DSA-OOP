/*
Author: Akiel
Details: Program should read from JukeInterface.java as well as Record.java and expand upon
current capabilities. When run, Jukebox.java should return the current jukebox contents,
random records, current slots of the specified records, successful removal of records as well as finally
printing out the current jukebox.
*/

import java.util.*;
//import java.util.ArrayList;
//import java.util.Random;

public class Jukebox implements JukeInterface {

    //array list using generics being used to store records.
    private ArrayList<Record>records;
    
    // the default constructor initializing records array list.
    public Jukebox() {
        records = new ArrayList<Record>();
    }

    // inserts a record at the last position in the jukebox arraylist.
    public void insert(Record aRecord) {
        records.add(aRecord);
    }

    // inserts a record in a specified slot in the jukebox arraylist 
    // as long as aRecord, specified in JukeInterface.java, is not null.
    public void insert(int slot, Record aRecord) {
        records.add(slot, aRecord);
    }

    // boolean method use to remove records from the jukebox leaving records
    // un-edited if they do not exsist.
    public boolean remove(Record aRecord) {
        return records.remove(aRecord);
    }

    // boolean method containing the record and will return true if the jukebox
    // contains the record.
    public boolean contains(Record aRecord) {
        return records.contains(aRecord);
    }

    // int method used to find the slot in the jukebox. method will return
    // the slot that contains the record 
    public int findSlot(Record aRecord) {
        return records.indexOf(aRecord);
    }

    // random method used to generate a random number slot and return
    // the record in that slot. The int will be between 0-9.
    public Record random() {
        // Random R is the new instance of "Random"
        Random r = new Random();
        // specify the size/range the random number will be produced between
        int size = records.size();
        return records.get(r.nextInt(size));
    }

    // toString method will return the jukebox's data as a String, will take
    // care of all conversions and finally return the contents.
    
    public String toString(){
        return records.toString();
    }
}

