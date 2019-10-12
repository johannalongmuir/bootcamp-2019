package com.manchesterdigital;

public class Student extends Person {

    public String universityName; //not final as not all have that


    public Student(String firstName, String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public void haveLunch() {
        System.out.println("Having lunch at 13:00");
    }





    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append("UniversityName: ");
        out.append(universityName);
        out.append("\n");
        out.append("Age: ");
        out.append(getAge());
        out.append(getFirstName());

        return out.toString();
    }
}
