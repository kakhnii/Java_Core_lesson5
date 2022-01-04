package com.company;

public class Cow extends Pet{
    private int milk;

    public Cow(int weight, int height, int milk) {
        super(weight, height);
        this.milk = milk;
    }


    @Override
    void noice() {
        System.out.println("Я корова- Мууу-Мууу");
    }
}
