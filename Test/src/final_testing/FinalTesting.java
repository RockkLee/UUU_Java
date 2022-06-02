package final_testing;

public class FinalTesting {
	public static void main(String[] args) {
		
	}
}

class Myclass{
	//blank final attribute
	public final int i;	
	public Myclass(int i) { 
		this.i = i; 
	}
	
	//blank static final attribute
	public final static int j;	
	static {
		j = Integer.getInteger("mydata", 100);
	}
	
}
