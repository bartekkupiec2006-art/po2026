package agh.po.lab4.zadania;

import agh.po.lab4.animals.*;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int rand = random.nextInt(3);
            if (rand == 0) {
                animals[i] = new Parrot("Polly_" + i);
            } else if (rand == 1) {
                animals[i] = new Dog("Burek_" + i);
            } else {
                animals[i] = new Snake("Kaa_" + i);
            }
        }

        int sumOfLegs = 0;
        for (Animal animal : animals) {
            sumOfLegs += animal.getLegs();
            System.out.println(animal.getDescription());
            animal.makeSound();
        }

        System.out.println("\nSuma nóg wszystkich zwierząt w zoo wynosi: " + sumOfLegs);
    }
}