package MATH;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GtsLoad {
	String fichier;
	Sommet[] sommets;
	Face[] faces;
	Segment[] segments;

	public GtsLoad(String fichier) {// mettre le chemin du fichier gts
		this.fichier = fichier;
		// fichier = "/home/dowan/workspace/testfiles/src/testfiles/a.gts"
		try {
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String[] tmp = br.readLine().split(" ");

			int l = Integer.parseInt(tmp[0]);
			sommets = new Sommet[l];

			for (int i = 0; i < l; i++) {
				String[] truc = br.readLine().split(" ");
				sommets[i] = new Sommet(Double.valueOf(truc[0]),
						Double.valueOf(truc[1]), Double.valueOf(truc[2]));
			}
			l = Integer.parseInt(tmp[1]);
			segments = new Segment[l];
			for (int i = 0; i < l; i++) {
				String[] trac = br.readLine().split(" ");
				segments[i] = new Segment(sommets[Integer.parseInt(trac[0])],
						sommets[Integer.parseInt(trac[1])]);
			}
			l = Integer.parseInt(tmp[2]);
			faces = new Face[l];
			for (int i = 0; i < l; i++) {
				String[] troc = br.readLine().split(" ");
				faces[i] = new Face(segments[Integer.parseInt(troc[0])],
						segments[Integer.parseInt(troc[1])],
						segments[Integer.parseInt(troc[2])]);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public Sommet[] getSommets() {
		return sommets;
	}

	public Face[] getFaces() {
		return faces;
	}

	public Segment[] getSegments() {
		return segments;
	}

	public void chargerNouveauFichier(String fichier) {
		this.fichier = fichier;
		// fichier = "/home/dowan/workspace/testfiles/src/testfiles/a.gts"
		try {
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String[] tmp = br.readLine().split(" ");

			int l = Integer.parseInt(tmp[0]);
			sommets = new Sommet[l];

			for (int i = 0; i < l; i++) {
				String[] truc = br.readLine().split(" ");
				sommets[i] = new Sommet(Double.valueOf(truc[0]),
						Double.valueOf(truc[1]), Double.valueOf(truc[2]));
			}
			l = Integer.parseInt(tmp[1]);
			segments = new Segment[l];
			for (int i = 0; i < l; i++) {
				String[] trac = br.readLine().split(" ");
				segments[i] = new Segment(sommets[Integer.parseInt(trac[0])],
						sommets[Integer.parseInt(trac[1])]);
			}
			l = Integer.parseInt(tmp[2]);
			faces = new Face[l];
			for (int i = 0; i < l; i++) {
				String[] troc = br.readLine().split(" ");
				faces[i] = new Face(segments[Integer.parseInt(troc[0])],
						segments[Integer.parseInt(troc[1])],
						segments[Integer.parseInt(troc[2])]);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
