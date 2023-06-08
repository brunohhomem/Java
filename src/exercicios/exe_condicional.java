package exercicios;

import java.util.Scanner;

public class exe_condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Exercicio 3
        int a, b;
        System.out.println("Digite o primeiro número inteiro:");
        a = sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não Multiplos");
        }

    }
}
