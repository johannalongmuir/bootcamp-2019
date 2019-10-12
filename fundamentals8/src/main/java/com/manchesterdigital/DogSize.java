package com.manchesterdigital;

public enum DogSize {
    // enums that then call noise as type
    SMALL("Meow"),
    MEDIUM("ruff"),
    LARGE("WOOF");

    private String noise;

    // constructor to get noise in enum
    DogSize(String noise) {
        this.noise = noise;
    }

    // getter to return something
    public String getNoise() {
        return noise;
    }
}
