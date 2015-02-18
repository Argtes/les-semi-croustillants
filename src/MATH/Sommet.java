package MATH;

public class Sommet {
	private float x, y, z;
	private int nom;

	public Sommet(float x, float y, float z, int nom) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.nom = nom;
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
	
	public int getNom(){
		return this.nom;
	}
	
	public void Setnom(int nom){
		this.nom = nom;
	}
	
}
