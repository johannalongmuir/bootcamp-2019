package com.manchesterdigital;

public class Students {
    // private variable. Member variable as belongs just to this class. Private so only I can use it
    private String name;
    private int age;

    public Students(String name) {
        this.name = name;
    }

    public Students(int age) {
        this.age = age;
    }


    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter method getName
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setter. void as one way street. Not need it to come back. E.g Change to Duncan.
    // Generally have this as public as available. This is redundant really as already have pubic Stuenst
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Students englishStudent = new Students("Amy");
        System.out.println(englishStudent.getName());

        Students frenchStudent = new Students("Duncan", 23);
        System.out.println(frenchStudent.getName() + " " + frenchStudent.getAge());

        System.out.println(englishStudent.toString());

    }
}
