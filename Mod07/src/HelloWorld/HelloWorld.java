package HelloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Eclipse 有夠複雜");
		ObjectTest method_test = new ObjectTest(123);
		System.out.println("get_var1: " + method_test.getVar1());
		System.out.println("instance_num: " + ObjectTest.instanceNum);
		
		
		
	}
}

class ObjectTest {
	public static int instanceNum = 0;
	private int var1;
	
	public ObjectTest(int var1) {
		ObjectTest.instanceNum++;
		
		this.var1 = var1;
		System.out.println("object started");
	}
	
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	
}
