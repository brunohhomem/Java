
public class if_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
	}

}


//double preco = 34.5;
//double desconto;
//if (preco < 20.0) {
//desconto = preco * 0.1;
//}
//else {
//desconto = preco * 0.05;
//}