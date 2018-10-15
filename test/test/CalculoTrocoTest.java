package test;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import Controller.CalculoTroco;
import Controller.Troco;

public class CalculoTrocoTest {

	@Test(expected=Exception.class)
	public void quando_validarSeValorEtradaMenorPrecoProduto_deveRetornarException() throws Exception {
		CalculoTroco cal = new CalculoTroco();
		cal.calcular(1000.0F, 2000.0F);
	}
	
	@Test
	public void validarSeValorEtradaMaiorPrecoProduto() throws Exception {
		CalculoTroco cal = new CalculoTroco(); 
		Troco t = cal.calcular(50.00F, 25.00F);
		int teste[] = new int[] {0,0,1,0,1,0};
		Assert.assertTrue(Arrays.equals(t.getTotalNotas(), teste));
	}

}
