package IHM;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Menu {
	JFrame fenetre;
	JPanel panelImage, panelFichier;
	JMenu barreMenu;
	JMenuBar barre;
	JMenuItem item;
	
	
	public Menu() {
		fenetre = new JFrame("les semi croustillants");
		panelImage = new JPanel();
		panelFichier = new JPanel();
		barre = new JMenuBar();//recoit le Menu
		barreMenu = new JMenu();//Menu
		item = new JMenuItem("Hello");//item
		barre.setBounds(0, 0, 200, 20);
		
		
		fenetre.setPreferredSize(new Dimension(1000, 750));
		
		item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		item.getAccessibleContext().setAccessibleDescription("hellllllo");
		
		barreMenu.add(item);
		
		
		barre.add(barreMenu);
		
		
		fenetre.add(barreMenu);
		fenetre.setJMenuBar(barre);
		fenetre.add(panelImage);
		fenetre.add(panelFichier);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
