package com.codeclan.example.zoo;

import java.util.ArrayList;
import java.util.Scanner;

import static android.R.attr.type;
import static android.R.id.list;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by user on 03/03/2017.
 */

public class ZooKeeper {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Animal Sanctuary");

        Enclosure tigerEnclosure = null;
        Enclosure parrotEnclosure = null;
        Enclosure clownfishEnclosure = null;

        Animal tiger = new Tiger("Tony", 8);
        Animal clownfish = new ClownFish("Nemo", 2);
        Animal parrot = new Parrot("Polymorphism", 20);

        Steak steak = new Steak();
        Algae algae = new Algae();
        Seeds seeds = new Seeds();


        while (true) {

            System.out.println("Type 1 to add a new enclosure.");
            System.out.println("Type 2 to add an animal to an enclosure.");
            System.out.println("Type 3 to choose an animal to feed.");
            System.out.println("Type 4 to feed the animal.");
            System.out.println("Type 5 to exit.");

            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1:

                    System.out.println("Which enclosure would you like to add?: ");
                    System.out.println("Type 1 for Big Cats");
                    System.out.println("Type 2 for Aquarium");
                    System.out.println("Type 3 for Aviary");

                    switch (sc.nextInt()) {
                        case 1:
                            tigerEnclosure = new BigCat("Big Cats");
                            zoo.addEnclosure(tigerEnclosure);
                            System.out.println("Big Cats enclosure added!");
                            break;

                        case 2:
                            clownfishEnclosure = new Aquarium("Aquarium");
                            zoo.addEnclosure(clownfishEnclosure);
                            System.out.println("Aquarium added!");
                            break;

                        case 3:
                            parrotEnclosure = new Aviary("Aviary");
                            zoo.addEnclosure(parrotEnclosure);
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
                            if (tigerEnclosure != null) {
                                tigerEnclosure.addAnimal(tiger);
                            } else {
                                System.out.println("BigCat enclosure unavailable!");
                            }
                            break;

                        case 2:
                            if (clownfishEnclosure != null) {
                                clownfishEnclosure.addAnimal(clownfish);
                            } else {
                                System.out.println("Aquarium unavailable!");
                            }
                            break;

                        case 3:
                            if (parrotEnclosure != null) {
                                parrotEnclosure.addAnimal(parrot);
                            } else {
                                System.out.println("Aviary unavailable");
                            }
                            break;
                    }

                case 3:

                    System.out.println("Please select the animals you would like to feed: ");
                    System.out.println("Type 1 for Tiger");
                    System.out.println("Type 2 for ClownFish");
                    System.out.println("Type 3 for Parrot");

                    switch (sc.nextInt()) {

                        case 1:
                            ArrayList<Animal> tigers = tigerEnclosure.getAnimals();
                            for (Animal tiger1 : tigers) {
                                System.out.println(tiger1.getName());
                            }

                            break;

                        case 2:
                            ArrayList<Animal> clownFish  = clownfishEnclosure.getAnimals();
                            for (Animal clownfish1 : clownFish) {
                                System.out.println(clownfish1.getName());
                            }

                            break;

                        case 3:
                            ArrayList<Animal> parrots  = parrotEnclosure.getAnimals();
                            for (Animal parrot1 : parrots) {
                                System.out.println(parrots);
                            }
                            break;
                    }

                case 4:

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

                case 5:
                    System.exit(0);
            }

        }

    }
}
