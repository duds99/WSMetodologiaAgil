package Controller;

import java.util.Arrays;
import java.util.List;

public class CalculoTroco {
	
	private List<Integer> notas = Arrays.asList(100,50,10,5,1);
	private List<Integer> moedas = Arrays.asList(50,5,10,25,50);
	
	public Integer calcular(Integer dinheiro, Integer precoProduto) throws Exception {
		if(dinheiro < precoProduto) {
			throw new Exception("O preço do produto é maior que o valor pago");
		}
		return null;
	}
}
