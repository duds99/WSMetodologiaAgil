package Controller;

import java.util.Arrays;
import java.util.List;

public class CalculoTroco {
	
	private List<Integer> notas = Arrays.asList(100, 50, 20, 10, 5, 1);
	private List<Integer> moedas = Arrays.asList(100, 50, 10, 5, 1);
	
	public Integer calcular(Float dinheiro, Float precoProduto) throws Exception {
		if(dinheiro < precoProduto) {
			throw new Exception("O preço do produto é maior que o valor pago");
		}
		
	    int qtdNotas;

		Float trocoTotal = (dinheiro - precoProduto);
		Integer trocoNotas = trocoTotal.intValue();
		
		for(Integer nota : notas) {
			if(trocoNotas >= nota) {
				qtdNotas = trocoNotas / nota;
				trocoNotas = trocoNotas % nota;
				if(qtdNotas >= 1) {
					System.out.println("Total de notas: " + qtdNotas +" de R$" + (float) nota);
				}
			}	
		}
		
		return null;
	}
}
