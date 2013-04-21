package it.units.inginf.shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testArea() {
		Rectangle instance = new Rectangle(2, 5);
		assertEquals(10, instance.area());
	}
	
	@Test
	public void testEmpty(){
		Rectangle empty = new Rectangle(0, 0);
		assertTrue(empty.isEmpty());
	}
}
