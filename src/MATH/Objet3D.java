package MATH;

import java.util.ArrayList;

public class Objet3D {
	ArrayList<Face> lface = new ArrayList<Face>();

	public Objet3D(ArrayList<Face> lface) {
		this.lface = lface;
	}

	public void dessiner() {
		projection();
	}

	public void projection() {
		for (int i = 0; i < lface.size(); i++) {
			Segment[] tmpSeg = lface.get(i).getSegment();
			for (int j = 0; j < tmpSeg.length; j++) {
				Sommet[] tmpSom = tmpSeg[j].getSommet();
					
			}
		}
	}

	public void rotation() {

	}

	public void homothetie() {

	}

	public void translation() {

	}

	public void zoom() {

	}
}
