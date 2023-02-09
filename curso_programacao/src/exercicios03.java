import java.util.Scanner;

public class exercicios03 {

	public static void main(String[] args) {
		// Exercicios 05 - Estrutura While
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int entrada = 0;

		System.out.println("Bem vindo ao posto!");
		System.out.println("Para abastecer, escolha um número: ");
		System.out.println("1 - Alcool | 2 - Gasolina | 3 - Diesel | 4 - Sair");

		Scanner sc = new Scanner(System.in);
		entrada = sc.nextInt();

		while (entrada > 0 && entrada < 5) {
			if (entrada == 1) {
				alcool += 1;
			} else if (entrada == 2) {
				gasolina += 1;
			} else if (entrada == 3) {
				diesel += 1;
			} else if (entrada == 4){
				System.out.println("Muito Obrigado");
				System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
				break;
			} else {
				System.out.println("INVÁLIDO, SELECIONE OUTRA OPÇÃO");
			}
			entrada = sc.nextInt();
		}
		sc.close();
	}
}

//Resolvidos
// Exercicios 03 - Estrutura While
//int senha = 2002;
//
//System.out.println("Digite a senha válida: ");
//Scanner sc = new Scanner(System.in);
//int pass = sc.nextInt();
//
//while (pass != senha) {
//	System.out.println("SENHA INVÁLIDA");
//	pass = sc.nextInt();
//}
//
//System.out.println("Acesso Permitido, bem vindo!");
//
//sc.close();
//}

// Exercicios 04 - Estrutura While
//Scanner sc = new Scanner(System.in);
//
//System.out.println("Sistema de coordenadas...");
//
//System.out.println("Digite a coordenada X: ");
//int x = sc.nextInt();
//
//System.out.println("Digite a coordenada Y: ");
//int y = sc.nextInt();
//
//while (x != 0 && y != 0) {
//	if (x > 0 && y > 0) {
//		System.out.println("Primeiro");
//	} else if (x < 0 && y > 0) {
//		System.out.println("Segundo");				
//	} else if (x < 0 && y < 0) {
//		System.out.println("Terceiro");
//	} else {
//		System.out.println("Quarto");
//	}
//	
//	System.out.println("Digite a coordenada X: ");
//	x = sc.nextInt();
//
//	System.out.println("Digite a coordenada Y: ");
//	y = sc.nextInt();
//}
//
//sc.close();