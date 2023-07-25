package curso;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas: ");
        int hora;

        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18) {
            System.out.println("Boa noite!");
        }


        sc.close();
    }
}
