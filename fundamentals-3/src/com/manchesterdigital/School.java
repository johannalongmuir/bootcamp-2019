package com.manchesterdigital;

import static com.manchesterdigital.Students.CLASS_NAME;

public class School {

    /* importing a constant from Students
      call with Students.CLASS_NAME;
      Importing to the top as shown is optional
     */

    public static void main(String[] args) {
        Students april = new Students("April");
        april.printDetails();
        System.out.println(CLASS_NAME);
    }
}
