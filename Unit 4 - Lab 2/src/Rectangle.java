
public class Rectangle {
	private double length;
	private double width;
	
	//constructor
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	//methods
	public double getPerimeter() {
		return(width + width +length+length);
	}
	
	public double getArea() {
		return(width *length);
	}
	public double getDiagonal() {
		return(width*length/2);
	}
	
}
