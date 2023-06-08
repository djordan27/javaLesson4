package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <F extends Fruit> {
    public double sumOfWeigt = 0;
    public int count = 0;
    private String name = Fruit.getNAME();
//    {sumOfWeigt = 0;
//    count = 0;
//    }

    private ArrayList<F> fruits = new ArrayList<F>();

    public ArrayList<F> getFruits(){
        return fruits;
    }

    public void setFruits(Fruit fruits) {
        this.fruits.add((F) fruits);
    }
    public double getWeihtOfBox(){
        for (; count < fruits.size(); count++) {
           sumOfWeigt = sumOfWeigt + fruits.get(count).getWEIGHT();
        }
        return sumOfWeigt;
    }

    @Override
    public String toString() {
        return "Box{" +
                "sumOfWeigt=" + sumOfWeigt +
                ", nameOfFruits=" + name +
                ", fruits=" + fruits +
                '}';
    }
}
