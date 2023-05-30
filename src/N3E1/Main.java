package N3E1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
	public static void main (String args[]) {
		Alumne a1 = new Alumne ("Pere", "PHP", 19, 8);
		Alumne a2 = new Alumne ("Gina", "PHP", 91, 6);
		Alumne a3 = new Alumne ("Anselmo", "PHP", 52, 4);
		Alumne a4 = new Alumne ("Apapulcio", "Java", 17, 9);
		Alumne a5 = new Alumne ("Arnau", "Java", 27, 7);
		Alumne a6 = new Alumne ("Pau", "Java", 22, 2);
		Alumne a7 = new Alumne ("Silvia", "Java", 41, 6);
		Alumne a8 = new Alumne ("Ana", "FullStack", 28, 7);
		Alumne a9 = new Alumne ("Ada", "FullStack", 32, 5);
		Alumne a10= new Alumne ("Jaume", "FullStack", 29, 10);

		List<Alumne> alumnes = new ArrayList<Alumne> (Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10));

		List<Alumne> alumnes2 = null;
		
		
		alumnes.forEach(System.out::println);
		
		alumnes2 = (alumnes.stream().filter(a -> a.getNom().charAt(0) == 'A').collect(Collectors.toList()));
		System.out.println();
		alumnes2.forEach(System.out::println);
		
		
		alumnes2 = (alumnes.stream().filter(a -> a.getNota() >= 5).collect(Collectors.toList()));
		System.out.println();
		alumnes2.forEach(System.out::println);
		
		
		alumnes2 = (alumnes.stream().filter(a -> a.getNota() >= 5 && !a.getCurs().equals("PHP")).collect(Collectors.toList()));
		System.out.println();
		alumnes2.forEach(System.out::println);

		
		alumnes2 = (alumnes.stream().filter(a -> a.getEdat() >= 18 && a.getCurs().equals("Java")).collect(Collectors.toList()));

		alumnes2.forEach(System.out::println);
		
		/*La barabritat que havia fet abans
		alumnes.forEach(System.out::println);
		
		alumnes2.removeIf(p -> p.getNom().charAt(0) == 'A');
		
		alumnes.removeAll(alumnes2);
		
		System.out.println();
		
		alumnes.forEach(System.out::println);
		
		alumnes.addAll(alumnes3);
		alumnes2.addAll(alumnes3);
		
		alumnes2.removeIf(p -> p.getNota() > 5);
		
		alumnes.removeAll(alumnes2);
		
		System.out.println();
		
		alumnes.forEach(System.out::println);
		
		alumnes .addAll(alumnes3);
		alumnes2.addAll(alumnes3);
		
		alumnes2.removeIf(p -> p.getNota() > 5 && !p.getCurs().equals("PHP"));
		
		alumnes.removeAll(alumnes2);
		
		System.out.println();
		
		alumnes.forEach(System.out::println);
		
		alumnes.addAll(alumnes3);
		alumnes2.addAll(alumnes3);
		
		alumnes2.removeIf(p -> p.getEdat() > 17 && p.getCurs().equals("Java"));
		
		alumnes.removeAll(alumnes2);
		
		System.out.println();
		
		alumnes.forEach(System.out::println);
		*/
	}
}
