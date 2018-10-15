package Controller;

import java.util.Arrays;
import java.util.List;

public class CalculoTroco {
	
	private List<Integer> notas = Arrays.asList(100, 50, 20, 10, 5, 1);
	private List<Integer> moedas = Arrays.asList(100, 50, 10, 5, 1);
	
	
	public Troco calcular(Float dinheiro, Float precoProduto) throws Exception {
		
		if(dinheiro < precoProduto) {
			throw new Exception("O preço do produto é maior que o valor pago");
		}
		
	    int qtdNotas;

		Float trocoTotal = (dinheiro - precoProduto);
		Integer trocoNotas = trocoTotal.intValue();
		
		int i = 0;
		int[] qtdNota = new int[] {0,0,0,0,0,0};
		int[] qtdMoeda = new int[] {0,0,0,0,0};
		for(Integer nota : notas) {
			if(trocoNotas >= nota) {
				qtdNotas = trocoNotas / nota;
				trocoNotas = trocoNotas % nota;
				qtdNota[i] = qtdNotas;
				if(trocoNotas == 0) {
					break;
				}
			}	
			i++;
		}
		
		return new Troco(qtdNota, qtdMoeda);
	}
}
