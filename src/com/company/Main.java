package com.company;

public class Main {

    public static void main(String[] args) {
        Cat c = new Cat(12, 21, "black", "scot");
        Dog d = new Dog(12, 21, "scot", "Labrador");
        Cow cw = new Cow(102, 210, 20);
        
        c.noice();
        d.noice();
        cw.noice();
        System.out.println();
    }
}
