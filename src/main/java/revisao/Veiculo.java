package revisao;

import java.util.Objects;

public class Veiculo {

	private String cor;
	
	private String marca;
	
	private String modelo;
	
	private Integer ano;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Veiculo [cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(modelo, other.modelo);
	}
	
	
	
}
