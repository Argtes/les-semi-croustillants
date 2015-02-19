package MATH;

public class Segment {
	private Sommet s1, s2;
	
	public Segment(Sommet s1, Sommet s2){
		this.s1 = s1;
		this.s2 = s2;
	}

	public Sommet getP1() {
		return s1;
	}

	public Sommet getP2() {
		return s2;
	}
	
	public Sommet[] getSommet(){
		Sommet[] tab = {s1, s2};
		return tab;
	}
}
