import java.util.Scanner;

public class exercicios01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 6
		Scanner sc = new Scanner(System.in);
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();

		triangulo = (a * c) / 2;
		circulo = 3.14159 * (c * c);
		trapezio = ((a + b) * c) / 2;
		quadrado = b * b;
		retangulo = a * b;

		System.out.println("");
		System.out.printf("A área do triangulo: %.3f%n", triangulo);
		System.out.printf("A área do circulo: %.3f%n", circulo);
		System.out.printf("A área do trapezio: %.3f%n", trapezio);
		System.out.printf("A área do quadrado: %.3f%n", quadrado);
		System.out.printf("A área do retangulo: %.3f%n", retangulo);

		sc.close();
	}

}
//Exercicio 01
//Scanner sc = new Scanner(System.in);
//System.out.println("Digite um número: ");
//int a;
//a = sc.nextInt();
//
//System.out.println("Digite outro número: ");
//int b;
//b = sc.nextInt();
//
//int resposta;
//resposta = a + b;
//System.out.printf("O resultado da soma dos dois números é: "+ resposta);
//sc.close();

//Exercicio 2
//Scanner sc = new Scanner(System.in);
//System.out.println("Digite o valor do raio: ");
//double raio;
//raio = sc.nextDouble();
//
//double pi;
//pi = 3.14159;
//
//double area;
//area = pi * (raio * raio);
//
//System.out.printf("O valor da área é: %.4f%n", area);
//
//sc.close();

//Exercicio 3
//Scanner sc = new Scanner(System.in);
//int a, b, c, d, diferenca;
//System.out.println("Digite o 1° número inteiro: ");
//a = sc.nextInt();
//System.out.println("Digite o 2° número inteiro: ");
//b = sc.nextInt();
//System.out.println("Digite o 3° número inteiro: ");
//c = sc.nextInt();
//System.out.println("Digite o 4° número inteiro: ");
//d = sc.nextInt();
//
//diferenca = (a * b - c * d);
//System.out.printf("A diferença entre o produto de (A * B - C * D), é: "+ diferenca);
//sc.close();

// Exercicio 4
//Scanner sc = new Scanner(System.in);
//int codigo, horas;
//double valor, salario;
//System.out.println("Digite o código de funcionário: ");
//codigo = sc.nextInt();
//System.out.println("Insira a quantidade de horas trabalhadas pelo funcionário: ");
//horas = sc.nextInt();
//System.out.println("Insira o valor pago por hora: ");
//valor = sc.nextDouble();
//
//salario = valor * horas;
//
//System.out.printf("Código do Funcionário: "+ codigo);
//System.out.println("");
//System.out.printf("Salario: R$%.2f%n", salario);
//sc.close();

//Exercicio 5 
//Scanner sc = new Scanner(System.in);
//int cod1, cod2, qtde1, qtde2 ;
//double valor1, valor2, valor_pagar;
//
//System.out.println("Digite o código do primeiro produto: ");
//cod1 = sc.nextInt();
//System.out.println("Digite o quantidade do primeiro produto: ");
//qtde1 = sc.nextInt();
//System.out.println("Digite o valor unitário do primeiro produto: ");
//valor1 = sc.nextDouble();
//
//System.out.println("");
//System.out.println("Digite o código do segundo produto: ");
//cod2 = sc.nextInt();
//System.out.println("Digite o quantidade do segundo produto: ");
//qtde2 = sc.nextInt();
//System.out.println("Digite o valor unitário do segundo produto: ");
//valor2 = sc.nextDouble();
//System.out.println("");
//
//valor_pagar = (qtde1 * valor1) + (qtde2 * valor2);
//
//System.out.printf("Valor total a pagar é: R$%.2f%n", valor_pagar);
//
//sc.close();