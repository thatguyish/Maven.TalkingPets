package io.zipcoder.polymorphism;

public abstract class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name){
        this.setName(name);
    }


    public abstract String speak();


}
