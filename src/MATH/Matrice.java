package MATH;

import java.util.Random;

public class Matrice {
	float[][] matrice;
	int x;
	int y;

	
	public Matrice(int x, int y) {
		this.x = x;
		this.y = y;
		matrice = new float[y][x];
		Random r = new Random();
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				matrice[i][j] = r.nextInt(10);
			}
		}
	}
	
	public Matrice(int k){
		matrice = new float[k][k];
		
		for(int i = 0; i < k ; i++)
			matrice[i][i] = 1;
	}
	
	
	public Matrice(float[][] values){
		matrice = values;
	}
	
	public void afficher() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice.length; j++) {
				s += matrice[i][j] + " | ";
			}
			s += "\n";
		}
		return s;
	}

	public void set(int x, int y, float val) {
		matrice[x][y] = val;
	}

	public float get(int x, int y) {
		return matrice[x][y];
	}

	public int sizeV() {
		return x;
	}

	public int sizeH() {
		return y;
	}

	public float[][] multiplier(Matrice m1) {
		int x1 = m1.sizeV();
		int x2 = x;
		int y1 = m1.sizeH();
		int y2 = y;
		Matrice res = null;
		if (x2 == y1) {
			res = new Matrice(y2, x1);
			float tempo;
			for (int i = 0; i < x1; i++) {
				for (int j = 0; j < y2; j++) {
					tempo = 0;
					for (int cpt = 0; cpt < 3; cpt++) {
						tempo = tempo + (matrice[j][cpt] * m1.get(cpt, i));
					}
					res.set(i, j, tempo);
				}
			}
		}
		for (int i = 0; i < y; i++) {
			for (int j = 0; i < x; i++) {
				matrice[j][i] = res.get(j, i);
			}
		}
		return matrice;

	}
	
	public static void main(String[] args) {
		Matrice ok = new Matrice(3, 3);
		System.out.println(ok.toString());
		Matrice ok1 = new Matrice(3, 3);
		System.out.println(ok1.toString());
		ok.multiplier(ok1);
		System.out.println(ok);
	}
	
	@Override
	public boolean equals(Object m) {
		if(m instanceof Matrice){
			Matrice m1 = (Matrice) m;
			if(m1.matrice.length == matrice.length 
					&& m1.matrice[0].length == matrice[0].length){
				for(int i =0; i < matrice[0].length;i++){
					for(int j = 0; j < matrice.length;j++){
						if(m1.matrice[i][j] != matrice[i][j])
							return false;
					}
					
				}
				return true;
			}
		}
	
		return false;
	}
}
