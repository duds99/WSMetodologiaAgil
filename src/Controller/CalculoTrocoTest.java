package Controller;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CalculoTrocoTest {

	@Test
	void quando_validarSeValorEtradaMenorPrecoProduto_deveRetornarException() throws Exception {
		CalculoTroco cal = new CalculoTroco();
		assertThrows(Exception.class,
	            ()->{
	            	cal.calcular(1000.0F, 2000.0F);
	            });
	}
	
	@Test
	void validarSeValorEtradaMaiorPrecoProduto() {
		fail("Not yet implemented");
	}

}
