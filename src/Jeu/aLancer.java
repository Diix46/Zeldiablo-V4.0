package Jeu;

import java.io.IOException;
import Carte.*;
import Personnage.*;
import gui.*;
import Sound.*;

public class aLancer {

	public static void main(String[] args) throws InterruptedException, IOException{
		Jeu j = new Jeu();
		new MoteurGraphique(j);
	}

}
