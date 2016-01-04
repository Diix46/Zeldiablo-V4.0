package gui;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Jeu.*;
import Personnage.*;

/**
 * un afficheur graphique
 * 
 * cela fonctionne avec un principe de doubleBuffering - une image vide est crée
 * en plus du JPanel - on demande d'ajouter des éléments dans cette image vide -
 * on demande ensuite d'afficher cette image dans le JPanel
 * 
 * @author vthomas
 */
public class Dessineur  {

	/**
	 * constante pour gérer la taille des cases
	 */
	protected int TAILLE_CASE = 25;


	/**
	 * lien avers l'afficheur dans lequel dessiner
	 */
	AfficheurGraphique affiche; 

	/**
	 * une image intermediaire
	 */
	private BufferedImage imageSuivante;
	private BufferedImage imageEnCours;
	private BufferedImage mur;
	private BufferedImage perso;
	private BufferedImage piege;
	
	private BufferedImage sol;	
	private BufferedImage orc;
	private BufferedImage porte;
	private BufferedImage fant;

	/**
	 * la taille des images
	 */
	int width, height;

	/**
	 * constructeur vide cela construit une image intermediaire et permet de
	 * dessiner dessus
	 * @throws IOException 
	 */
	public Dessineur(int width, int height, AfficheurGraphique aff) throws IOException {
		this.width = width;
		this.height = height;
		this.affiche= aff;

		this.mur = ImageIO.read(new File("Images/Mur/Mur.png"));
		this.perso = ImageIO.read(new File("Images/perso.png"));
		this.piege = ImageIO.read(new File("Images/Piege.png"));	
		this.orc = ImageIO.read(new File("Images/Orc/Orc1.png"));
		this.sol = ImageIO.read(new File("Images/Sol/Sol1.png"));
		this.porte = ImageIO.read(new File("Images/Mur/Porte.png"));
		this.fant = ImageIO.read(new File("Images/Fantome.png"));

		
		// cree l'image buffer et son graphics
		this.imageSuivante = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		this.imageEnCours = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);

	}

	/**
	 * dessiner un objet consiste à utiliser un sprite
	 */
	public void dessinerObjet(String s, int x, int y, Jeu j) {
		Graphics2D crayon = (Graphics2D) imageSuivante.getGraphics();
		switch (s) {
		case "PJ":
			Object o4 = null;
			crayon.drawImage(perso, x * TAILLE_CASE, y * TAILLE_CASE,(ImageObserver)o4);
			break;
		case "MUR":
			Object o = null;
			crayon.drawImage(mur, x * TAILLE_CASE, y * TAILLE_CASE,(ImageObserver)o);
			break;
		case "PIEGE":
			Object o2 = null;
			crayon.drawImage(piege, x * TAILLE_CASE, y * TAILLE_CASE,(ImageObserver)o2);
			break;
		case "SOL":
			Object o3 = null;
			crayon.drawImage(sol, x  * TAILLE_CASE, y *  TAILLE_CASE,(ImageObserver)o3);
			break;
		case "ORC":
			Object o5 = null;
			crayon.drawImage(orc, x * TAILLE_CASE, y * TAILLE_CASE,(ImageObserver)o5);
			break;
		case "PORTE":
			Object o6 = null;
			crayon.drawImage(porte, x * TAILLE_CASE, y * TAILLE_CASE,(ImageObserver)o6);
			break;
		case "FANTOME":
			Object o7 = null;
			crayon.drawImage(fant, x * TAILLE_CASE, y * TAILLE_CASE,(ImageObserver)o7);
			break;
		default:
			throw new AssertionError("objet inexistant");
		}
	}
	
	public void dessinerPanel(Jeu j){
		Graphics2D crayon = (Graphics2D) imageSuivante.getGraphics();
		crayon.setColor(Color.black);
		crayon.drawRect(600, 600, 200, 600);
	}
	/**
	 * On inverse les images celle à dessiner et celle temporaire
	 */
	public void rendreImage() {
		BufferedImage temp = this.imageEnCours;
		// l'image à dessiner est celle qu'on a construite
		this.imageEnCours = this.imageSuivante;
		// l'ancienne image est vidée
		this.imageSuivante = temp;
		this.imageSuivante.getGraphics().fillRect(0, 0, this.width,this.height);

		affiche.modifierImage(imageEnCours);
	}


	/**
	 * méthode dessiner à completer
	 * 
	 * @param j
	 *            jeu à dessiner
	 */
	public void dessiner(Jeu j) {
		this.dessinerPanel(j);
		Personnage pj=j.getAventurier();
		this.dessinerObjet("PJ",pj.getPosX(),pj.getPosY(), j);
		
		Personnage orc=j.getOrc1();
		Personnage orc2=j.getOrc2();
		this.dessinerObjet("ORC",orc.getPosX(),orc.getPosY(), j);
		this.dessinerObjet("ORC",orc2.getPosX(),orc2.getPosY(), j);
		
		Personnage fant = j.getFant();
		this.dessinerObjet("FANTOME",fant.getPosX(),fant.getPosY(), j);
		
		this.rendreImage();		
		//A COMPLETER
		for(int i = 0 ; i < j.getLabyrinthe().getTabLab().length ; i++){
			for(int k = 0 ; k < j.getLabyrinthe().getTabLab().length ; k++){
				if(j.getLabyrinthe().getTabLab()[i][k].estVide()){
					this.dessinerObjet("SOL", i, k, j);
				}
				if(j.getLabyrinthe().getTabLab()[i][k].estMur()){
					this.dessinerObjet("MUR", i, k, j);
				}
				if(j.getLabyrinthe().getTabLab()[i][k].estPiege()){
					this.dessinerObjet("PIEGE", i, k, j);
				}
				if(j.getLabyrinthe().getTabLab()[i][k].estPorte()){
					this.dessinerObjet("PORTE", i, k, j);
				}
			}
		}
	}
}
