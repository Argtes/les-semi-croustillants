package MATH;

public class Point {
	private int x, y, z;
	
	public Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void afficher(){
		System.out.println("x : " + x + "y : " + y + " z :" + z);
	}
	
	public int[] getCoord(){
		int[] tab = {x, y, z};
		return tab;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setZ(int z){
		this.z = z;
	}
	
}
