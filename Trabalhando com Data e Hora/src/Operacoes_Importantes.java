import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Operacoes_Importantes {

	public static void main(String[] args) {

	
		LocalDate dat1 = LocalDate.parse("2022-08-19");
		LocalDateTime dat2 = LocalDateTime.parse("2022-08-19T11:08:40");
		
		Instant dat3 = Instant.parse("2022-08-19T11:08:40Z");
		
		//Transformando o Instant em data local
		LocalDate r1 = LocalDate.ofInstant(dat3, ZoneId.systemDefault());
		System.out.println("r1 = " + r1);
		
		//Transformar o Instant em data local que quiser
		LocalDate r2 = LocalDate.ofInstant(dat3, ZoneId.of("Portugal"));
		System.out.println("r2 = " + r2);
		
		//Transformar o Instant em data e hora local 
		LocalDateTime r3 = LocalDateTime.ofInstant(dat3, ZoneId.systemDefault());
		System.out.println("r3 = " + r3);
		
		//Transformar o Instant em data e hora local que quiser
		LocalDateTime r4 = LocalDateTime.ofInstant(dat3, ZoneId.of("Portugal"));
		System.out.println("r4 = " + r4);
	
		//
		
		System.out.println("Pegar o dia do m�s" + dat1.getDayOfMonth());
		System.out.println("Pegar o m�s" + dat1.getMonthValue());
		System.out.println("Pegar o ano" + dat1.getYear());
		System.out.println("Pegar a hora" + dat2.getHour());

	}

}
