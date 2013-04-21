package it.units.inginf.shapes;

public class Triangle {

	private int base, height;
	
	public Triangle(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	public double area(){
		return base * height / 2;
	}
	
	public boolean isEmpty(){
		return area() == 0.0;
	}
}


