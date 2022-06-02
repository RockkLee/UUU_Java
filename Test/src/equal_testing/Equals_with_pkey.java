package equal_testing;

public class Equals_with_pkey {
	public static void main(String[] args) {
		Table_equals_without_pkey t_without_pkey1 = new Table_equals_without_pkey(0);
		Table_equals_without_pkey t_without_pkey2 = new Table_equals_without_pkey(0);
		System.out.println(t_without_pkey1);
		System.out.println(t_without_pkey2);
		System.out.println(t_without_pkey1.equals(t_without_pkey2));
		//sout >> false
		
		Table_equals_with_pkey t_with_pkey1 = new Table_equals_with_pkey(0);
		Table_equals_with_pkey t_with_pkey2 = new Table_equals_with_pkey(0);
		System.out.println(t_with_pkey2.equals(t_with_pkey2));
		//sout >> true
	}
	

}



class Table_equals_without_pkey {
	int id;
	
	//Constructor
	public Table_equals_without_pkey(int id) {
		this.id = id;
	}
	
}

class Table_equals_with_pkey {
	int id;
	
	//Constructor
	public Table_equals_with_pkey(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Table_equals_with_pkey))
			return false;
		Table_equals_with_pkey other = (Table_equals_with_pkey) obj;
		if (id != other.id)
			return false;
		return true;
	}
}