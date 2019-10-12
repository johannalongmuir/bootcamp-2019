package com.manchesterdigital;

public abstract class Machine {
    private final String manufacturer;
    private final String name;
    private final Colours colours; //enum had before.
    private Integer weight;


    // constructor, mandidory fields. Setter for weight
    public Machine(String manufacturer, String name, Colours colours) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.colours = colours;
    }

    // setter so can get to weight
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    // getters
    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public Colours getColours() {
        return colours;
    }

    public Integer getWeight() {
        return weight;
    }

    // to String
    @Override
    public String toString() {
        return "Machine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", colours=" + colours +
                ", weight=" + weight +
                '}';
    }
}
