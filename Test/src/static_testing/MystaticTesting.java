package static_testing;

public class MystaticTesting {
	public static void main(String[] args) {
		System.out.println(Mystatic.i);
		System.out.println(Mystatic.str);
		
		Mystatic mystatic = new Mystatic(111);
		System.out.println(mystatic.j);

		
	}
}
