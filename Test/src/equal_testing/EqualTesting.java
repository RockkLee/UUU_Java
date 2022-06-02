package equal_testing;

public class EqualTesting {
	public static void main(String[] args) {
		String str1 = "1";
		String str2 = "1";
		System.out.println(str1 == str2);
		
		String new_str1 = new String("2");
		String new_str2 = new String("2");
		System.out.println( new_str1==new_str2 );
		System.out.println(new_str1.equals(new_str2));
		
	}
}
