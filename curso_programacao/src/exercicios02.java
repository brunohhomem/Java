import java.util.Scanner;

public class exercicios02 {

	public static void main(String[] args) {
		
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

//Exercicio 5
//int cod, qtde;
//double preco;
//
//Scanner sc = new Scanner(System.in);
//System.out.println("Digite qual produto deseja: ");
//cod = sc.nextInt();
//
//if (cod == 1) {
//	System.out.println("Você escolheu: Cachorro quente.");
//	System.out.println("Digite a quantidade do produto: ");
//	qtde = sc.nextInt();
//	preco = qtde * 4.00;
//	System.out.printf("Total a pagar: R$" + preco);
//} else if (cod == 2) {
//	System.out.println("Você escolheu: Cheese Salada.");
//	System.out.println("Digite a quantidade do produto: ");
//	qtde = sc.nextInt();
//	preco = qtde * 4.50;
//	System.out.printf("Total a pagar: R$" + preco);
//} else if (cod == 3) {
//	System.out.println("Você escolheu: Cheese Bacon.");
//	System.out.println("Digite a quantidade do produto: ");
//	qtde = sc.nextInt();
//	preco = qtde * 5.00;
//	System.out.printf("Total a pagar: R$" + preco);
//} else if (cod == 4) {
//	System.out.println("Você escolheu: Frango Teriyaki.");
//	System.out.println("Digite a quantidade do produto: ");
//	qtde = sc.nextInt();
//	preco = qtde * 6.00;
//	System.out.printf("Total a pagar: R$" + preco);
//} else if (cod == 5) {
//	System.out.println("Você escolheu: Refrigerante.");
//	System.out.println("Digite a quantidade do produto: ");
//	qtde = sc.nextInt();
//	preco = qtde * 2.00;
//	System.out.printf("Total a pagar: R$" + preco);
//} else {
//	System.out.println("Produto indisponível.");
//}
//
//sc.close();
