package com.zuzia.oop.threetwo;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void printList(List<? extends Animal> animals) {
        for (Animal m : animals) {
            System.out.println(m.getSpecies());
        }
    }

    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("left", "right");
        System.out.println(stringPair);
        stringPair.swap();
        System.out.println(stringPair);
        System.out.println(stringPair.max());

        Pair<Integer> intPair = new Pair<>(-1, 1);
        System.out.println(intPair);
        intPair.swap();
        System.out.println(intPair);
        System.out.println(intPair.max());

        List<Bird> birds = new LinkedList<>();
        birds.add(new Bird("Eagle"));
        birds.add(new Bird("Falcon"));

        List<Mammal> mammals = new LinkedList<>();
        mammals.add(new Mammal("Monkey"));
        mammals.add(new Mammal("Cow"));

        printList(birds);
        printList(mammals);
    }
}
