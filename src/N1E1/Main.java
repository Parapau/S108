package N1E1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String args[]) {
		List<String> llista = new ArrayList<String>();
		
		llista.add("Pere");
		llista.add("Josep");
		llista.add("Joana");
		llista.add("Joaquim");
		llista.add("Jaume");
		llista.add("Pedro");
		llista.add("Juan");
		llista.add("Pablo");
		llista.add("Pau");
		llista.add("Oscar");
		llista.add("Andrea");
		
		
		System.out.println(llista);

		llista.removeIf(p -> p.contains("o")||p.contains("O"));

		System.out.println(llista);
	}
}
