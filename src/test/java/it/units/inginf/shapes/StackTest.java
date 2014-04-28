package it.units.inginf.shapes;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testBasicFeatures() {
		Stack stack = new Stack();
		
		assertTrue(stack.isEmpty());
		
		stack.push("first");
		assertFalse(stack.isEmpty());
		
		String peek = stack.peek();
		assertThat(peek, is("first"));
		assertFalse(stack.isEmpty());
		
		String pop = stack.pop();
		assertThat(pop, is("first"));
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testCorrectOrder() {
		Stack stack = new Stack();
		
		stack.push("first");
		stack.push("second");
		stack.push("third");
		
		assertThat(stack.pop(), is("third"));
		assertThat(stack.pop(), is("second"));
		assertThat(stack.pop(), is("first"));
	}
	
	@Test(expected=NullPointerException.class)
	public void shouldThrowExceptionOnNullInput() {
		Stack stack = new Stack();
		stack.push(null);
	}

	@Test
	public void shouldReturnNullOnEmptyPop() throws Exception {
		Stack stack = new Stack();
		String pop = stack.pop();
		assertThat(pop, is(nullValue()));
	}

	@Test
	public void shouldReturnNullOnEmptyPeak() throws Exception {
		Stack stack = new Stack();
		String peek = stack.peek();
		assertThat(peek, is(nullValue()));
	}
	
}
