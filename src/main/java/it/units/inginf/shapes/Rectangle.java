package it.units.inginf.shapes;

public class Rectangle {
	
	int height, width;
	
	public Rectangle(int height, int width){
		this.height = height;
		this.width = width;
	}

	public int area() {
		return height * width;
	}

	public boolean isEmpty(){
		return area() == 0;
	}
}
