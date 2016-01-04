package Personnage;

import gui.Commande;
import Carte.*;

public class Orc extends Personnage{

	private Labyrinthe lab;
	
	public Orc(int x, int y, Labyrinthe l) {
		super(x, y, l);
	}

	@Override
	public void deplacerPersonnage(Commande c, Labyrinthe l){
		if(!l.getTabLab()[this.getPosX()+1][this.getPosY()].estMur() && !l.getTabLab()[this.getPosX()+1][this.getPosY()].estPorte()){
			if(c.droite == true){
				this.setPosX(this.getPosX()+1);
			}
		}
		if(!l.getTabLab()[this.getPosX()-1][this.getPosY()].estMur() && !l.getTabLab()[this.getPosX()-1][this.getPosY()].estPorte()){
			if(c.gauche == true){
				this.setPosX(this.getPosX()-1);
			}
		}
		if(!l.getTabLab()[this.getPosX()][this.getPosY()-1].estMur() && !l.getTabLab()[this.getPosX()][this.getPosY()-1].estPorte()){
			if(c.haut == true){
				this.setPosY(this.getPosY()-1);
			}
		}
		if(!l.getTabLab()[this.getPosX()][this.getPosY()+1].estMur() && !l.getTabLab()[this.getPosX()][this.getPosY()+1].estPorte()){
			if(c.bas == true){
				this.setPosY(this.getPosY()+1);
			}
		}
	}
}
