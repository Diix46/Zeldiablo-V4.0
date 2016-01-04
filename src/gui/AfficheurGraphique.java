package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class AfficheurGraphique extends JPanel {

	/**
	 * l'image à afficher
	 */
	BufferedImage imageEnCours;

	
	public AfficheurGraphique(int x,int y)
	{
		this.setPreferredSize(new Dimension(x,y));
	}
	
	/**
	 * modifie image à afficher
	 */
	public void modifierImage(BufferedImage im)
	{
		imageEnCours=im;
		repaint();
	}
	
	/**
	 * redefinit la methode paint consiste à dessiner l'image en cours
	 * 
	 * @param g
	 *            graphics pour dessiner
	 */
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(this.imageEnCours, 0, 0, getWidth(), getHeight(), 0, 0,
				getWidth(), getHeight(), null);
	}

}
