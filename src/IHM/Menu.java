package IHM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;

public class Menu extends JFrame {
	private static final long serialVersionUID = 1L;
	/**
	 * Contrainte de positionnement des composants dans la fenetre
	 */
	private GridBagConstraints c1;
	/**
	 * Barre de menu
	 */
	private JMenuBar menu = new JMenuBar();
	/**
	 * Menu fichier et autre/sousautre
	 */
	private JMenu fichier = new JMenu("Fichier");
	private JMenu autre = new JMenu("Autre");
	private JMenu sousautre = new JMenu("sousautre");

	/**
	 * Sous-Menu quitter et autre
	 */
	private JMenuItem quitter = new JMenuItem("Quitter");
	private JMenuItem autres = new JMenuItem("autres");

	/**
	 * Les boutons
	 */
	private JButton zoom = new JButton("Zoom");
	private JButton dezoom = new JButton("Dezoom");
	private JButton tournerDroite = new JButton("tournerDroite");
	private JButton tournerGauche = new JButton("tournerGauche");
	private JButton tournerHaut = new JButton("tournerHaut");
	private JButton tournerBas = new JButton("tournerBas");

	/**
	 * Police des boutons
	 */
	private Font f = new Font("Arial", Font.PLAIN, 20);

	/**
	 * le JSlider
	 */
	private JSlider slide = new JSlider(JSlider.VERTICAL, 0, 100, 50);

	/**
	 * les JPanel image et bouton
	 */
	JPanel panelImage = new JPanel();
	JPanel panelBouton = new JPanel();

	/**
	 * Construit une fenetre
	 */
	public Menu() {
		super("Les semi-croustillants");
		configFrame();
		ajoutComposants();
		addListeners();
		setVisible(true);
	}

	/**
	 * Configure la fenetre
	 */
	private void configFrame() {
		setLayout(new GridBagLayout());
		setSize(1000, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * Ajoute les listeners au menu
	 */
	public void addMenuActionListeners() {
		quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

	/**
	 * Ajoute les listeners generaux
	 */
	public void addListeners() {
	}

	/**
	 * Ajoute le menu en francais
	 */
	public void ajoutMenu() {
		menu.remove(fichier);

		fichier = new JMenu("Fichier");
		autre = new JMenu("Autre");
		sousautre = new JMenu("sousautre");

		quitter = new JMenuItem("Quitter");
		autres = new JMenuItem("Autres");

		fichier.add(quitter);

		autre.add(sousautre);
		sousautre.add(autres);

		menu.add(fichier);
		menu.add(autre);

		setJMenuBar(menu);
		addMenuActionListeners();
	}

	/**
	 * ajout du bouton zoom
	 */
	private void ajoutBoutonZoom() {
		zoom.setText("Zoom");
		zoom.setFont(f);
		c1.ipadx = 180;
		c1.ipady = 20;
		c1.gridx = 1;
		c1.gridy = 1;
		c1.gridheight = 1;
		c1.gridwidth = 1;
		add(zoom, c1);
	}

	/**
	 * ajout du bouton dezoom
	 */
	private void ajoutBoutonDezoom() {
		dezoom.setText("Dezoom");
		dezoom.setFont(f);
		c1.ipadx = 158;
		c1.ipady = 20;
		c1.gridx = 1;
		c1.gridy = 2;
		c1.gridheight = 1;
		c1.gridwidth = 1;
		add(dezoom, c1);
	}

	/**
	 * ajout du bouton tournerDroite
	 */
	private void ajoutBoutonTournerDroite() {
		tournerDroite.setText("pivoter a droite");
		tournerDroite.setFont(f);
		c1.ipadx = 99;
		c1.ipady = 20;
		c1.gridx = 1;
		c1.gridy = 3;
		c1.gridheight = 1;
		c1.gridwidth = 1;
		add(tournerDroite, c1);
	}

	/**
	 * ajout du bouton tournerGauche
	 */
	private void ajoutBoutonTournerGauche() {
		tournerGauche.setText("pivoter a gauche");
		tournerGauche.setFont(f);
		c1.ipadx = 87;
		c1.ipady = 20;
		c1.gridx = 1;
		c1.gridy = 4;
		c1.gridheight = 1;
		c1.gridwidth = 1;
		add(tournerGauche, c1);
	}

	/**
	 * ajout du bouton tournerHaut
	 */
	private void ajoutBoutonTournerHaut() {
		tournerHaut.setText("pivoter vers le haut");
		tournerHaut.setFont(f);
		c1.ipadx = 67;
		c1.ipady = 20;
		c1.gridx = 1;
		c1.gridy = 5;
		c1.gridheight = 1;
		c1.gridwidth = 1;
		add(tournerHaut, c1);
	}

	/**
	 * ajout du bouton tourner
	 */
	private void ajoutBoutonTournerBas() {
		tournerBas.setText("pivoter a droite vers le bas");
		tournerBas.setFont(f);
		c1.ipadx = 0;
		c1.ipady = 20;
		c1.gridx = 1;
		c1.gridy = 6;
		c1.gridheight = 1;
		c1.gridwidth = 1;
		add(tournerBas, c1);
	}

	public void ajoutPanelBouton() {
		ajoutBoutonZoom();
		ajoutBoutonDezoom();
		ajoutBoutonTournerDroite();
		ajoutBoutonTournerGauche();
		ajoutBoutonTournerHaut();
		ajoutBoutonTournerBas();
		pack();
	}

	/**
	 * ajout du JSilder slide
	 */
	private void ajoutSlide() {
		c1.ipadx = 0;
		c1.ipady = 20;
		c1.gridx = 0;
		c1.gridy = 1;
		c1.gridheight = 6;
		c1.gridwidth = 1;
		add(slide, c1);
	}
	
	public void ajoutPanelImage() {
		ajoutSlide();
		pack();
	}

	/**
	 * Ajoute les composants de la fenetre
	 */
	public void ajoutComposants() {
		c1 = new GridBagConstraints();

		paramInterComposants();
		ajoutMenu();
		ajoutPanelImage();
		ajoutPanelBouton();
		pack();
	}

	private void paramInterComposants() {
		c1.fill = GridBagConstraints.VERTICAL;
		c1.ipadx = 10;
		c1.ipady = 10;
		c1.insets = new Insets(8, 8, 8, 8);
	}

	public static void main(String[] args) {
		new Menu();
	}

}