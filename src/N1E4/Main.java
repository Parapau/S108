package N1E4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {//crec que aixo ja ho havia fet aixi abans
	public static void main (String args[]) {
		List<String> llista = new ArrayList<String>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setermbre", "Octubre", "Novembre", "Desembre"));
		llista.forEach(System.out::println);
	}
	
	
	public static void printejar (String s) {
		System.out.println(s);
	}
}
