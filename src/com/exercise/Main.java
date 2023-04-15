package com.exercise;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Garfield", Color.ORANGE);

        switch (cat.color) {
            case WHITE -> System.out.println("Biały kot");
            case BROWN -> System.out.println("Brązowy kot");
            case ORANGE -> System.out.println("Pomarańczowy kot");
            case BLACK -> System.out.println("Czarny kot");
        }

    }
}
