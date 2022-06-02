package compare_testing;

import java.util.Comparator;

import javax.xml.validation.Validator;

public class CompareTesting {
	public static void main(String[] args) {
		MyComparable comparable_1 = new MyComparable(10);
		MyComparable comparable_2 = new MyComparable(-10);
		
		System.out.println(comparable_1.compareTo(comparable_2));
		
		
		MyComparator comparator_1 = new MyComparator(10);
		MyComparator comparator_2 = new MyComparator(-10);
		
		System.out.println(comparator_1.compare(comparator_1, comparator_2));
		
	}
}


class MyComparable implements Comparable<MyComparable>{
	public int val;

	public MyComparable(int val) {
		this.val = val;
	}

	@Override
	public int compareTo(MyComparable o) {
		if (this.val > o.val)
			return 1;
		if (this.val<o.val) 
			return -1;
		
		return 0;
	}
}

class MyComparator implements Comparator<MyComparator> {
	public int val;

	public MyComparator(int val) {
		this.val = val;
	}

	@Override
	public int compare(MyComparator o1, MyComparator o2) {
		if (o1.val > o2.val)
			return 1;
		if (o1.val<o2.val) 
			return -1;
		
		return 0;
	}
}