package wrapping_testing;

import java.util.HashMap;
import java.util.Map;

public class wrapping_testing {
	public static void main(String[] args) {
		double val_double = 1.5;
		int val_int = 3;
		String double_to_str = String.valueOf( val_double );
		String int_to_str = String.valueOf( val_int );
		
		double str_to_double = Double.parseDouble( "1.5" );
		Integer str_to_int = Integer.parseInt( "1" ); 
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("格子襯衫", 5);
		
		System.out.println(map.get("格子襯衫"));
		
	}
}
