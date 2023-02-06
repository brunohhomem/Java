import java.util.Scanner;

public class dia_semana {

	public static void main(String[] args) {
		//Switch-Case
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Dia inválido.";
			break;
		}
	sc.close();
	
	System.out.println("Dia da semana: " + dia);
	}

}

// COM IF ELSE
//Scanner sc = new Scanner(System.in);
//int x = sc.nextInt();
//String dia;
//if (x == 1) {
//dia = "domingo";
//}
//else if (x == 2) {
//dia = "segunda";
//}
//else if (x == 3) {
//dia = "terca";
//}
//else if (x == 4) {
//dia = "quarta";
//}
//else if (x == 5) {
//dia = "quinta";
//}
//else if (x == 6) {
//dia = "sexta";
//}
//else if (x == 7) {
//dia = "sabado";
//}
//else {
//dia = "valor invalido";
//}
//System.out.println("Dia da semana: " + dia);
//sc.close();