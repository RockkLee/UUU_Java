import java.time.LocalDate;
import java.time.Period;

public class LocalDateTesting {
	public static void main(String[] args) {
		LocalDate birhDate = LocalDate.of(1999, 1, 3);
		int age = Period.between( birhDate, LocalDate.now() ).getYears();
		System.out.println( age );
	}
}
