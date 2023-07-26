package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_noPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Insira as medidas do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Insira as medidas do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("A área do triângulo X é: %.4f%n", areaX);
        System.out.printf("A área do triângulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A área X é maior");
        } else {
            System.out.println("A área Y é maior");
        }

        sc.close();
    }
}
