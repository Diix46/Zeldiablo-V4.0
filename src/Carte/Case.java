package Carte;

import gui.Commande;

public class Case{

	private boolean piege;

	// Attribut de la case, vaut vrai si la case est vide
	private boolean vide;

	//Attribut de la case, vaut vrai si la case est un mur
	private boolean bloc;

	//Attribut de la case, entier correspondant a la coordonnee x de la case
	private int posX;

	//Attribut de la case, entier correspondant a la coordonnee y de la case
	private int posY;
	
	private boolean porte;
	
	private boolean bord;
	
	public Case(boolean vide, boolean mur, int x, int y){
		if(vide == true && mur == true){
			this.vide = true;
			this.bloc = false;
		} else {
			this.vide = vide;
			this.bloc = mur;
		}
		this.posX = x;
		this.posY = y;
		this.piege = false;
		this.porte = false;
		this.bord = false;
	}

	public Case caseSuivante(Commande c, Labyrinthe l){
		Case d= new Case(false, false, 0, 0);
		if(c.droite == true){
			if(l.getTabLab()[this.posX+1][this.posY] != null){
				d = l.getTabLab()[this.posX+1][this.posY];
			}
		}
		if(c.gauche == true){
			if(l.getTabLab()[this.posX-1][this.posY] != null){
				d = l.getTabLab()[this.posX-1][this.posY];
			}
		}
		if(c.haut == true){
			if(l.getTabLab()[this.posX][this.posY-1] != null){
				d = l.getTabLab()[this.posX][this.posY-1];
			}
		}
		if(c.bas == true){
			if(l.getTabLab()[this.posX][this.posY+1] != null){
				d = l.getTabLab()[this.posX+1][this.posY+1];
			}
		}
		return d;
	}
	
	public void changeBord(){
		this.bord = true;
	}
	
	public boolean estBord(){
		return bord;
	}
	
	public void changePorte(){
		this.porte = true;
		this.bloc = false;
	}
	
	public boolean estPorte(){
		return porte;
	}
	
	public void changeMur(){
		this.bloc=true;
	}
	
	public void changeVide(){
		this.bloc=false;
	}

	public void changePiege(){
		this.piege=true;
	}

	/*
	 * Méthode permettant de savoir l'état de la case
	 */
	public boolean estVide(){
		return vide;
	}

	/*
	 * Méthode permettant de savoir si la case est un mur ou non
	 */
	public boolean estMur(){
		return bloc;
	}

	/*
	 * Méthode permettant de savoir si la case est un piege ou non
	 */
	public boolean estPiege(){
		return piege;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	/**
	 * @param vide the vide to set
	 */
	public void setVide(boolean vide) {
		this.vide = vide;
	}

	/**
	 * @param bloc the bloc to set
	 */
	public void setBloc(boolean bloc) {
		this.bloc = bloc;
	}
}
