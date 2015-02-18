package MATH;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GtsLoad {
	String fichier = "fichiertexte.txt";
	ArrayList<Segment> segment = new ArrayList<Segment>();
	ArrayList<Sommet> Sommet = new ArrayList<Sommet>();
	ArrayList<Face> Face = new ArrayList<Face>();

	public GtsLoad() {

		try {
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String[] tmp;
			while (true/*br.readLine().split(" ")vérifier que on a 3 éléments pour le sommet*/) {
				tmp =  br.readLine().split(" ");
				Sommet.add(new Sommet(Float.parseFloat(tmp[0]), Float.parseFloat(tmp[1]), Float.parseFloat(tmp[2])));
			}
			while (true /*  vérifier qu'il n'y a que 2 element pour les arretes*/) {
				tmp =  br.readLine().split(" ");
			int i = 0;
			String s;
			while ((s = br.readLine()) != null && compteurDeMot(s) == 3) {
				tmp =  br.readLine().split(" ");
				Sommet.add(new Sommet(Float.parseFloat(tmp[0]), Float.parseFloat(tmp[1]), Float.parseFloat(tmp[2]), i));
				i++;
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public int compteurDeMot(String s){
		String[] i = s.split(" ");
		return i.length;
	}

}
