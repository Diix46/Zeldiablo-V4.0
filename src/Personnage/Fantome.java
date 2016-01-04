package Personnage;

import gui.Commande;
import Carte.Case;
import Carte.Labyrinthe;

public class Fantome extends Personnage{

	public Fantome(int x, int y, Labyrinthe l) {
		super(x, y, l);
	}

	@Override
	public void deplacerPersonnage(Commande c, Labyrinthe l){
		if(c.droite == true && this.getPosX()>0 && !l.getTabLab()[this.getPosX()+1][this.getPosY()].estBord()){
			this.setPosX(this.getPosX()+1);
		}
		if(c.gauche == true && this.getPosX()>0 && !l.getTabLab()[this.getPosX()-1][this.getPosY()].estBord()){
			this.setPosX(this.getPosX()-1);
		}
		if(c.haut == true && this.getPosX()>0 && !l.getTabLab()[this.getPosX()][this.getPosY()-1].estBord()){
			this.setPosY(this.getPosY()-1);
		}
		if(c.bas == true && this.getPosX()>0 && !l.getTabLab()[this.getPosX()][this.getPosY()+1].estBord()){
			this.setPosY(this.getPosY()+1);
		}
	}

}
