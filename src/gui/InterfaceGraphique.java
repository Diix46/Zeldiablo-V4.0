package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * crée une interface graphique avec son controleur et son afficheur
 * @author vthomas
 *
 */
public class InterfaceGraphique  {

	/**
	 * l'afficheur lié à la JFrame
	 */
	Dessineur dessin;
	
	/**
	 * le controleur lié à la JFrame
	 */
	ControleurGraphique controleur;
	

	/**
	 * la construction de l'interface grpahique
	 * - construit la JFrame
	 * - construit les Attributs
	 * @throws IOException 
	 * 
	 */
	public InterfaceGraphique() throws IOException
	{
		//creation JFrame
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// creation afficheurGraphique
		AfficheurGraphique affiche=new AfficheurGraphique(600,800);
		this.dessin=new Dessineur(600, 600, affiche);
		f.setContentPane(affiche);
		
			
		//ajout du controleur
		ControleurGraphique controlleurGraph=new ControleurGraphique();
		this.controleur=controlleurGraph;
		affiche.addKeyListener(controlleurGraph);	
		
		//recuperation du focus
		f.pack();
		f.setVisible(true);
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
	}
	
	/**
	 * retourne l'afficheur de l'interface construite
	 */
	public Dessineur getAfficheur() {
		return dessin;
	}
	
	/**
	 * retourne le controleur de l'affichage construit
	 * @return
	 */
	public ControleurGraphique getControleur() {
		return controleur;
	}
	
}
