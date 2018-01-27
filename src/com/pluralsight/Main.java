package com.pluralsight;

import java.util.Random;

public class Main {
    /*
    https://programmingbydoing.com/
    Basic arrays 2 - Assignment #140
     */

    public static void main(String[] args) {

        Integer[] integers = new Integer[10];

        int index;
        Random r = new Random();

        for (index = 0; index < integers.length; index++){
            int number = r.nextInt(100);
            integers[index] = number;
            System.out.println("Slot " + (index + 1) + " contains a " + integers[index]);
        }


    }
}
