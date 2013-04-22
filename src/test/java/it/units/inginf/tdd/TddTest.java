package it.units.inginf.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TddTest {
	
	/**
	 * TODO:
	 * moltiplicazione
	 */

//	@Test
//	public void testMultiplication(){
//		Dollar five = new Dollar(5);
//		five.times(2);
//		assertEquals(10, five.amount);
//		
//		Dollar four = new Dollar(4);
//		four.times(3);
//		assertEquals(12, four.amount);
//	}
	
	/**
	 * TODO:
	 * amount privato!
	 * effetto collaterale della moltiplicazione
	 * decimali??
	 */

	// side effect - tentativo #1
//	@Test
//	public void testMultiplication2(){
//		Dollar five = new Dollar(5);
//		five.times(2);
//		assertEquals(10, five.amount);
//		five.times(3);
//		assertEquals(15, five.amount);
//	}

	// side effect - tentativo #2
//	@Test
//	public void testMultiplication3(){
//		Dollar five = new Dollar(5);
//		Dollar product = five.times(2);
//		assertEquals(10, product.amount);
//		product = five.times(3);
//		assertEquals(15, product.amount);
//	}

//	// amount privato? - primo passo: equals
//	@Test
//	public void testEquality(){
//		assertTrue(new Dollar(5).equals(new Dollar(5)));
//		assertFalse(new Dollar(5).equals(new Dollar(6)));
//	}
	
	// add todo: equal null
	// add todo: equal other object
	
	// amount privato? - secondo passo
//	@Test
//	public void testMultiplication4(){
//		Dollar five = new Dollar(5);
//		Dollar product = five.times(2);
//		assertEquals(new Dollar(10), product);
//		product = five.times(3);
//		assertEquals(new Dollar(15), product);
//	}
}
