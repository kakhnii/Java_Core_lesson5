package com.company;

public abstract class Pet {
    private int weight;
    private int height;

    public Pet(int weight, int height) {
        super();
        this.weight = weight;
        this.height = height;
    }
     abstract void noice();

}
