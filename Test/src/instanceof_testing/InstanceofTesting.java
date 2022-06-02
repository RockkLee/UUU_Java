package instanceof_testing;

public class InstanceofTesting {
	public static void main(String[] args) {
		Integer val_int = 1;
		
		System.out.println(val_int instanceof Object);
		//sout >> true
		System.out.println(val_int.getClass() == new Object().getClass() );
		//sout >> false
	}
}
