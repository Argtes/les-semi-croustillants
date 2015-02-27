package Test;

import org.junit.Assert;
import org.junit.Test;

import MATH.Matrice;

public class TestMatrice {

	
	@Test
	public void testInitMatUnUn() {
		Matrice m =new Matrice(new float[][]{
				{1}
		});
		Assert.assertEquals(1, m.get(0,0) ,0);
	}
	
	/**
	 * test initialisation de matrice deux - deux
	 */
	@Test
	public void testInitMatDeuxDeux() {
		Matrice m =new Matrice(new float[][]{
				{1, 1},
				{2, 2}
		});
		Assert.assertEquals(1, m.get(0,0) ,0);
		Assert.assertEquals(1, m.get(0,1) ,0);
		Assert.assertEquals(2, m.get(1,0) ,0);
		Assert.assertEquals(2, m.get(1,1) ,0);
	}
	
	/**
	 * test initialisation de matrice Trois - Trois
	 */
	@Test
	public void testInitMatTroisTrois() {
		Matrice m =new Matrice(new float[][]{
				{1, 2, 3},
				{2, 2, 2},
				{3, 2, 1}
		});
		Assert.assertEquals(1, m.get(0,0) ,0);
		Assert.assertEquals(2, m.get(0,1) ,0);
		Assert.assertEquals(3, m.get(0,2) ,0);
		Assert.assertEquals(2, m.get(1,0) ,0);
		Assert.assertEquals(2, m.get(1,1) ,0);
		Assert.assertEquals(2, m.get(1,2) ,0);
		Assert.assertEquals(3, m.get(2,0) ,0);
		Assert.assertEquals(2, m.get(2,1) ,0);
		Assert.assertEquals(1, m.get(2,2) ,0);
	}
	
	/**
	 * test initialisation de matrice quatre - quatre
	 */
	@Test
	public void testInitMatQuatreQuatre() {
		Matrice m =new Matrice(new float[][]{
				{1, 2, 3, 4},
				{2, 2, 2, 2},
				{3, 2, 1, 0},
				{5, 4, 3, 2}
		});
		Assert.assertEquals(1, m.get(0,0) ,0);
		Assert.assertEquals(2, m.get(0,1) ,0);
		Assert.assertEquals(3, m.get(0,2) ,0);
		Assert.assertEquals(4, m.get(0,3) ,0);
		Assert.assertEquals(2, m.get(1,0) ,0);
		Assert.assertEquals(2, m.get(1,1) ,0);
		Assert.assertEquals(2, m.get(1,2) ,0);
		Assert.assertEquals(2, m.get(1,3) ,0);
		Assert.assertEquals(3, m.get(2,0) ,0);
		Assert.assertEquals(2, m.get(2,1) ,0);
		Assert.assertEquals(1, m.get(2,2) ,0);
		Assert.assertEquals(0, m.get(2,3) ,0);
		Assert.assertEquals(5, m.get(3,0) ,0);
		Assert.assertEquals(4, m.get(3,1) ,0);
		Assert.assertEquals(3, m.get(3,2) ,0);
		Assert.assertEquals(2, m.get(3,3) ,0);
	}
	/**
	 * Test de la matrice identit� quatre - quatre 
	 */
	
	@Test
	public void testMatriceIdentite() {
		Matrice m =new Matrice(4);
		
		Assert.assertTrue(new Matrice(new float[][]{
				{1,0,0,0},
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1}}).equals(m));
	}
	
	/**
	 * test d'une mauvaise matrice identite quatre - quatre
	 */
	@Test
	public void testMatriceIdentiteWithBadTest() {
		Matrice m =new Matrice(4);
		
		Assert.assertFalse(new Matrice(new float[][]{
				{1,0,5,0},
				{0,1,0,5},
				{0,0,1,0},
				{0,0,0,1}}).equals(m));
	}
	

	/**
	 * test de multiplication de matrice trois - trois
	 * avec une matrice null (seulement des 0)
	 */
	@Test
	public void testMultMatTroisTroisNull() {
			//multiplier est a corriger
		Matrice m =new Matrice(new float[][]{
				{1, 2, 3},
				{2, 2, 2},
				{3, 2, 1}
		});
		Matrice m2 =new Matrice(new float[][]{
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
		});
		Assert.assertTrue(new Matrice(new float[][]{
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}}).equals(m.multiplier(m2)));
	}
	
	/**
	 * test de multiplication de matrice trois - trois
	 * avec des matrices remplis de 1 et de 2 uniquement
	 */
	@Test
	public void testMultMatTroisTrois() {
			//multiplier est a corriger
		Matrice m =new Matrice(new float[][]{
				{2, 2, 2},
				{2, 2, 2},
				{2, 2, 2}
		});
		Matrice m2 =new Matrice(new float[][]{
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		});
		Assert.assertTrue(new Matrice(new float[][]{
				{6, 6, 6},
				{6, 6, 6},
				{6, 6, 6}}).equals(m.multiplier(m2)));
	}
}
