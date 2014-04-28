package it.units.inginf.shapes;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<String> stack = new ArrayList<String>();

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void push(String string) {
		if(string == null) {
			throw new NullPointerException();
		}
		stack.add(string);
	}

	public String peek() {
		return stack.get(stack.size() - 1);
	}

	public String pop() {
		if(!stack.isEmpty()) {
			return stack.remove(stack.size() - 1);
		} 
		return null;
	}

}
