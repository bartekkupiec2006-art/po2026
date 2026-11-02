package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> twojeTypy = new ArrayList<>();
        for (String arg : args) {
            twojeTypy.add(Integer.parseInt(arg));
        }
        System.out.println("Twoje typy: " + twojeTypy);

        Random random = new Random();
        long czasStart = System.currentTimeMillis();
        long liczbaLosowan = 0;
        int trafienia = 0;

        System.out.println("Rozpoczynam symulację szóstki... to może chwilę potrwać!");

        while (trafienia < 6) {
            liczbaLosowan++;
            ArrayList<Integer> wylosowane = new ArrayList<>();
            while (wylosowane.size() < 6) {
                int liczba = random.nextInt(49) + 1;
                if (!wylosowane.contains(liczba)) wylosowane.add(liczba);
            }

            ArrayList<Integer> sprawdzane = new ArrayList<>(wylosowane);
            sprawdzane.retainAll(twojeTypy);
            trafienia = sprawdzane.size();

            if (liczbaLosowan == 1) {
                System.out.println("Pierwsze losowanie: " + wylosowane);
                System.out.println("Trafienia za pierwszym razem: " + trafienia);
            }
        }

        long czasKoniec = System.currentTimeMillis();
        System.out.println("\nUdało się trafić 6/6!");
        System.out.println("Liczba losowań: " + liczbaLosowan);
        System.out.println("Czas symulacji: " + (czasKoniec - czasStart) + " ms");
    }
}