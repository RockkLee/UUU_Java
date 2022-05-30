package typeOfVars;

import java.text.NumberFormat;
import java.util.Locale;

public class FloatingPointTypes {
	
	public static void main(String[] args) {
		NumberFormat numFormat = NumberFormat.getInstance();
		numFormat.setMaximumFractionDigits(2);
		numFormat.setMaximumIntegerDigits(1);
		
		double variable = 123456.123456789;
		String variable_format = numFormat.format(variable);
		System.out.println(variable_format);
		
		NumberFormat_diff_language();

		
		
	}
	
	static void NumberFormat_diff_language() {
		//各國的NumberFormat
		NumberFormat num_language = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		num_language.setMaximumFractionDigits(2);
		num_language.setMaximumIntegerDigits(1);
		
		double variable = 123456.123456789;
		String variable_format = num_language.format(variable);
		System.out.println(variable_format);
	}
	
}
