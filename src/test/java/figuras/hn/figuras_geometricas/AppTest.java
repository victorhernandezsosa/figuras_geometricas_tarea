package figuras.hn.figuras_geometricas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	
	@Test
	public void TestCirculo() {
		double radio=3.0;
		double resultado=App.calcularcirculo(radio);
		double area= Math.PI * Math.pow(radio, 2);
		assertEquals(resultado,area,.0001);
	}
    
	@Test
	public void TestCirculo2() {
		double radio= -2.5;
		Double resultado=App.calcularcirculo(radio);
		assertNull(resultado);	
	}
	
	@Test
	public void TestCirculo3() {
		double radio=0.0;
		double resultado=App.calcularcirculo(radio);
		assertTrue(resultado == 0.0);
	}
	
	@Test
	public void TestCuadrado() {
		double lado=4.0;
		double resultado=App.calcularcuadrado(lado);
		double area= lado * lado;
		assertEquals(area,resultado,.0001);
	}
	
	@Test
	public void TestCuadrado2() {
		double lado=0.0;
		double resultado=App.calcularcuadrado(lado);
		assertTrue(resultado == 0);
	}
	
	@Test
	public void TestCuadrado3() {
		double lado=-4.0;
		Double resultado=App.calcularcuadrado(lado);
		assertNull(resultado);
	}
	
	@Test
	public void TestRectangulo() {
		double base=4.0;
		double altura= 6.0;
		double resultado=App.calcularrectangulo(base,altura);
		double area= base * altura;
		assertEquals(area,resultado,.0001);
	}
	
	@Test
	public void TestRectangulo2() {
		double base=-2.0;
		double altura= 6.0;
		Double resultado=App.calcularrectangulo(base,altura);
		assertNull(resultado);
	}
	
	@Test
	public void TestRectangulo3() {
		double base=4.0;
		double altura= 0.0;
		double resultado=App.calcularrectangulo(base,altura);
		assertTrue(resultado == 0.0);
	}
	
	@Test
	public void TestTriangulo() {
		double base=9.0;
		double altura= 5.0;
		double resultado=App.calcularTriangulo(base,altura);
		double area = (base * altura)/2;
		assertEquals(area,resultado,.0001);
	}
	
	@Test
	public void TestTriangulo2() {
		double base=7.0;
		double altura= -8.0;
		Double resultado=App.calcularTriangulo(base,altura);
		assertNull(resultado);
	}
	
	@Test
	public void TestTriangulo3() {
		double base=9.0;
		double altura= 0.0;
		double resultado=App.calcularTriangulo(base,altura);
		assertTrue(resultado == 0);
	}
	
}
