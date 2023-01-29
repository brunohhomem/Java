import java.util.Scanner;

public class teste_scanner {

	public static void main(String[] args) {
		System.out.println("Digite seu nome abaixo:");
		Scanner sc = new Scanner(System.in);
		// nome
		String x;
		x = sc.next(); // armazenando a string dentro da var x
		System.out.println("você digitou: " + x);

		// idade
		int y;
		y = sc.nextInt();
		System.out.println("você digitou: " + y);

		sc.close();

	}

}
