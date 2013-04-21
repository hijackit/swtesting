package it.units.inginf.shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptyTriangleTest {

	private Triangle empty;

	@Before
	public void setUp() throws Exception {
		empty = new Triangle(0, 0);
	}

	@Test
	public void testArea() {
		assertEquals(0.0, empty.area(), 0.0);
	}

	@Test
	public void testEmpty() {
		assertTrue(empty.isEmpty());
	}
	
}
