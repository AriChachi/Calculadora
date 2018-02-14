package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RPNJUnitTest {

	@Test
	void resultadoTest() {
		//fail("Not yet implemented");
		RPN calc = new RPN ("-4 5 +");
		assertEquals(calc.resultado(),9.00);
		
		calc = new RPN ("4 5 *");
		assertEquals(calc.resultado(), 20.00);
		
		calc = new RPN ("5 0 / ");
		assertEquals(calc.resultado(), 1);//
		
		calc = new RPN ("4 5 *");
		assertEquals(calc.resultado(), 20.00);
	}

}
