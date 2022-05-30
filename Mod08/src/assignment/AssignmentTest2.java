package assignment;

import java.math.RoundingMode;

public class AssignmentTest2 {
	public static void main(String[] args) {
		char charData = '1';
		int intData = charData;
		System.out.println( (int) charData);
		System.out.println( String.format(" 49 + 48 = %d", intData + '0' )  );
		
		float price = 12 * 0.8f;
		int rounding = (int) price;
		
		System.out.println(rounding);
		
	}
}
