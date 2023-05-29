package N2E1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
public static void main (String args[]) {
	
	List<String> llista = new ArrayList<String> (Arrays.asList("Ana","Pau","Joan","Ada","Ann","Pep","Juan","Alberto","Luis","Josefina","Domi","Pilar","Maria","Dolores","Apapulcio","Joserra","Atin","Ana","Pere"));
	
	
	Noms noms = (List<String> l) ->{
		List<String> L = new ArrayList<String>();
		for (String i : l) {
			if (i.charAt(0) == 'A') {
				if (i.length()<=3) {
					L.add(i);
				}
			}
		}
		return L;
	};
	
	
	System.out.println(llista);
	llista = noms.noms(llista);
	System.out.println(llista);
	
	
	
	
}
}
