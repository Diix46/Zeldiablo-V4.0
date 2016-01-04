package gui;

import java.io.IOException;

import Jeu.*;

public class MoteurGraphique {

	Jeu j;
	
	public MoteurGraphique(Jeu j) throws InterruptedException, IOException{
		//creation du jeu
		this.j=j;
		
		//creation du moteur graphique
		InterfaceGraphique inter=new InterfaceGraphique();
		ControleurGraphique controle=inter.getControleur();
		Dessineur affiche=inter.getAfficheur();
		
		//boucle de jeu
		while(true)
		{
			Commande c=controle.getCommande();
			Commande c2=controle.deplacerAlea();
			Commande c3=controle.deplacerAlea();
			Commande c4=controle.deplacerAlea();
			j.getAventurier().deplacerPersonnage(c, j.getLabyrinthe());
			j.getOrc1().deplacerPersonnage(c2, j.getLabyrinthe());
			j.getOrc2().deplacerPersonnage(c3, j.getLabyrinthe());
			j.getFant().deplacerPersonnage(c4, j.getLabyrinthe());
			affiche.dessiner(j);
			
			Thread.sleep(100);
		}
	}

}
