package Personnage;
import gui.Commande;
import Carte.Case;
import Carte.Labyrinthe;
import Jeu.*;

public abstract class Personnage{

	//Taille d'une case
	protected int posX;
	protected int posY;
	private Labyrinthe lab;
	
	
	public Personnage(int x, int y, Labyrinthe l){
		this.posX = x;
		this.posY = y;
		this.lab = l;
	}

	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	public abstract void deplacerPersonnage(Commande c, Labyrinthe l);
}
