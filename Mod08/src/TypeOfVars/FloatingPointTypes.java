package TypeOfVars;

import java.text.NumberFormat;

public class FloatingPointTypes {
	static NumberFormat numFormat = NumberFormat.getInstance();
	public static void main(String[] args) {
		
		numFormat.setMaximumFractionDigits(2);
		numFormat.setMaximumIntegerDigits(1);
		
		double variable = 123456.123456789;
		String variable_format = numFormat.format(variable);
		System.out.println(variable_format);
	}
	
}
