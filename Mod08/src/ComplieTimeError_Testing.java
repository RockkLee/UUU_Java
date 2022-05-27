import java.io.IOException;
import java.util.Scanner;

public class ComplieTimeError_Testing {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		int prize = 120;
		int discount = 10;
		int actual_prize = prize * discount;
		
		System.out.println("type quantity: ");
		int quantity = input.nextInt();
		
		System.out.println("\n\n\n");
		System.out.println("定價: " + prize);
		System.out.println("折扣: " + (100 - discount) );
		System.out.println("售價: " + prize * (100 - discount)/100);
		System.out.println("購買數量: " + quantity);
		System.out.println("折扣前總金額: " + ( quantity * prize ) );
		System.out.println("折扣後總金額: " + ( quantity * prize *(100 - discount)/100 ) );
		
	}
}
