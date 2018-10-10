package Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

class CalculoTrocoTest {

	@Test(expected = Exception.class)
	void quando_validarSeValorEtradaMenorPrecoProduto_deveRetornarException() throws Exception {
		CalculoTroco cal = new CalculoTroco();
		cal.calcular(1000, 2000);
	}
	
	@Test
	void validarSeValorEtradaMaiorPrecoProduto() {
		fail("Not yet implemented");
	}

}
