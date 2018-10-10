package Controller;

import java.util.Arrays;
import java.util.List;

public class CalculoTroco {
	
	private List<Integer> notas = Arrays.asList(10,50,100,5000,1000);
	private List<Integer> moedas = Arrays.asList(1,5,10,25,50);
	
	public Integer calcular(Integer entrada) {
		System.out.println(notas.toString());
		System.out.println(moedas.toString());
		return null;
	}
}
