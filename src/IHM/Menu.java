package IHM;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu {
	JFrame fenetre;
	JPanel panel;
	
	public Menu(){
		fenetre = new JFrame("les semi croustillants");
		panel = new JPanel();
		
		fenetre.setPreferredSize(new Dimension(800, 600));
		
		fenetre.add(panel);
		
		fenetre.pack();
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
