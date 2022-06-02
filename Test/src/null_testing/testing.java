package null_testing;

public class testing {
	public static void main(String[] args) {
		Product product = new Product();
		
		System.out.println(product);			//sout >> "name: java-book"
		System.out.println(product.hashCode()); //sout >> "1521118594"
		
		product = null;
		System.out.println(product);			//sout >> "null"
		System.out.println(product.hashCode()); //sout >> "NullPointerException"
	}
}


class Product {
	public String name = "java-book";
	

	@Override
	public String toString() {
		String str = "";
		str = str + "name: " + name;
		return str;
	}
}
