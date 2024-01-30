package lanch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTester {

	public static void main(String[] args) {
		LocalDate lc = LocalDate.now();
		System.out.println(lc);
		
		lc = LocalDate.parse("2024-01-30");
		System.out.println(lc);
		
		lc = LocalDate.parse("29/01/2024",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(lc);
		
		//Formater une date 
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate lc2 =LocalDate.parse("29/01/2024",formater);
		String formated = lc2.format(formater);
		System.out.println(lc2);
		System.out.println(formated);
		
		//--------------------------------------------
		LocalDate ld = LocalDate.parse("2024-01-29");
		System.out.println("date : "+ld);
		String formated2 = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		System.out.println("FULL : "+formated2);
		System.out.println("LONG : "+ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println("MEDIUM : "+ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println("SHORT : "+ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
		
		//----------------------------------------------------
		LocalDate dateNaissBeyonce = LocalDate.of(1981, 9, 4);
		System.out.println(dateNaissBeyonce);
		System.out.println(dateNaissBeyonce.getMonth());
		System.out.println(dateNaissBeyonce.getMonth().getDisplayName(TextStyle.FULL, Locale.GERMAN));
		
		//---------------------------------------------------
		
		LocalDate isnow = LocalDate.now();
		System.out.println(isnow);
		System.out.println(isnow.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN));
		
		//-------------------------------------------- date time  -----------------
		System.out.println("date time");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		String formated3 = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
		System.out.println(formated3);
		
		//------------------ remonter ou soutraire ------
		LocalDate pass = lc.minusDays(8);//soustraire 8 jour dans une date 
		System.out.println("Pass : "+pass);
		
		//---------------------------------
		System.out.println("Exercice");
		for(int i=0;i<11;i++) {
			
		}
		
		
	}
}
