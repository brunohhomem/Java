import java.util.Scanner;

public class exercicios02 {

	public static void main(String[] args) {
//		EXERCICIO 1
		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
	
		if (numero < 0) {
			System.out.println("O número é NEGATIVO.");
		} else {
			System.out.println("O número é POSITIVO.");
		}
	
		sc.close();
	}
}

//EXERCICIO 1
//	int numero;
//'
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Digite um número: ");
//	numero = sc.nextInt();
//
//	if (numero < 0) {
//		System.out.println("O número é NEGATIVO.");
//	} else {
//		System.out.println("O número é POSITIVO.");
//	}
//
//	sc.close();

//EXERCICIO 2
//int numero;
//
//Scanner sc = new Scanner(System.in);
//System.out.println("Digite um número: ");
//numero = sc.nextInt();
//
//if (numero % 2 == 0) {
//	System.out.println("O número é par.");
//} else {
//	System.out.println("O número é impar.");
//}
//
//sc.close();

//Exercicio 3
//int n1, n2;
//Scanner sc = new Scanner(System.in);
//System.out.println("Digite o primeiro número: ");
//n1 = sc.nextInt();
//
//System.out.println("Digite o segundo número: ");
//n2 = sc.nextInt();
//
//if (n1 % n2 == 0 || n2 % n1 == 0) {
//	System.out.println("São multiplos.");
//} else {
//	System.out.println("Não são multiplos.");
//}
//
//sc.close();

// Exercicio 4
//int horaInicio, horaFim, duracao;
//Scanner sc = new Scanner(System.in);
//System.out.println("Digite a hora inicial: ");
//horaInicio = sc.nextInt();
//System.out.println("Digite a hora final: ");
//horaFim = sc.nextInt();
//
//if (horaInicio < horaFim) {
//	duracao = horaFim - horaInicio;
//} else {
//	duracao = 24 - horaInicio + horaFim;
//}
//
//System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
//sc.close();


