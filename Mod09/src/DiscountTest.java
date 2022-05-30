import java.awt.event.InputEvent;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiscountTest {
	public static void main(String[] args) {
		boolean flag = true;
		int discount = 0;
		in:
		while ( flag ) {
			try {
				//input
				System.out.println("Enter discount:");
				Scanner input =  new Scanner(System.in);
				String readInput = input.next();
				
				
				// filter
				if (readInput.equals("exit") ) {
					System.out.println("<<<<system closed>>>>");
					return;
				}
				discount = Integer.valueOf(readInput);
				if ( discount > 100 || discount<0) {
					throw new InputMismatchException();
				}
				
				
				flag = false;
			} 
			catch (Exception e) {
				System.out.println("invalid input");
				continue in; // get_exception => jmp back to loop
			}

		}
		
		
		System.out.println("\n\nequal to\n\n");
		
		System.out.println( (100 - discount) + "% off" );
		
		System.out.println("<<<<system closed>>>>");
	}
}
