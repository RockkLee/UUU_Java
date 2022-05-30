package assignment;

public class AssignmentTest1 {
	public static void main(String[] args) {
		//繼承意義中的向上Casting (Promotion)
			Object str1 = "str"; // 向上轉型不須定義 (String)
		//繼承意義中的向下Casting
			Object str2 = "str";
			String str3 = (String) str2; //向下轉型不須定義 (String)
		
			
			
		//Literals意義中的向上Casting (Promotion)
		//1
			double type_d = 1.0f;		
		//2
			char charData = '0';		//sout = 0		
			int intData = charData;		//sout = 48	
		//Literals意義中的向下Casting
			int i = 255;		//sout = 255
			byte b = (byte) i;	//sout = -1
		
		testing();
			
	}
	static void testing() {
		char charData = '1';
		int intData = charData;
		System.out.println( charData + '0' );
	}

}
