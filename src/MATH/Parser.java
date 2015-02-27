package MATH;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Parser {
	String fichier = "";

	public Parser(String fichier) {
		this.fichier = fichier;
	}

	public boolean verificationBonNombreLigne() {
		int a = 0;
		int l = 0;
		try {
			String s = fichier;
			InputStream ips = new FileInputStream(s);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String[] tmp = br.readLine().split(" ");
			l = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1])
					+ Integer.parseInt(tmp[2]);
			while (br.readLine() != null) {
				a++;
			}
		} catch (Exception e) {
		}
		if (a == l) {
			return true;
		}
		return false;
	}

	public boolean PointsPossible() {
		try {
			String s = fichier;
			InputStream ips = new FileInputStream(s);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String[] tmp = br.readLine().split(" ");
			int[] nb = { Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]),
					Integer.parseInt(tmp[2]) };
			for (int i = 0; i < nb[0]; i++) {
				tmp = br.readLine().split(" ");
				for (int j = 0; j < tmp.length; j++) {
					if (Integer.parseInt(tmp[j]) > nb[0]) {
						return false;
					}
				}
			}
			for (int i = 0; i < nb[1]; i++) {
				tmp = br.readLine().split(" ");
				for (int j = 0; j < tmp.length; j++) {
					if (Integer.parseInt(tmp[j]) > nb[1]) {
						return false;
					}
				}
			}
			for (int i = 0; i < nb[2]; i++) {
				tmp = br.readLine().split(" ");
				for (int j = 0; j < tmp.length; j++) {
					if (Integer.parseInt(tmp[j]) > nb[2]) {
						return false;
					}
				}
			}
		} catch (Exception e) {
		}
		return true;
	}
	
	public boolean testFichier(){
		return (PointsPossible() && verificationBonNombreLigne());
	}

}
