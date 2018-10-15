package Controller;

public class Troco {
	private int[] totalNotas;
	private int[] totalMoedas;
	public Troco(int[] qtdNota, int[] qtdMoeda) {
		totalNotas = qtdNota;
		totalMoedas = qtdMoeda;
	}
	public int[] getTotalNotas() {
		return totalNotas;
	}
	public void setTotalNotas(int[] totalNotas) {
		this.totalNotas = totalNotas;
	}
	public int[] getTotalMoedas() {
		return totalMoedas;
	}
	public void setTotalMoedas(int[] totalMoedas) {
		this.totalMoedas = totalMoedas;
	}
	
}
