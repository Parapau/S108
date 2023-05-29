package N1E3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main (String args[]) {
		List<String> llista = new ArrayList<String>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setermbre", "Octubre", "Novembre", "Desembre"));
		llista.forEach(mes -> System.out.println(mes));
	}
}
