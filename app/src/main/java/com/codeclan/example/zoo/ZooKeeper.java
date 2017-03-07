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

        Enclosure bigcat = new BigCat("Big Cats");
        Enclosure aquarium = new Aquarium("Aquarium");
        Enclosure aviary = new Aviary("Aviary");

        Animal tiger = new Tiger("Tony", 8);
        Animal clownfish = new ClownFish("Nemo", 2);
        Animal parrot = new Parrot("Polymorphism", 20);

        while (true) {
            System.out.println("Type 1 to add a new enclosure.");
            System.out.println("Type 2 to add an animal to an enclosure.");
            System.out.println("Type 3 to feed an animal.");
            System.out.println("Type 4 to exit.");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Type 1 for Big Cats, type 2 for Aquarium or type 3 for Aviary");

                    switch (sc.nextInt()) {
                        case 1:
                            zoo.addEnclosure(enclosure);
                            System.out.println("Big Cats enclosure added!");
                            break;

                        case 2:
                            zoo.addEnclosure(enclosure1);
                            System.out.println("Aquarium added!");
                            break;

                        case 3:
                            zoo.addEnclosure(enclosure2);
                            System.out.println("Aviary added!");
                            break;
                    }

                case 2:
                    System.out.println("The animals you can choose to add to an enclosure are: Tiger (type 1), ClownFish (type 2) or Parrot (type 3)");
                    switch (sc.nextInt()) {

                        case 1:
                            bigcat.addAnimal(tiger);
                            System.out.println("Tiger has been added to the enclosure!");
                            break;

                        case 2:
                            aquarium.addAnimal(clownfish);
                            System.out.println("Clownfish has been added to the Aquarium!");
                            break;

                        case 3:
                            aviary.addAnimal(parrot);
                            System.out.println("Parrot has been added to the Aviary!");
                            break;

                    }
//
//                case 3:
//                    System.out.println("The animals you can feed are: Tiger, ClownFish or Parrot");
//                    switch (sc.nextInt()) {
//
//                    }

                case 4:
                    System.exit(0);

            }

        }

    }
}
