package polymorphism_testing;

import java.time.LocalDate;
import java.util.Scanner;

public class PolymorphismTesting2 {
	public static void main(String[] args) {
		print(123);
		print(LocalDate.of(1111, 1, 1));
		
	}
	
	static void print(Object o) {
		System.out.println(o.getClass().getName());
		if ( (!(o instanceof String)) && (!(o instanceof Number)) ) {
			System.out.println( "o should be String or Number" );
			return;
		}
		System.out.println(o);
	}
	
	
}
