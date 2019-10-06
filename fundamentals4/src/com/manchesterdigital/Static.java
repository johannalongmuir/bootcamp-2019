package com.manchesterdigital;

public class Static {
    //private only local to this class
    private String name;
    // schoolName never change. Only ever one variable. Even if have 5 students, refer back to this one school name. Not use lots of memory
    static String schoolName = "Bootcamp";
    // use getter. Can update name through this, however its still private
    public void setName(String name) {
        this.name = name;
    }
    // not available to any other class.
    private void sayHello() {
        String message = "Hello";
        System.out.println(message);
    }



    public static void main(String[] args) {
        Static amy = new Static();
        amy.setName("Amy");
    }
}
