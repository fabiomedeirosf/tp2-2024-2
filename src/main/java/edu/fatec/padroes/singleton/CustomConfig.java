package edu.fatec.padroes.singleton;

public class CustomConfig {

	private String applicationName;
	
	private Integer size;
	
	private static CustomConfig instance;
	
	public synchronized static CustomConfig getInstance() {
	
		if(instance == null) {
			instance = new CustomConfig();
		}
		
		return instance;
	}
	
	/**
	 * Construtor privado evita que a classe seja instanciada
	*/
	private CustomConfig() {
		
	}
	
	public String getApplicationName() {
		return applicationName;
	}
	
	public Integer getSize() {
		return size;
	}
	
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	
	
	public void setSize(Integer size) {
		this.size = size;
	}
}
