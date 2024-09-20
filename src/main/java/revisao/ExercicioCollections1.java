package revisao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ExercicioCollections1 {

	public static void main(String...strings) {
		
		Scanner scanner = new Scanner(System.in);
		
		Map<Integer, Integer> numeros = new HashMap<Integer, Integer>();
		
		int valor = 0;
		
		while(valor != -1) {
			System.out.println("Digite valorzinho: ");
			
			valor = scanner.nextInt();
			
			numeros.put(valor, (numeros.getOrDefault(valor, 0) + 1));
		}
		
		System.out.println("Numero | Quantidade");
		for(Entry<Integer, Integer> entry : numeros.entrySet()) {
			System.out.println(entry.getKey() + "    | " + entry.getValue());
		}
	}
}
