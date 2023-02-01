package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_Parte2 {

	public static void main(String[] args) {
		
//<> = gen�rics, quando coloca o tipo como par�metro, aceita somente Wrraper Classes e importa
	
		
		List<String> list = new ArrayList<>();
	
		list.add("Caique");
		list.add("Eliana");
		list.add("Vera");
		list.add("Ant�nio");
	
		
		list.add(2,"Pais:");
		
		System.out.println(list.size());

		list.remove("Caique");
		
		list.remove(1);

		list.removeIf(listas -> listas.charAt(0) == 'E'); //L�mbida

		for (String listas : list) {
			System.out.println(listas);
		}
		
		System.out.println(list.indexOf("Caique"));
		
		
		List<String> result = list.stream().filter(listas -> listas.charAt(0) == 'V').collect(Collectors.toList()); 
	
	System.out.println(result);
		
	String name = list.stream().filter(listas -> listas.charAt(0) == 'V').findFirst().orElse(null);
	
	System.out.println(name);
	
	
	
	
	}
	
	

}
