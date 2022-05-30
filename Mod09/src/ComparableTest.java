
public class ComparableTest {
	public static void main(String[] args) {
		Charactor Jin = new Charactor(new Rank(true, true, true, true, true, true));
		Charactor Anna = new Charactor(new Rank(true, false, false, false, false, false));
		
		System.out.println( Jin.compareTo(Anna) );
	}
}








class Charactor implements Comparable<Charactor>{
	Rank rank;
	public Charactor(Rank rank) {
		this.rank = rank;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("combo_damage: " + rank.combo_damage);
		System.out.println("poking: " + rank.poking);
		System.out.println("parry: " + rank.parry);
		System.out.println("low_strings: " + rank.low_strings);
		System.out.println("mid_strings: " + rank.mid_strings);
		System.out.println("mid_strings: " + rank.pressure);
		return super.toString();
	}
	@Override
	public int compareTo(Charactor o) {
		
		return ( this.rank.total() - o.rank.total() );
	}
}


class Rank {
	boolean combo_damage = false;
	boolean poking = false;
	boolean parry = false;
	boolean low_strings = false;
	boolean mid_strings = false;
	boolean pressure = false;
	
	/**
	 * //pass value to constructor:<br/>
	 * //all boolean<br/>
	 * ( combo_damage, poking, parry, low_strings, mid_strings, pressure )<br/>
	 */
	public Rank(boolean combo_damage, boolean poking, boolean parry, boolean low_strings, boolean mid_strings, boolean pressure) {
		this.combo_damage = combo_damage;
		this.poking = poking;
		this.parry = parry;
		this.low_strings = low_strings;
		this.mid_strings = mid_strings;
		this.pressure = pressure;
	}

	public int total() {
		int temp = 0;
		temp = combo_damage ? ++temp : temp;
		temp = poking ? ++temp : temp;
		temp = parry ? ++temp : temp;
		temp = low_strings ? ++temp : temp;
		temp = mid_strings ? ++temp : temp;
		temp = pressure ? ++temp : temp;
		return temp;
	}
	
}