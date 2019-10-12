package com.manchesterdigital;

public interface HasMilk {
    void addMilk(); // method abstract


    default void putInChiller() {
        System.out.println("Chill out");
    }


}
