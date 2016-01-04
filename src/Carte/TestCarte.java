package Carte;

import static org.junit.Assert.*;
import gui.Commande;

import org.junit.Test;

import Carte.*;
import Personnage.Aventurier;

public class TestCarte {
	Labyrinthe l = new Labyrinthe();

	@Test
	public void testCasePleine() {
		Case c = new Case(true, false, 0, 0);
		assertEquals("Case vide creee. Attendu : Case pleine", c.estVide(), true);
		assertEquals("Case vide creee. Attendu : Case pleine", c.estMur(), false);
	}

	@Test
	public void testCaseVide()
	{
		Case c = new Case(false, true, 0, 0);
		assertEquals("Case pleine creee. Attendu : Case vide", c.estVide(), false);
		assertEquals("Case pleine creee. Attendu : Case vide", c.estMur(), true);	
	}


	@Test
	public void testCaseFausse2()
	{
		Case c = new Case(true, true, 0, 0);
		assertEquals("Les attributs doivent etre differents. Case vide creee par defaut", c.estVide(), true);
		assertEquals("Les attributs doivent etre differents. Case vide creee par defaut", c.estMur(), false);	
	}

	@Test
	public void testEmplacementCase()
	{
		Case c = new Case(true, false, 100, 50);
		assertEquals("Emplacement mauvais en x", c.getPosX(), 100);
		assertEquals("Emplacement mauvais en y", c.getPosY(), 50);
	}

	@Test
	public void testLabyrinthe()
	{
		Case c = new Case (true, false, 1,1);
		assertEquals("Erreur, tableau de Case mal instancie", l.getTabLab()[1][1].getPosX(), c.getPosX());
		assertEquals("Erreur, tableau de Case mal instancie", l.getTabLab()[1][1].getPosY(), c.getPosY());
		assertEquals("Erreur, tableau de Case mal instancie", l.getTabLab()[1][1].estMur(), c.estMur());
		assertEquals("Erreur, tableau de Case mal instancie", l.getTabLab()[1][1].estVide(), c.estVide());
		c.changeMur();
		assertEquals("Erreur, tableau de Case mal instancie", l.getTabLab()[0][0].estVide(), c.estVide());
		assertEquals("Erreur, tableau de Case mal instancie", l.getTabLab()[0][0].estMur(), c.estMur());
	}
	
	@Test
	public void TestSeDeplacerHumain(){
		Commande c = new Commande();
		c.bas = true;
		c.droite = true;
		Aventurier o = new Aventurier(10,10,this.l);
		o.deplacerPersonnage(c, l);
		assertEquals("Le déplacement ne s'est pas fait", o.getPosY(), 11);
		assertEquals("Le déplacement ne s'est pas fait", o.getPosX(), 11);
	}

}
