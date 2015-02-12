package MATH;

public class Point {
	int x, y, z;
	
	public Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void afficher(){
		System.out.println("x : " + x + "y : " + y + " z :" + z);
	}
	
}
