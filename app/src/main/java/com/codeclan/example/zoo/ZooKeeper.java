package com.codeclan.example.zoo;

import java.util.Scanner;

/**
 * Created by user on 03/03/2017.
 */

public class ZooKeeper {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Animal Sanctuary");
        Enclosure enclosure = new BigCat("Big Cats");
        Enclosure enclosure1 = new Aquarium("Aquarium");
        Enclosure enclosure2 = new Aviary("Aviary");

        System.out.println("Type 1 to add a new enclosure.");
        System.out.println("Type 2 to add an animal to an enclosure.");
        System.out.println("Type 3 to feed an animal.");

        Scanner sc = new Scanner(System.in);

        if (sc.nextInt() == 1) {
            System.out.println("The enclosures you can choose from are: Big Cats, Aquarium or Aviary");
            if (sc.nextLine() == "Big Cats");
            zoo.addEnclosure(enclosure);
            System.out.println("..... enclosure added!");
        }

        if (sc.nextInt() == 2) {
            System.out.println("The animals you can choose to add are: Tiger, ClownFish or Parrot");
        }

        if (sc.nextInt() == 3) {
            System.out.println("The animals you can feed are: Tiger, ClownFish or Parrot");
        }




    }
}
