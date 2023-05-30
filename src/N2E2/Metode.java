package N2E2;

import java.util.List;

public class Metode {

	public static String senaritzar (List<Integer> llista) {
		String retorn = "";
		
		Funcio funcio = (i) -> {
			String estrin = "";
			if (i%2 == 0) {
				estrin += ", e" + i;
			} else {
				estrin += ", o" + i;
			}

			return estrin;
		};
		
		
		for (int i : llista) {
			retorn += funcio.senaritzador(i);
		}
		retorn = retorn.replaceFirst(", ", "");
		return retorn;
	}

}
