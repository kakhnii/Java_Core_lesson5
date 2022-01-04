package com.company;

public class Dog extends Pet{
    private String color;
    private String breed;

    public Dog(int weight, int height, String color, String breed) {
        super(weight, height);
        this.color = color;
        this.breed = breed;
    }




    @Override
    void noice() {
        System.out.println("Я пес - Гаууу-Гаууу");
    }
}
