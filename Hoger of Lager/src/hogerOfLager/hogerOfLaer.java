package hogerOfLager;

import java.util.*;
import java.lang.Math;

public class hogerOfLaer {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int ronde;

        ronde = 1;
        int getal;

        getal = 101;

        // Maak de code eerst
        int nummer;

        nummer = random.nextInt(101);
        while (ronde <= 7) {
            if (nummer == getal) {
                ronde = 7;
            } else {
                System.out.println("Ronde:");
                System.out.println(ronde);
                System.out.println("Raad de Nummer");
                getal = input.nextInt();
                if (getal > nummer) {
                    System.out.println("Het nummer is Lager");
                } else {
                    if (getal < nummer) {
                        System.out.println("Het Nummer is Hoger");
                    } else {
                        System.out.println("Het Nummer is precies");
                    }
                }
                ronde = ronde + 1;
            }
        }
        if (nummer == getal) {
            System.out.println("Je hebt de Nummer geraden goed gedaan");
        } else {
            System.out.println("Je hebt de Nummer niet geraden volgende keer beter");
        }
    }
}

