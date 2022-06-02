import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RecursionTesting {
	public static void main(String[] args) {
		System.out.println("\n\n" + new Solution().fractionToDecimal(4, 333) );
		
		
	}
}

class Solution {
	public String fractionToDecimal(int numerator, int denominator) {
		String str = "";
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		if ( numerator % denominator == 0 ) {
			return numerator/denominator + "";
		}
		
		int integer = numerator / denominator;
		str = integer + ".";
		int mod = numerator % denominator;	
		map.put( mod ,  mod );
		mod = mod*10;
		
		System.out.println(map.get(mod));
		while ( mod !=0 && !map.containsKey(mod) ) {
			str = str + mod/denominator;
			mod = mod % denominator;
			map.put( mod ,  mod );
			mod *= 10;
			
			System.out.println(str);
		}
		return str;
	}
}