package com.company;

public class Cat extends Pet {

    private String color;
    private String hair;


    public Cat(int weight, int height, String color, String hair) {
        super(weight, height);
        this.color = color;
        this.hair = hair;
    }



    @Override
    void noice() {
        System.out.println("Я кіт- Мяууу-Мяууу");
    }
}
