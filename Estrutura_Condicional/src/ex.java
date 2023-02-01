import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
		 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/
	
		int codigo = sc.nextInt(); 
		int codigo2 =sc.nextInt();
		
		int preco = 4;
		int preco2 = 5;
		
		int soma = preco + preco2;
		
		if (codigo ==1 && codigo2 == 2) {
			System.out.println("Total: R$ " + soma );
			}
		else {
			System.out.println("Total: R$ " + "Digite um c�digo v�lido" );
		}
		
		sc.close();
	}

}
