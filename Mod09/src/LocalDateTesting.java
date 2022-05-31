import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTesting {
	public static void main(String[] args) {
		System.out.println("BirthDate: \n");
		
		LocalDate birhDate = LocalDate.of(1999, 1, 3);
		
		int birthYear = birhDate.getYear();
		System.out.println("year: " + birthYear);							//year: 1999
		
		int birthDateOfWeek = birhDate.getDayOfWeek().getValue();
		System.out.println("week: " + birthDateOfWeek);						//week: 7
		
		int age = Period.between( birhDate, LocalDate.now() ).getYears();
		System.out.println( "age: " + age );								//age: 23
		
		
		
		System.out.println("\n\n==================================================================\n\n");
		
		
		
		LocalDate today = LocalDate.now();
		
		String str_week_of_yesterday = today.plusDays(-1).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
		System.out.println( "昨天是星期(str): " + str_week_of_yesterday );				//昨天是星期(str): 星期三
		
		int num_week_of_yesterday = today.plusDays(-1).getDayOfWeek().getValue();
		System.out.println( "昨天是星期(num): " + num_week_of_yesterday );				//昨天是星期(num): 3
		
	}
}
