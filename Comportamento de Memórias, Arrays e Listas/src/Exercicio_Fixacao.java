
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utilitario.Lista_ExercicioFixacao;

public class Exercicio_Fixacao {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
		N funcionarios. Nao deve haver repetiçãoo de id.
		Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
		Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
		mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
		conforme exemplos.
		Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
		ser mudado livremente. Um salário são pode ser aumentado com base em uma operação de
		aumento por porcentagem dada.*/
		
		Scanner sc = new Scanner(System.in);

		List<Lista_ExercicioFixacao> list = new ArrayList<>();
		
		System.out.print("Quantos funcion�rios voc� que registrar");
		int N = sc.nextInt();
		
		for (int i = 1; i<N; i++) {
			
			System.out.println("Digite o id do funcion�rio " + i);
			Integer id = sc.nextInt();
			
			System.out.println("Digite o nome do funcion�rio" + i);
			String nome = sc.next();
			sc.nextLine();
			
			System.out.println("Digite o sal�rio" + i);	
			Double salario = sc.nextDouble();
		
			Lista_ExercicioFixacao funcionarios = new Lista_ExercicioFixacao(id, nome, salario);
			
			list.add(funcionarios);
			System.out.println(list.toString());	
		
		}
		
		System.out.println("Entre com o id de um funcion�rio");
		
		int idfuncionario = sc.nextInt();
		
	
		Integer pos = position(list, idfuncionario);
		
		if(pos == null) {	
			System.out.println("Esse id n�o existe");
		}
		else {
			System.out.println("Entre com a porcentagem de aumento");
			
			double aumento = sc.nextDouble();
			list.get(pos).aumentarsalario(aumento);
		}
		
		System.out.println("Lista de funcion�rios:");
		
		sc.close();

	}
	
	public static Integer position(List<Lista_ExercicioFixacao> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
			return i;
		}
	
	}
		return null;
}

}