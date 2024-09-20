package edu.fatec.revisao.heranca;

public class TesteImposto {

	public static void main(String...strings) {
		
		Imposto imposto = null;
		
		String estado = "ba";
		Double valorVenda = 1000D;
		
		if("mg".equalsIgnoreCase(estado)) {
			imposto = new ImpostoMG();
			
		} else if("ba".equalsIgnoreCase(estado)) {
			
			imposto = new ImpostBA();
		}
		
		System.out.println(imposto.calcularImposto(valorVenda));

		
	}
}
