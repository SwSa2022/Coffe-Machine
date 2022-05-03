package com.company;

interface Getraenke {
    public static int getWater(int water) {
        return water;
    }

    public static int getMilk(int milk) {
        return milk;
    }

    public static int getCoffee(int coffee) {
        return coffee;
    }
}

class Espresso implements Getraenke {
    int water = 250;
    int coffee = 16;
}

class Latte implements Getraenke {

    int water = 350;
    int milk = 75;
    int coffee = 20;
}

class Cappuccino implements Getraenke {

    int water = 200;
    int milk = 100;
    int coffee = 12;
}
