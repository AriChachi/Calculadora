package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.*;
class RPNUnitTest1 {

	@Test
	void testSuma() {
		
		RPN calculoSuma = new RPN ("0 0 +");
		assertEquals(calculoSuma.resultado(), 0.00);
		
		calculoSuma = new RPN ("1 1 +");
		assertEquals(calculoSuma.resultado(), 2.00);
		
	}
	
	@Test
	void testResta() {
		

		RPN calculoResta = new RPN ("1 1 -");
		assertEquals(calculoResta.resultado(), 0.00);
		
		
	}
	
	@Rule 
	public final ExpectedException exception = ExpectedException.none();
	@Test
	void testRestaExcepcion() {
		
		RPN calculoResta = new RPN ("-1 1 -");
		exception.expect(NullPointerException.class);		
		
	}
	
	@Test
	void testDivide() {

		RPN calculoDivide = new RPN ("1 1 /");
		assertEquals(calculoDivide.resultado(), 1.00);
		
		calculoDivide = new RPN ("0 1 /");
		assertEquals(calculoDivide.resultado(), 0.00);
				
		calculoDivide= new RPN ("1 0 /");
		assertEquals(calculoDivide.resultado(), Double.POSITIVE_INFINITY);
		
		calculoDivide= new RPN ("1 5 /");
		assertEquals(calculoDivide.resultado(), 0.20);
		
	}
	
	@Test
	void testMultiplica() {
		

		RPN calculoMultiplica = new RPN ("1 1 *");
		assertEquals(calculoMultiplica.resultado(), 1.00);
		
		calculoMultiplica = new RPN ("1 0 *");
		assertEquals(calculoMultiplica.resultado(), 0.00);		
		
	}
	
	@Test
	void testPotencia() {
		

		RPN calculoPotencia = new RPN ("1 1 ^");
		assertEquals(calculoPotencia.resultado(), 1.00);
		
	}
	
	@Test
	void testPotenciaExcepcion() {
		
		RPN calculoPotencia = new RPN ("-5 2 ^");		
		exception.expect(NullPointerException.class);		
		
	}	
	
	@Test
	void testResto() {		

		RPN calculoResto = new RPN ("0 1 %");
		assertEquals(calculoResto.resultado(), 0.00);
		
		calculoResto = new RPN ("3 2 %");
		assertEquals(calculoResto.resultado(), 1.00);

		calculoResto = new RPN ("1 0 %");
		assertEquals(calculoResto.resultado(), Double.NaN);
	}
	
}
