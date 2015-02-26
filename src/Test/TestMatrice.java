package Test;

import org.junit.Assert;
import org.junit.Test;

import MATH.Matrice;

public class TestMatrice {

	@Test
	public void testInitMat() {
		Matrice m =new Matrice(new float[][]{
				{1}
		});
		Assert.assertEquals(1, m.get(0,0) ,0);
	}
	
	@Test
	public void testMatriceIdentite() {
		Matrice m =new Matrice(4);
		
		Assert.assertTrue(new Matrice(new float[][]{
				{1,0,0,0},
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1}}).equals(m));
	}
	
	@Test
	public void testMatriceIdentiteWithBadTest() {
		Matrice m =new Matrice(4);
		
		Assert.assertFalse(new Matrice(new float[][]{
				{1,0,5,0},
				{0,1,0,5},
				{0,0,1,0},
				{0,0,0,1}}).equals(m));
	}
	

}
