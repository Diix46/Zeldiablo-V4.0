package Jeu;

import Carte.*;
import Personnage.*;
import Sound.Sound;


public class Jeu {

	private Labyrinthe l;
	private Aventurier av;
	private Orc orc;
	private Orc orc2;
	private Sound s;
	private Fantome fant;
	
	public Jeu(){
		this.l = new Labyrinthe();
		this.orc = new Orc(7,8, l);
		this.orc2 = new Orc(3, 9, l);
		this.fant = new Fantome(4, 6, l);
		this.av = new Aventurier(1, 1, this.l);
		l.placerPerso(av);
		this.s = new Sound("Sound/background.wav");
		s.loop();
	}
	
	public Orc getOrc1(){
		return this.orc;
	}
	
	public Orc getOrc2(){
		return this.orc2;
	}
	
	public Aventurier getAventurier(){
		return this.av;
	}
	
	public Labyrinthe getLabyrinthe(){
		return this.l;
	}

	public Fantome getFant() {
		return fant;
	}
}
