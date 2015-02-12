package MATH;

public class Sommet {
	private float x, y, z;

	public Sommet(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String toString() {
		return "x : " + x + " y : " + y + " z : " + z;
	}

	public float[] getSommet() {
		float[] tab = { x, y, z };
		return tab;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setZ(float z) {
		this.z = z;
	}

}
