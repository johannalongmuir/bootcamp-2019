package com.mancheterdigital;

public class Dog {
    // Member variable. Belongs to the dog class. Member and instance are the same
    private int sizeOfDog;
    // static constant under dog class. Accces in another class as <class>.<CONSTANT_NAME>
    public static final int NUMBER_OF_TEETH = 1;

    // constructor. Make a new dog instance. Construct a dog. CMD N + constructor. Best practice is after member variable

    public Dog(int sizeOfDog) {
        this.sizeOfDog = sizeOfDog;  // this keyword refers to the object playing with or are in.
    }

    // Member method
    public String bark() {
        if (sizeOfDog > 60) {  // Conditional. IF dog above 60 get woof bark
            return "WOOF!";
        }
        else if (sizeOfDog > 15) {
            return "RUFF!";
        }

        return "YIP!";
    }

    // static method. Access through class level. To access have to use Dog.relieve in runner class
    public  static void relieve (){
        System.out.println("Gone for a dump....");
    }

}

// refer to Dog class in Runner class
