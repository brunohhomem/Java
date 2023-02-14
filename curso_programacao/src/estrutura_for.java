import java.util.Scanner;

public class estrutura_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //quantas vezes o for vai disparar
		
		int soma = 0; //iniciando a variavel de soma
		
		for (int i=0; i<N; i++) { //o for vai rodar até que o i (que começa em zero) atinja o msm valor do N
			int x = sc.nextInt(); //recebendo o valor x que será adicionado à variável soma
			soma += x;
		}
		
		System.out.println(soma); //imprime os resultados da váriavel soma
		
		sc.close();
		
	}

}
