package edu.fatec.padroes.factory;

public class App {

	public static void main(String...strings) {
		
		Pizza p1 = PizzaFactory.createPizza(PizzaEnum.CALABRESA);
		
		Pizza p2 = PizzaFactory.createPizza(PizzaEnum.MARGARITA);
		
		System.out.println("Pizza 1: " + p1.getNome() + p1.getBorda().getTipo());
		
		System.out.println("Pizza 2: " + p2.getNome());
	}
}
