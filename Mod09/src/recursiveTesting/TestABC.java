package recursiveTesting;

public class TestABC {
	public static void main(String[] args) {
//		for (int i = 9; i >= 0; i--) {
//			System.out.println(i);
//			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				System.out.println("sleeping");
//				e.printStackTrace();
//			}
//		}
		
		System.out.println("Ans: " + recursion(10));
		

	}
	static int recursion(int n) {
		System.out.println(n-1);
		if ( n == 1 ) {
			return 0;
		}
		
		return 1 + recursion(n-1);
	}
	
}
