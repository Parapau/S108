package N1E8;

public class Main {
	public static void main (String args[]) {
		
		Reverse reversa = (String s) -> {
			String S = "";
			for (int i = s.length() - 1 ; i >= 0 ; i--) {
				S += s.charAt(i);
			}
			return S;
		};
		
		
		System.out.println(reversa.reverse("Les patates estan molt bones, si. . si, sebon tlom naste setatap seL"));
	}
}
