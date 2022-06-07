/*---------------------------------------------------------------------------
// AUTHOR:
// SPECIFICATION:   This file holds the data for a student including name,
//          age, and GPA.  It includes accessor and
//          mutator methods, as well as methods to compare two students and
//          return the one with a better GPA or the older one.
// INSTRUCTIONS:  Read the following code skeleton and add your own code
//          according to the comments.  When you see
//          //--> that is where you need to add code.
//-------------------------------------------------------------------------*/

public class Student
{
        // Declare the instance private variables: A student has a String name, int age, and double gpa.
        private String name;
        //--> Finish declaring the rest of instance variables
        private int age;
        private double gpa;

        // Constructor #1 - the Default Constructor
        public Student()
        {
                name = "no name given";
                age = -1;
                gpa = 0.0;
        }

        // Constructor #2 - use 'this' reference to distinguish the instance variables of
        // the class from the corresponding method parameters with the same names
        public Student(String newName, int newAge, double newGPA)
        {
                //--> ADD LINES OF CODE HERE TO COMPLETE CONSTRUCTOR #2
                name = newName;
                age = newAge;
                gpa = newGPA;
        }

        // allows changing of the age
        public void setAge(int newAge)
        {
                age = newAge;
        }

        // allows changing of the name
        public void setName(String newName)
        {
                name = newName;
        }

        // ADD THE METHOD setGPA HERE
        //-->
        public void setGPA(double newGPA)
        {
                gpa = newGPA;
        }

        // returns the name of the student
        public String getName()
        {
                return name;
        }

        // returns the age of the student
        public int getAge()
        {
                return age;
        }

        // ADD THE METHOD public double getGPA() HERE
        //-->
        public double getGPA()
        {
                return gpa;
        }

        // Observe how this method works.
        // It returns the student with the better GPA or if they are the same returns the caller.
        public Student betterGPA(Student other)
        {
                if (gpa >= other.getGPA()) {
                        return this;
                } else {
                        return other;
                }
        }

        // Create a public method olderStudent that takes a Student parameter
        // and returns the Student which is older or if they are the same returns the caller.
        // Follow the example for betterGPA.
        //-->
        public Student olderStudent(Student other)
        {
                if(age >= other.getAge())
                        return this;
                else
                        return other;
        }

        // Observe how this method works. This method prints out the student's details.
        public void print()
        {
                System.out.println(
                                "\r\nName: " + name
                                + "\r\nAge: " + age
                                + "\r\nGPA: " + gpa
                                );
        }

        // Create an overloaded public method print that take a integer parameter n
        // and prints the student's details n number of times.
        //-->i
        public void print(int n)
        {
                for(int i = 0; i < n; i++)
                {
                        System.out.println(
                                        "\r\nName: " + name
                                        + "\r\nAge: " + age
                                        + "\r\nGPA: " + gpa
                                        );
                }
        }
}
