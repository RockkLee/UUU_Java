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
		
		// 2進位
		System.out.println("\n" + "binary:");
		System.out.println( (byte) 0b0000_0001 );
		System.out.println( (byte) 0b1111_1111 );
		System.out.println( (byte) 0b1000_0000 );
		
		System.out.println("\n\n\n");
		
		
		long overflow = 100 * 100 * 100 * 100 * 100 * 100;
		long not_overflow = 100 * 100 * 100 * 100 * 100 * 100L;
		System.out.println(overflow);
		System.out.println(not_overflow);
	
	
	}
	
}