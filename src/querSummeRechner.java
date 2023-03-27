/**
 * Das Programm berechnet die Quersumme der Zahl
 *
 * Die Quersumme einer Zahl ist die Summe der einzelnen Ziffern dieser Zahl,
 * wenn man diese Ziffern nacheinander addiert.
 *  Beispiel: Die Quersumme der Zahl 123 gleich 1+2+3 = 6.
 *
 */

import java.util.Scanner;

public class querSummeRechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Fragen den Benutzer nach einer Zahl
        System.out.println("Geben Sie eine Zahl ein: ");
        int number = input.nextInt();

        //Quersummer berechnen
        int quersumme= 0;
        while (number > 0) {
            quersumme += number % 10; //Diese Operation gibt uns die letzte Ziffer der Zahl
            number /= 10; //Letzte Ziffer entfernen
        }

//Ergebnis ausgaben
        System.out.println("Die Quersumme der is:"+quersumme);
    }
}
