package MATH;

public class Sommet {
	private double x, y, z;

	public Sommet(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String toString() {
		return "x : " + x + " y : " + y + " z : " + z;
	}

	public double[] getSommet() {
		double[] tab = { x, y, z };
		return tab;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
}
