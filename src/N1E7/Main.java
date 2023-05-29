package N1E7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		
		List<String> llista = new ArrayList<String>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setermbre", "Octubre", "Novembre", "Desembre", "643", "0", "42"));
		
		
		llista.sort(Comparator.comparing(String::length).reversed());
		
		
		System.out.println(llista);

	}
}
