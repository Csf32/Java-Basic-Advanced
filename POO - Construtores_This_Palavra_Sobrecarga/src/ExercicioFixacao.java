import java.util.Locale;
import java.util.Scanner;

import exercicio.Pacote_ExercicioFicaxao;

public class ExercicioFixacao {

	public static void main(String[] args) {
		/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não seré feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo aumenta por meio de depósitos, e se diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Voc êdeve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operaçao.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pacote_ExercicioFicaxao values;
		
	// Insert number of account
		System.out.println("Enter with your account number ");
		int number_of_account = sc.nextInt();
						
						
	// Insert account holder
		System.out.println("Enter with your account holder");
		String account_holder = sc.next();
						
	// Answer if holder will be a initial deposit...
		
		System.out.println("Would you like to do an inital deposit (yes/no)?"); 
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("yes")) {
			
			System.out.println("How much do you would like to deposit?");
			
			double initial_deposit = sc.nextDouble();
			values = new Pacote_ExercicioFicaxao(account_holder, initial_deposit, number_of_account, answer);   
			 
		} 
		else {
			
			double initial_deposit = 0.0;
			values = new Pacote_ExercicioFicaxao(account_holder, initial_deposit, number_of_account, answer);
			
		}
		
	//Account data 
		
		System.out.println("Account data: ");
		System.out.print("Account: ");
		System.out.println(values.toString());
		
		
	// Enter a deposit value:
		
		System.out.println("Enter a deposit value:");
		double depositValue = sc.nextDouble(); 
		values.deposit(depositValue);
		System.out.println("Update:");
		System.out.print(values.toString());
		
	// Enter a withdraw value:
		System.out.println("Enter a deposit value:");
		double withdrawValue = sc.nextDouble(); 
		values.deposit(withdrawValue);
		System.out.println("Update:");
		System.out.print(values.toString());
		
		sc.close();
	}

}
