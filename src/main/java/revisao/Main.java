package revisao;

import java.util.ArrayList;
import java.util.List;

/**
 * Crie uma classe chamada veiculo com os atributos:
 *  - ano;
 *  - marca;
 *  - modelo;
 *  - cor
 *  
 *  Solicite ao usuário informar os dados de 3 veículos e,
 *  exiba-os ao término;
 *  
 *  
 * @author fabio
 *
 */
public class Main {

	public static void main(String... args) {
		
		Veiculo v1 = new Veiculo();
		v1.setAno(2021);
		v1.setCor("vermelho");
		v1.setMarca("fiat");
		v1.setModelo("uno");
		
		Veiculo v2 = new Veiculo();
		v2.setAno(2018);
		v2.setCor("amarelo");
		v2.setMarca("chrevrolet");
		v2.setModelo("corsa");
		
		Veiculo v3 = new Veiculo();
		v3.setAno(2021);
		v3.setCor("Azul");
		v3.setMarca("volks");
		v3.setModelo("gol");
		
		Veiculo v4 = new Veiculo();
		v4.setAno(2021);
		v4.setCor("Azul");
		v4.setMarca("volks");
		v4.setModelo("gol");
		
		List<Veiculo> lista = new ArrayList<Veiculo>();
		lista.add(v1);
		lista.add(v2);
		lista.add(v3);
		lista.add(v4);
		
		lista.forEach(v -> {
			System.out.println(v);
		});
		
		lista.remove(v1);
		
		lista.forEach(v -> {
			System.out.println(v);
		});
		
		if(lista.contains(v4)) {
			System.out.println("lista contem v4");
		}
		
		if(v3.equals(v4)) {
			System.out.println("veiculos iguais");
		} else {
			System.out.println("veiculos difernetes");
		}
		
		
		String a = "fatec mococa";		
		String b = new String("fatec mococa");
		
		System.out.println(a);
		
		System.out.println(b);
		
		if(a.equals(b)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferente");
		}
		
		
		
//		for(int i = 0; i < 1000; i++) {
//			lista.add(v3);
//		}
//		
//		lista.parallelStream().forEach(v -> {
//			String thread = Thread.currentThread().getName();
//			System.out.println(thread + v);
//		});
		
		
//		Veiculo lista[] = new Veiculo[5];
//		lista[0] = v1;
//		lista[1] = v2;
//		lista[2] = v3;
//		
//		for(int i = 0; i < lista.length; i++) {
//			System.out.println(lista[i]);
//		}
		
		
		
		
		
		
		
		
		
	}
}
