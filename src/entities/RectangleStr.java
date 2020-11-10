package entities;

public class RectangleStr {
	
	public double height;
	public double width;
	
	public double area() {
		
		return (height * width);
	}
	
	public double perimeter() {
		
		return (height + height + width + width);
		
	}
	
	public double diagonal() {
		
		return (Math.sqrt(height*height + width*width));
		
	}
	
	public String toString() {
		
		return String.format("%.2f", width) 
			+ ", "
			+ String.format("%.2f", height)
			+ ", area: "
			+ String.format("%.2f", area())
			+ ", perimeter: "
			+ String.format("%.2f", perimeter())
			+ ", diagonal: "
			+ String.format("%.2f", diagonal());
		
	}
	
}
