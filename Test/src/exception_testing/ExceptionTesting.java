package exception_testing;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionTesting {
	public static void main(String[] args) {
		
		//ArithmeticException
		//System.out.println(1/0);
		
		Logger.getLogger("this logger's name").log(Level.WARNING, "你好");
	}
}
