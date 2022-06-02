package polymorphism_testing;

public class PolymorphismTesting {
	public static void main(String[] args) {
		Object o = new Object();
		o = new String("123");
		
		String s = new String("123");
		
		
		//toString 在 Object，不用轉型
		System.out.println( o.toString() ); // "123"
		//length 在 String ， 要轉型
		System.out.println( ((String) o).length() ); //"3"	
		//o 為 String 
		System.out.println( o.getClass().getName() );			 //"java.lang.String"
		System.out.println( ((String) o).getClass().getName() ); //"java.lang.String"
		
		
		System.out.println(s.toString());
		System.out.println(s.length());
		
	}
}
