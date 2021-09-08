package luchadoresJaponeses;

public class Luchador {

	private int peso, altura;

	public Luchador(int peso, int altura) {
		this.setPeso(peso);
		this.setAltura(altura);
	}

	private double getPeso() {
		return peso;
	}

	private void setPeso(int peso) {
		if (1 <= peso && peso <= 1000000) {
			this.peso = peso;
		}
	}

	private double getAltura() {
		return altura;
	}

	private void setAltura(int altura) {
		if (1 <= altura && altura <= 1000000) {
			this.altura = altura;
		}
	}

	public boolean dominaA(Luchador otro) {
		boolean superaEnAlturaEIgualaEnPeso = this.getAltura() > otro.getAltura() && this.getPeso() == otro.getPeso();
		boolean superaEnPesoEIgualaEnAltura = this.getAltura() == otro.getAltura() && this.getPeso() > otro.getPeso();
		boolean superaEnPesoYEnAltura = this.getAltura() > otro.getAltura() && this.getPeso() > otro.getPeso();
		return (superaEnAlturaEIgualaEnPeso || superaEnPesoEIgualaEnAltura || superaEnPesoYEnAltura);
	}

}
