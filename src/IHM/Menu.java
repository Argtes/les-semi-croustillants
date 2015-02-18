package IHM;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

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

		fenetre.setPreferredSize(new Dimension(1000, 750));

		JMenuBar menu_bar1 = new JMenuBar();
		menu_bar1.setPreferredSize(new Dimension(200, 50));
		/* différents menus */
		JMenu menu1 = new JMenu("Fichier");
		menu1.setPreferredSize(new Dimension(100, 2));
		/* differents choix de chaque menu */
		JMenuItem demarrer = new JMenuItem("Démarrer");
		JMenuItem fin = new JMenuItem("Fin");

		/* Ajouter les choix au menu */
		menu1.add(demarrer);
		menu1.add(fin);
		
		/* Ajouter les menu sur la bar de menu */
		menu_bar1.add(menu1);
		
		
		/* Ajouter la bar du menu à la frame */
		fenetre.add(menu_bar1);
		
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
