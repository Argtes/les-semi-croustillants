package Main;

import IHM.Menu;


public class Main {
	public static void main(String[] args) {
		System.out.println("poney a toi qui execute ce code");
		
		
		/*run du Menu - Package IHM*/
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Menu();
			}
		});
	}
}
