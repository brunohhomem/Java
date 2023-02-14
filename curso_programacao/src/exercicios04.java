import java.util.Scanner;

public class exercicios04 {

	public static void main(String[] args) {
		// Exercicio 07 - FOR
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		sc.close();
	}
}

// Exercicio 01 - FOR
//Scanner sc = new Scanner(System.in);
//int x = sc.nextInt();
//
//for (int y = 0; x >= y; y++) {
//	if (y % 2 == 1) {
//		System.out.println(y);
//	}
//}
//System.out.println("Fim.");
//;
//
//sc.close();

// Exercicio 02 - FOR
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//int x = 0;
//int in = 0, out = 0;
//
//for (int i = 0; n >= i; i++) {
//	x = sc.nextInt();
//	if (x >= 10 && x <= 20) {
//		in++;
//	} else {
//		out++;
//	}
//}
//System.out.println(in + "in");
//System.out.println(out + "out");
//sc.close();
//}

// Exercicio 03 - FOR
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//
//for (int i=0; i<n; i++) {
//	double a = sc.nextDouble();
//	double b = sc.nextDouble();
//	double c = sc.nextDouble();
//
//	double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
//
//	System.out.printf("%.1f%n", media);
//
//}
//
//sc.close();

// Exercicio 04 - FOR
//Scanner sc = new Scanner(System.in);
//int x = sc.nextInt();
//int i;
//
//for (i = 0; i < x; i++) {
//	double a = sc.nextDouble();
//	double b = sc.nextDouble();
//
//	if (b == 0) {
//		System.out.println("Não é possivel dividir por zero.");
//	} else {
//		double result = a / b;
//		System.out.println(result);
//	}
//
//}
//;
//
//sc.close();

// Exercicio 05 - FOR
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//
//int fat = 1;
//for (int i=1; i<=n; i++) {
//	fat = fat * i;
//}
//
//System.out.println(fat);
//
//sc.close();
//}

//Exercicio 06 - FOR
//Scanner sc = new Scanner(System.in);
//
//int n = sc.nextInt();
//
//for (int i=1; i<=n; i++) {
//	if (n % i == 0) {
//		System.out.println(i);
//	}
//}
//
//sc.close();
//}