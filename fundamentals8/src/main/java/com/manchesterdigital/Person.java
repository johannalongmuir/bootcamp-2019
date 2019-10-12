package com.manchesterdigital;

public abstract class Person {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Address address;

    public Person(String firstName, String lastName, Integer age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public final String sayHello(){
        return "Hello";
    }

    public void printAddress(){
        System.out.println(address.toString());

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public abstract void haveLunch();

}
