package overloading_testing;

public class OverloadingTesting {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.getClass());
		System.out.println( calculator.plus(1, 1) );
		System.out.println( calculator.plus(2.5, 2) );

	}
}

interface A_plus_B{
	public Number plus(int a, int b);
	public Number plus(double a, double b);
}


class Calculator implements A_plus_B{

	@Override
	public Integer plus(int a, int b) {	return a+b;	}
	
	@Override
	public Double plus(double a, double b) {	return (double)(a+b);	}
	
	
	
}