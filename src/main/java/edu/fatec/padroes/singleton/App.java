package edu.fatec.padroes.singleton;

public class App {

	public static void main(String...strings) {
		
		CustomConfig config1 = CustomConfig.getInstance();
		config1.setApplicationName("FAtec");
		config1.setSize(3000);
		
		System.out.println(config1.getApplicationName() + config1.getSize());
		
		CustomConfig config2 = CustomConfig.getInstance();
		
		System.out.println(config2.getApplicationName() + config2.getSize());

	}
}
