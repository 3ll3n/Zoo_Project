package com.codeclan.example.zoo;

import java.util.Scanner;

/**
 * Created by user on 03/03/2017.
 */

public class ZooKeeper {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Animal Sanctuary");

        System.out.println("Type 1 to add a new enclosure");
        System.out.println("Type 2 to add an animal to an enclosure");
        System.out.println("Type 3 to feed an animal");

        Scanner sc = new Scanner(System.in);

        if (sc.nextInt() == 1) {
            Enclosure enclosure = new BigCat("Big Cats");
            zoo.addEnclosure(enclosure);
            System.out.println("Big Cats enclosure added!");
        }


    }
}
