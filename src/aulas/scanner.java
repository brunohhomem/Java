package aulas;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int y;

//        sc.next(); - para string
//        sc.next().charAt(0); - para string pega apenas o caractere indicado no charAt()
//        sc.nextInt(); - para inteiros
//        sc.nextDouble(); - para doubles

        System.out.println("Digite uma palavra:");
        x = sc.next();
        System.out.println("A palavra é: " + x);

        System.out.println("Agora digite um numero inteiro: ");
        y = sc.nextInt();
        System.out.println("O número digitado foi: " + y);

        sc.close();
    }
}
