package com.codeclan.example.zoo;

import java.util.Scanner;

import static android.R.attr.type;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by user on 03/03/2017.
 */

public class ZooKeeper {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Animal Sanctuary");

        Enclosure enclosure = null;


        Animal tiger = new Tiger("Tony", 8);
        Animal clownfish = new ClownFish("Nemo", 2);
        Animal parrot = new Parrot("Polymorphism", 20);

        Steak steak = new Steak();
        Algae algae = new Algae();
        Seeds seeds = new Seeds();


        while (true) {

            System.out.println("Type 1 to add a new enclosure.");
            System.out.println("Type 2 to add an animal to an enclosure.");
            System.out.println("Type 3 to feed an animal.");
            System.out.println("Type 4 to exit.");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1:

                    System.out.println("Which enclosure would you like to add?: ");
                    System.out.println("Type 1 for Big Cats");
                    System.out.println("Type 2 for Aquarium");
                    System.out.println("Type 3 for Aviary");

                    switch (sc.nextInt()) {
                        case 1:
                            enclosure = new BigCat("Big Cats");
                            zoo.addEnclosure(enclosure);
                            System.out.println("Big Cats enclosure added!");
                            break;

                        case 2:
                            enclosure = new Aquarium("Aquarium");
                            zoo.addEnclosure(enclosure);
                            System.out.println("Aquarium added!");
                            break;

                        case 3:
                            enclosure = new Aviary("Aviary");
                            zoo.addEnclosure(enclosure);
                            System.out.println("Aviary added!");
                            break;
                    }

                case 2:

                    System.out.println("The animals you can choose to add to an enclosure are: ");
                    System.out.println("Type 1 for Tiger");
                    System.out.println("Type 2 for Clownfish");
                    System.out.println("Type 3 for Parrot");

                    switch (sc.nextInt()) {

                        case 1:
                            enclosure.addAnimal(tiger);
                            break;

                        case 2:
                            enclosure.addAnimal(clownfish);
                            break;

                        case 3:
                            enclosure.addAnimal(parrot);
                            break;
                    }

                case 3:
                    System.out.println("Please select the animal you would like to feed: ");
                    System.out.println("Type 1 for Tiger");
                    System.out.println("Type 2 for ClownFish");
                    System.out.println("Type 3 for Parrot");

                    System.out.println("Please select the food you would like to feed to the animal: ");
                    System.out.println("Type 1 for Steak");
                    System.out.println("Type 2 for Algae");
                    System.out.println("Type 3 for Seeds");


                    switch (sc.nextInt()) {

                        case 1:
                            tiger.eat(steak);
                            break;

                        case 2:
                            clownfish.eat(algae);
                            break;

                        case 3:
                            parrot.eat(seeds);
                            break;
                    }

                case 4:
                    System.exit(0);
            }

        }

    }
}
