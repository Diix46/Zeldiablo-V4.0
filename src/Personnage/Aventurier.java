package Personnage;

import gui.*;
import Carte.Labyrinthe;

public class Aventurier extends Personnage{

	private double vie;
	private boolean mort;

	public Aventurier(int x, int y, Labyrinthe l) {
		// Création du personnage a un emplacement définis
		super(x,y,l);
		this.vie = 3;
		this.mort = false;
	}


	public boolean estMort(){
		if(this.mort == true){
			return true;
		} else {
			return false;
		}
	}

	public void tomberPiege(){
		this.vie = this.vie - 0.5;
		System.out.println(vie);
	}

	public void deplacerPersonnage(Commande c, Labyrinthe l){
		if(c.droite == true){
			if(!l.getTabLab()[this.getPosX()+1][this.getPosY()].estMur()){
				this.setPosX(this.getPosX()+1);
			}
		}
		if(c.gauche == true){
			if(!l.getTabLab()[this.getPosX()-1][this.getPosY()].estMur()) {
				this.setPosX(this.getPosX()-1);
			}
		}
		if(c.haut == true){
			if(!l.getTabLab()[this.getPosX()][this.getPosY()-1].estMur()){
				this.setPosY(this.getPosY()-1);
			}
		}
		if(c.bas == true){
			if(!l.getTabLab()[this.getPosX()][this.getPosY()+1].estMur()){
				this.setPosY(this.getPosY()+1);
			}
		}
		if(l.getTabLab()[posX][posY].estPiege()){
			this.tomberPiege();
		}
		if(l.getTabLab()[this.getPosX()][this.getPosY()].estPorte()){
			this.setPosX(1);
			this.setPosY(1);
			
			Labyrinthe l2 = new Labyrinthe();
			l.setTabLab(l2.getTabLab());
			
		}
	}
}
