package Assignment1;

public class TriangleRunner {
	public static void main(String[] args) {
		
		int x1 = 3, y1 = 4, x2 = 10, y2 = 12, x3 = 5, y3 = 10; 
		Triangle t1 = new Triangle (x1,y1,x2,y2,x3,y3);
		
		double s1 = t1.getSideLength(x1, y1, x2, y2);
		double s2 = t1.getSideLength(x2, y2, x3, y3);
		double s3 = t1.getSideLength(x3, y3, x1, y1);
		
		double a1 = t1.getCornerAngle(s1, s2, s3);
		double a2 = t1.getCornerAngle(s2, s3, s1);
		double a3 = t1.getCornerAngle(s3, s1, s2);
		
		System.out.printf("Sides|Side Length\n-----+-----------\n");
		System.out.printf("  1  |   %.2f    \n", s1);
		System.out.printf("  2  |   %.2f    \n", s2);
		System.out.printf("  3  |   %.2f    \n\n", s3);
		System.out.printf("Angle|Angle Degree\n-----+------------\n");
		System.out.printf("  1  |   %.2f    \n", a1);
		System.out.printf("  2  |   %.2f    \n", a2);
		System.out.printf("  3  |   %.2f    \n\n", a3);
		System.out.printf("Perimeter: %.2f units\n", t1.getPerimeter(s1,s2,s3));
		System.out.printf("Area: %.2f units\n", t1.getArea(s1,s2,s3));
		
	}
}
