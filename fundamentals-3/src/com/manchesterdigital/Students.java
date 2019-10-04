package com.manchesterdigital;

public class Students {

    // Constant called Class name. Always the same. Final version as not want it to change
    public static final String CLASS_NAME = "Bootcamp";

    /* this is an example of an instance variable.
    Constructor, this. keyword to be able to use when making instance of it.
    Accessed on line 22 in the printDetails method
    Change from public to private which stops others accessing class
     */
    private String studentName;

    public Students(String studentName) {
        this.studentName = studentName;
    }


    // method called printDetails
    public void printDetails(){
        System.out.println("Student's name is " + studentName + " Class is: " + CLASS_NAME);
    }

    // main method. Create an instance of student and assign it "Johanna". Call method printDetails
    public static void main(String[] args) {
        Students students = new Students("Johanna");
        students.printDetails();
    }
}
