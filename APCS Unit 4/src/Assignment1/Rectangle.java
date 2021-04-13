package Assignment1;

public class Rectangle {
	// first list your attributes (field variables)
	private int length;
	private int width;


	// Now the constructor
	// Set the starting values for the attributes
	public Rectangle(int l, int w) {

		this.length = l; // or you can say length = l;
		this.width = w; // or width = w;
	}

	public Rectangle(int s) {

		this.length = s; // or you can say length = l;
		this.width = s; // or width = w;
	}

	// Example of a getter
	public int getLength() {
		return this.length;
	}

	// Example of a setter
	public void setWidth(int w2) {
		this.width = w2;
	}

	// Method1 getArea - returns the value of the rectangle's area
	public int getArea() {
		return this.length * this.width;
		// could also say return length*width;
	}

	// Method2 getPerimeter
	public int getPerimeter() {
		return 2 * this.length + 2 * this.width;
	}

	// Method3 getAreaofCircle
	public double getAreaofCircle() {
			double diameter = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
			double radius = diameter/2;
			double circleArea = Math.PI * Math.pow(radius, 2);
			return circleArea;
		}

}
