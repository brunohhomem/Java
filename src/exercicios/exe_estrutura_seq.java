package exercicios;

import java.util.Scanner;

public class exe_estrutura_seq {
    public static void main(String[] args) {
        int a, b, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        resultado = a + b;
        System.out.println("A soma é: " + resultado);

        sc.close();
    }
}
