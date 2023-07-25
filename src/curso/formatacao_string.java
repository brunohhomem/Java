package curso;

import java.util.Locale;

public class formatacao_string {
    public static void  main(String[] args) {
        int y = 32;
        double x = 10.35784;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x); //printf - Mascara de formatação para 2 casas decimais
        System.out.printf("%.4f%n", x); //printf - Mascara de formatação para 4 casas decimais

        Locale.setDefault(Locale.US); //para localizar o programa para US e usar ponto ao inves de virgula nos decimais
        System.out.printf("%.4f%n", x); //mudando o locale para US e mostrando ponto ao inves de virgula

        System.out.println("Resultado = " + x); //concatenando o valor com string

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //interpolacao de valores

    }
}
