package MATH;

import java.util.Random;

public class Matrice {
	int[][] matrice = new int[3][3];
	
	public Matrice(){
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrice[i][j] = r.nextInt(10);
			}
		}
	}
	
	public void afficher(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public String toString(){
		String s = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s += matrice[i][j] + " ";
			}
			s += "\n";
		}
		return s;
	}
	
}
