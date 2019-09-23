package com.manchesterdigital;

public class Students {
    public static final String CLASS_NAME = "Bootcamp";


    // this is an example of an instance variable. Belongs to instance called Student. accessed on line 12. Change from public to private which stops others accessing class
    private String studentName;

    public Students(String studentName) {
        this.studentName = studentName;
    }

    public void printDetails(){
        System.out.println("Student's name is " + studentName + " Class is: " + CLASS_NAME);
    }

    public static void main(String[] args) {
        Students students = new Students("Johanna");
        students.printDetails();
    }
}
