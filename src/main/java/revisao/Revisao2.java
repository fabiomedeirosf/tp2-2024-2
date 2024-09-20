package revisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Revisao2 {

	public static void main(String...strings) {
		
		List<Integer> a = new ArrayList<Integer>();
		
		Map<Integer, String> alunos = new HashMap<>();
		
		alunos.put(9, "joao da silva");
		alunos.put(7, "Maria");
		alunos.put(5, "ana");
		
		System.out.println(alunos.get(9));
		
		alunos.put(9, "pedro");
		System.out.println(alunos.get(9));
		
		//chave que nao existe
		System.out.println(alunos.get(7777));
		
		alunos.remove(7);
		
		for(Entry<Integer, String> e : alunos.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		
	}
}
