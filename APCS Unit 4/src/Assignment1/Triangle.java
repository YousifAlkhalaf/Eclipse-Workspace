package Assignment1;

public class Triangle {
	private int x1, y1, x2, y2, x3, y3;

	public Triangle (int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	public double getSideLength (int x1, int y1, int x2, int y2) {
		double a = Math.abs(x1+x2);
		double b = Math.abs(y1+y2);
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}
	
	public double getCornerAngle (double s1, double s2, double s3) {
		double step1 = (Math.pow(s3, 2)-Math.pow(s2, 2)-Math.pow(s1, 2))/(-2*s1*s2);
		double angle = Math.acos(step1) * (180/Math.PI);
		return angle;
	}
	
	public double getPerimeter (double s1, double s2, double s3) {
		return s1+s2+s3;
	}
	
	public double getArea (double s1, double s2, double s3) {
		double semiP = (s1+s2+s3)/2;
		double area = Math.sqrt(semiP*(semiP-s1)*(semiP-s2)*(semiP-s3));
		return area;
	}
	
}
