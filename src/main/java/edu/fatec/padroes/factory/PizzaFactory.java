package edu.fatec.padroes.factory;

public class PizzaFactory {

	public static Pizza createPizza(PizzaEnum pizzaEnum) {
		
		Pizza pizza = null;
		
		if(pizzaEnum.equals(PizzaEnum.CALABRESA)) {
			
			Borda borda = new Borda();
			borda.setTipo("Cheddar");
			
			pizza = new PizzaCalabresa(borda);
		}else if(pizzaEnum.equals(PizzaEnum.MARGARITA)) {
			
			Borda borda = new Borda();
			borda.setTipo("Chocolate branco");
			pizza = new PizzaMargarita(borda);
		}
		
		return pizza;
	}
}
