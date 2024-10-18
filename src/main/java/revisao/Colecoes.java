package revisao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Colecoes {

	public static void main(String...strings) {
		
		Map<Integer, String> alunos = new HashMap<Integer, String>();
		
		alunos.put(123, "Ellem");
		alunos.put(321, "joao");
		
		System.out.println(alunos.get(123));
		
		alunos.put(123, "dionatan");
		
		System.out.println(alunos.get(123));
		
		for(Entry<Integer, String> m : alunos.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	
	}
}
