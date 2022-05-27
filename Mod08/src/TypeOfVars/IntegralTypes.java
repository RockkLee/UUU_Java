package TypeOfVars;

public class IntegralTypes {
	public static void main(String[] args) {
		// 10進位
		System.out.println("dec:");
		System.out.println( (byte) 127 );
		System.out.println( (byte) 128 );
		
		// 8進位
		System.out.println("\n" + "oct:");
		System.out.println( (byte) 00 );
		System.out.println( (byte) 01 );
		System.out.println( (byte) 010 );
		
		// 16進位
		System.out.println("\n" + "hex:");
		System.out.println( (byte) 0xa );
		System.out.println( (byte) 0xf );
		
		System.out.println("\n\n\n");
		
		
		long overflow = 100 * 100 * 100 * 100 * 100 * 100;
		long not_overflow = 100 * 100 * 100 * 100 * 100 * 100L;
		System.out.println(overflow);
		System.out.println(not_overflow);
	
	
	}
	
	static void bytePrint(byte b) {
		System.out.println(b);
	}
	
	static void intPrint(byte i) {
		System.out.println(i);
	}
	
}