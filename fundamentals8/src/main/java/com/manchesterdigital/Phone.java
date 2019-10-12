package com.manchesterdigital;

public class Phone {
    private String operatingSystem;

    private String text;
    private String call;
    private Integer numberOfCalls;
    private String recipient = "John";

    // New phone called XYZ
    // Create things that phone does
    // Make a class that contains properties a phone has and functions performs



    public void textFrom (String recipient) {
        System.out.println("text from " + recipient);
    }

    public static void call (String recipient) {
        System.out.println("phoning " + recipient);
    }





    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call("Amy!");
        phone.textFrom("Amy!");



    }

}
