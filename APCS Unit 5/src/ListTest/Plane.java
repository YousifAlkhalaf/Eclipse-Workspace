package ListTest;

public class Plane {

	private int planeNumber; 
	private double planeX, planeY, landX, landY;

	public Plane (int planeNumber, double planeX, double planeY, double landX, double landY) {
		this.planeNumber = planeNumber;
		this.planeX = planeX;
		this.planeY = planeY;
		this.landX = landX;
		this.landY = landY;
	}
	
	public boolean okayToLand() {
		// m is answer for glide slope formula
		double m = (planeY - landY)/(planeX - landX);
		if (m >= -1.6 && m <= -0.8) {
			return true;
		}
		return false;
	}
	
	public int getPlaneNum() {
		return planeNumber;
	}
}
