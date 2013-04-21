package it.units.inginf.shapes;

public class Square {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int area() {
		return side * side;
	}

	public boolean isEmpty() {
		return side == 0;
	}
}
