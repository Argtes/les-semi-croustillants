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
	/**
	 * constructeur matrice un - un
	 */

	public Matrice(float a){
		matrice[0][0]=a;
	}
	
	/**
	 * constructeur matrice deux - deux
	 */

	public Matrice(float a, float b, float c, float d){
		matrice[0][0]=a;
		matrice[0][1]=b;
		matrice[1][0]=c;
		matrice[1][1]=d;
	}
	
	/**
	 * constructeur matrice trois - trois
	 */

	public Matrice(float a, float b, float c, float d, float e, float f, float g, float h, float i){
		matrice[0][0]=a;
		matrice[0][1]=b;
		matrice[0][2]=c;
		matrice[1][0]=d;
		matrice[1][1]=e;
		matrice[1][2]=f;
		matrice[2][0]=g;
		matrice[2][1]=h;
		matrice[2][2]=i;
	}
	
	/**
	 * constructeur matrice quatre - quatre
	 */

	public Matrice(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, float p){
		matrice[0][0]=a;
		matrice[0][1]=b;
		matrice[0][2]=c;
		matrice[0][3]=d;
		matrice[1][0]=e;
		matrice[1][1]=f;
		matrice[1][2]=g;
		matrice[1][3]=h;
		matrice[2][0]=i;
		matrice[2][1]=j;
		matrice[2][2]=k;
		matrice[2][3]=l;
		matrice[3][0]=m;
		matrice[3][1]=n;
		matrice[3][2]=o;
		matrice[3][3]=p;
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
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
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
		System.out.println();
		System.out.println(ok1.toString());
		ok.multiplier(ok1);
		System.out.println();
		System.out.println();
		System.out.println(ok);
	}

}
