package base;

import org.junit.jupiter.api.Assertions;

class Test {

	@org.junit.jupiter.api.Test
	void testSolicitarPermiso() {
		
		Principal prin = new Principal();
		Assertions.assertTrue(prin.solicitarPermiso(90));
		Assertions.assertFalse(prin.solicitarPermiso(20));
	}

}
