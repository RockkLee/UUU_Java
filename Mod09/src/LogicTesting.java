
public class LogicTesting {
	public static void main(String[] args) {
		String psd = "abcdefghi";
		System.out.println(psd.length()<6 || psd.length()>8);
		System.out.println(psd.length()<6 ^ psd.length()>8);
	}
}
