/**
 * Das Programm fragt den Benutzer nach einer positiven ganzen Zahl und überprüft dann,
 * ob sie eine Primzahl ist oder nicht.
 *
 * "Primzahl": Eine Zahl, der eine positive ganze Zahl beschreibt,
 * die genau zwei positive Teiler hat: 1 und sich selbst.
 * wenn sie nur durch 1 und sich selbst teilbar ist.
 *  Beispiele für Primzahlen sind 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
 *
 * */


import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Benutzer nach einer ganzen Zahl fragen
        System.out.println("Geben Sie eine ganze Zahl: ");
        int number = input.nextInt();
        //
        boolean isPrime = true;
        //Die Zahl kleiner oder gleich 1 ist --->Keine Prime Zahl
        if (number <= 1) {
            isPrime = false;
            System.out.println("Falsche Eingabe!");
        }
        else {
            //
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                //    System.out.println("Die zahl ist keine PrimZahl");
                    isPrime = false;
                    break;
                }
            }

        }
    // Ausgabe dee Ergebnis
        if (isPrime) {
            System.out.printf("%d ist Primzahl.%n", number);
        } else {
            System.out.printf("%d ist keine Primzahl.%n", number);
        }



    }

}
