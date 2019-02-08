package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractAnimal> myAnimalList = new ArrayList<AbstractAnimal>();

        myAnimalList.add(new Mammal("Panda", 1869));
        myAnimalList.add(new Mammal("Zebra", 1778));
        myAnimalList.add(new Mammal("Koala", 1816));
        myAnimalList.add(new Mammal("Sloth", 1804));
        myAnimalList.add(new Mammal("Armadillo", 1758));
        myAnimalList.add(new Mammal("Raccoon", 1758));
        myAnimalList.add(new Mammal("Bigfoot", 2021));

        myAnimalList.add(new Bird("Pigeon", 1837));
        myAnimalList.add(new Bird("Peacock", 1821));
        myAnimalList.add(new Bird("Toucan", 1758));
        myAnimalList.add(new Bird("Parrot", 1824));
        myAnimalList.add(new Bird("Swan", 1758));

        myAnimalList.add(new Fish("Salmon", 1758));
        myAnimalList.add(new Fish("Catfish", 1817));
        myAnimalList.add(new Fish("Perch",  1758));

        System.out.println("\n***List all the animals in descending order by year discovered***\n");
        myAnimalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        myAnimalList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));

        System.out.println("\n***List all the animals alphabetically***\n");
        myAnimalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myAnimalList.forEach((a) -> System.out.println(a.getName()));

        System.out.println("\n***List all the animals in order by how they move***\n");
        myAnimalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myAnimalList.forEach((a) -> System.out.println(a.getName() + " " + a.move()));

        System.out.println("\n***List only those animals that breathe with lungs***\n");
        printAnimals(myAnimalList, a -> a.breathe().equals("lungs"));

        System.out.println("\n***List only those animals that breathe with lungs and were discovered in 1758***\n");
        printAnimals(myAnimalList, a -> a.breathe().equals("lungs") && a.getYear() == 1758);

        System.out.println("\n***List only those animals that lay eggs and breathe with lungs***\n");
        printAnimals(myAnimalList, a -> a.reproduce().equals("eggs") && a.breathe().equals("lungs"));

        System.out.println("\n***List alphabetically only those animals that were discovered in 1758***\n");
        myAnimalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(myAnimalList, a -> a.getYear() == 1758);
    }

    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal a : animals) {
            if (tester.test(a)) {
                System.out.println(a.getName());
            }
        }
    }
}
