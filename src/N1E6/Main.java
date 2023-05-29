package N1E6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		
		List<String> llista = new ArrayList<String>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setermbre", "Octubre", "Novembre", "Desembre", "1", "6", "643", "4", "20"));
		
		
		llista.sort(Comparator.comparing(String::length));
		
		
		System.out.println(llista);

	}
}
