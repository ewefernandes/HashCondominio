package model;

public class Morador {
	public String nome;
	public int numApto;
	public String modeloCar;
	public String corCar;
	public String placaCar;
	
	public int hashCode() {
		int pos = numApto % 100;
		return pos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumApto() {
		return numApto;
	}

	@Override
	public String toString() {
		return "Morador [nome = " + nome + "], [apto = " +numApto+ "], [placa = " +placaCar+ "]";
	}
	
	
	
}