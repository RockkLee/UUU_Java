public class ComplieTimeError_Testing {
	public static void main(String[] args) {
		int quantity = 10;
		int discount = 10;
		double price = 120;
		
		double amount = price * quantity * ( 100 - discount ) / 100;
		
		System.out.println(amount);
		
	}
}
