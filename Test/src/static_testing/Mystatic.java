package static_testing;

public class Mystatic {
	public static int i; // static attribute, class attribute
	public static String str;
	
	public int j; //non-static attribute, object attribute, instance attribute
	
	//類似給 static attributes 使用的 建構子
	static {
		i = Integer.getInteger("mydata_int", 123);
		str = System.getProperty("mydata_str", "...");
	}
	
	//Constructor
	public Mystatic(int j) {
		super();
		this.j = j;
	}

}
