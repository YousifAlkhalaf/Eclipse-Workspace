package Assignment1;

public class RectangleRunner {
	public static void main(String[] args) {

		// Let's make some Rectangles!

		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(2, 6);
		Rectangle r3 = new Rectangle(5);

		// Testing the Rectangle methods

		System.out.println("The area of the first rectangle is " + r1.getArea());
		System.out.println("The perimeter of the second rectangle is " + r2.getPerimeter());
		System.out.println("The area of a circle circumscribed around the third rectangle is " + r3.getAreaofCircle());

		// Changing the width of the second rectangle
		r2.setWidth(4);
		System.out.println("The perimeter of the second rectangle is " + r2.getPerimeter());
	}

}
