package Personnage;

import static org.junit.Assert.*;
import Carte.Case;
import Carte.Labyrinthe;
import Personnage.*;

import org.junit.Test;

public class TestPersonnage {
	Labyrinthe l = new Labyrinthe();

	@Test
	public void TestConstructeurOrc() {
		 Orc o = new Orc(10, 10, l);
		 assertEquals("Position en x pas bonne", o.getPosX(), 10);
		 assertEquals("Position en y pas bonne", o.getPosY(), 10);
	}
	
	@Test
	public void TestConstructeurFantome() {
		 Fantome o = new Fantome(80, 45, l);
		 assertEquals("Position en x pas bonne", o.getPosX(), 80);
		 assertEquals("Position en y pas bonne", o.getPosY(), 45);
	}
	
	@Test
	public void TestConstructeurAventurier() {
		 Aventurier o = new Aventurier(10,10,l);
		 assertEquals("Position en x pas bonne", o.getPosX(), 10);
		 assertEquals("Position en y pas bonne", o.getPosY(), 10);
	}
	
}
