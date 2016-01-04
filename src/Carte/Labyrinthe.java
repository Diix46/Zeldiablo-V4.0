package Carte;
import Personnage.*;

public class Labyrinthe {

	private Case [][] tabLab;

	private Personnage p;


	public Labyrinthe(){
		this.tabLab = new Case[24][24];


		// Création du contour du labyrinthe
		for(int i=0;i<this.tabLab.length;i++) {
			for(int j=0;j<this.tabLab[i].length;j++) {
				this.tabLab[i][j]=new Case(true, false, i, j);
			}
		}

		for(int i=0;i<this.tabLab.length;i++){
			this.tabLab[0][i].changeMur();
			this.tabLab[0][i].changeBord();
			this.tabLab[this.tabLab.length-1][i].changeMur();
			this.tabLab[this.tabLab.length-1][i].changeBord();
			this.tabLab[i][0].changeMur();
			this.tabLab[i][0].changeBord();
			this.tabLab[i][this.tabLab.length-1].changeMur();
			this.tabLab[i][this.tabLab.length-1].changeBord();
		}

		this.tabLab[0][0].changeMur();
		this.tabLab[0][0].changeBord();
		this.tabLab[this.tabLab.length-1][this.tabLab.length-1].changeMur();
		this.tabLab[this.tabLab.length-1][this.tabLab.length-1].changeBord();
		this.tabLab[0][this.tabLab.length-1].changeMur();
		this.tabLab[0][this.tabLab.length-1].changeBord();
		this.tabLab[this.tabLab.length-1][0].changeMur();
		this.tabLab[this.tabLab.length-1][0].changeBord();

		double a = Math.random() * (3) + 1;

		if((int) a == 1){
			
			for(int i = 0; i<6; i++){
				double m = Math.random() * (23);
				double n = Math.random() * (23);
				while(this.tabLab[(int)m][(int)n].estMur() && this.tabLab[(int)m+1][(int)n+1].estPiege()){
					m = Math.random() * (23);
					n = Math.random() * (23);
				}
				this.tabLab[(int)m][(int)n].changePiege();
			}


			this.tabLab[0][19].changePorte();
			//Création d'un labyrinthe numéro 1
			for(int i=1;i<=4;i++){
				this.tabLab[i][3].changeMur();
			}

			for(int i=3;i<=6;i++){
				this.tabLab[i][2].changeMur();
			}

			for(int i=2;i<=5;i++){
				this.tabLab[6][i].changeMur();
			}

			for(int i=0;i<=3;i++){
				this.tabLab[9][i].changeMur();
			}

			for(int i=12;i<=16;i++){
				this.tabLab[i][2].changeMur();
			}

			for(int i=12;i<=16;i++){
				this.tabLab[i][3].changeMur();
			}

			for(int i=9;i<=11;i++){
				this.tabLab[i][4].changeMur();
			}

			for(int i=4;i<=6;i++){
				this.tabLab[17][i].changeMur();
			}

			for(int i=5;i<=6;i++){
				this.tabLab[i][6].changeMur();
			}

			for(int i=8;i<=14;i++){
				this.tabLab[i][6].changeMur();
			}

			for(int i=17;i<=18;i++){
				this.tabLab[i][6].changeMur();
			}

			for(int i=20;i<=23;i++){
				this.tabLab[i][5].changeMur();
			}

			for(int i=5;i<=9;i++){
				this.tabLab[20][i].changeMur();
			}

			for(int i=6;i<=8;i++){
				this.tabLab[5][i].changeMur();
			}

			for(int i=8;i<=14;i++){
				this.tabLab[i][7].changeMur();
			}

			for(int i=8;i<=14;i++){
				this.tabLab[i][8].changeMur();
			}

			for(int i=2;i<=3;i++){
				this.tabLab[i][8].changeMur();
			}

			for(int i=0;i<=2;i++){
				this.tabLab[i][9].changeMur();
			}

			for(int i=16;i<=20;i++){
				this.tabLab[i][9].changeMur();
			}

			for(int i=9;i<=12;i++){
				this.tabLab[16][i].changeMur();
			}

			for(int i=9;i<=10;i++){
				this.tabLab[i][11].changeMur();
			}

			for(int i=12;i<=13;i++){
				this.tabLab[i][11].changeMur();
			}

			for(int i=4;i<=10;i++){
				this.tabLab[i][12].changeMur();
			}

			for(int i=4;i<=10;i++){
				this.tabLab[i][13].changeMur();
			}

			for(int i=12;i<=18;i++){
				this.tabLab[4][i].changeMur();
			}

			for(int i=11;i<=19;i++){
				this.tabLab[12][i].changeMur();
			}

			for(int i=6;i<=9;i++){
				this.tabLab[i][15].changeMur();
			}

			for(int i=12;i<=18;i++){
				this.tabLab[i][15].changeMur();
			}

			for(int i=1;i<=4;i++){
				this.tabLab[i][18].changeMur();
			}

			for(int i=20;i<=23;i++){
				this.tabLab[i][18].changeMur();
			}

			for(int i=0;i<=6;i++){
				this.tabLab[i][20].changeMur();
			}

			for(int i=18;i<=19;i++){
				this.tabLab[i][23].changeMur();
			}

			for(int i=18;i<=19;i++){
				this.tabLab[i][23].changeMur();
			}

			for(int i=15;i<=20;i++){
				this.tabLab[6][i].changeMur();
			}

			for(int i=17;i<=21;i++){
				this.tabLab[8][i].changeMur();
			}

			for(int i=15;i<=17;i++){
				this.tabLab[9][i].changeMur();
			}

			for(int i=20;i<=23;i++){
				this.tabLab[14][i].changeMur();
			}
		}

		if((int)a == 2){
			
			for(int i = 0; i<6; i++){
				double m = Math.random() * (23);
				double n = Math.random() * (23);
				while(this.tabLab[(int)m][(int)n].estMur() && this.tabLab[(int)m+1][(int)n+1].estPiege()){
					m = Math.random() * (23);
					n = Math.random() * (23);
				}
				this.tabLab[(int)m][(int)n].changePiege();
			}

			this.tabLab[23][17].changePorte();

			for(int i=1;i<=3;i++){
				this.tabLab[3][i].changeMur();
			}

			for(int i=1;i<=2;i++){
				this.tabLab[15][i].changeMur();
			}

			for(int i=2;i<=5;i++){
				this.tabLab[12][i].changeMur();
			}

			for(int i=3;i<=7;i++){
				this.tabLab[8][i].changeMur();
			}

			for(int i=4;i<=7;i++){
				this.tabLab[10][i].changeMur();
			}

			for(int i=4;i<=5;i++){
				this.tabLab[11][i].changeMur();
			}

			for(int i=5;i<=7;i++){
				this.tabLab[5][i].changeMur();
			}

			for(int i=1;i<=5;i++){
				this.tabLab[i][6].changeMur();
			}

			for(int i=8;i<=10;i++){
				this.tabLab[i][7].changeMur();
			}
			for(int i=3;i<=8;i++){
				this.tabLab[i][3].changeMur();
			}

			for(int i=16;i<=20;i++){
				this.tabLab[i][5].changeMur();
			}

			for(int i=20;i<=23;i++){
				this.tabLab[i][6].changeMur();
			}

			for(int i=20;i<=23;i++){
				this.tabLab[i][7].changeMur();
			}

			for(int i=5;i<=8;i++){
				this.tabLab[16][i].changeMur();
			}

			for(int i=14;i<=16;i++){
				this.tabLab[i][8].changeMur();
			}

			for(int i=12;i<=14;i++){
				this.tabLab[i][9].changeMur();
			}

			for(int i=6;i<=9;i++){
				this.tabLab[i][9].changeMur();
			}

			for(int i=6;i<=9;i++){
				this.tabLab[i][10].changeMur();
			}

			for(int i=6;i<=9;i++){
				this.tabLab[i][11].changeMur();
			}

			for(int i=4;i<=9;i++){
				this.tabLab[i][12].changeMur();
			}

			for(int i=9;i<=12;i++){
				this.tabLab[12][i].changeMur();
			}

			for(int i=12;i<=13;i++){
				this.tabLab[i][12].changeMur();
			}

			for(int i=17;i<=18;i++){
				this.tabLab[i][11].changeMur();
			}

			for(int i=11;i<=13;i++){
				this.tabLab[19][i].changeMur();
			}

			for(int i=11;i<=15;i++){
				this.tabLab[20][i].changeMur();
			}

			for(int i=12;i<=16;i++){
				this.tabLab[4][i].changeMur();
			}

			for(int i=1;i<=3;i++){
				this.tabLab[i][15].changeMur();
			}

			for(int i=0;i<=3;i++){
				this.tabLab[i][16].changeMur();
			}

			for(int i=21;i<=23;i++){
				this.tabLab[i][15].changeMur();
			}

			for(int i=11;i<=15;i++){
				this.tabLab[i][15].changeMur();
			}

			for(int i=14;i<=19;i++){
				this.tabLab[7][i].changeMur();
			}

			for(int i=14;i<=16;i++){
				this.tabLab[11][i].changeMur();
			}

			for(int i=15;i<=21;i++){
				this.tabLab[15][i].changeMur();
			}

			for(int i=19;i<=22;i++){
				this.tabLab[4][i].changeMur();
			}

			for(int i=6;i<=7;i++){
				this.tabLab[i][19].changeMur();
			}

			for(int i=9;i<=11;i++){
				this.tabLab[i][16].changeMur();
			}

			for(int i=16;i<=18;i++){
				this.tabLab[10][i].changeMur();
			}

			for(int i=20;i<=21;i++){
				this.tabLab[i][18].changeMur();
			}

			for(int i=18;i<=21;i++){
				this.tabLab[i][19].changeMur();
			}

			for(int i=18;i<=23;i++){
				this.tabLab[i][20].changeMur();
			}

			for(int i=22;i<=23;i++){
				this.tabLab[i][21].changeMur();
			}

			for(int i=8;i<=11;i++){
				this.tabLab[i][23].changeMur();
			}

			for(int i=15;i<=16;i++){
				this.tabLab[i][23].changeMur();
			}
		}
		if((int) a == 3){
			
			for(int i = 0; i<6; i++){
				double m = Math.random() * (23);
				double n = Math.random() * (23);
				while(this.tabLab[(int)m][(int)n].estMur() && this.tabLab[(int)m+1][(int)n+1].estPiege()){
					m = Math.random() * (23);
					n = Math.random() * (23);
				}
				this.tabLab[(int)m][(int)n].changePiege();
			}

			this.tabLab[13][23].changePorte();

			for (int i = 4 ; i <= 6 ; i++){
				this.tabLab[i][1].changeMur();
			}

			for (int i = 1 ; i <= 4 ; i++){
				this.tabLab[6][i].changeMur();
			}

			for (int i = 6 ; i <= 9 ; i++){
				this.tabLab[i][4].changeMur();
			}

			for (int i = 9 ; i <= 11 ; i++){
				this.tabLab[i][3].changeMur();
			}

			for (int i = 1 ; i <= 3 ; i++){
				this.tabLab[i][3].changeMur();
			}

			for (int i = 3 ; i <= 4 ; i++){
				this.tabLab[i][4].changeMur();
			}

			this.tabLab[4][5].changeMur();
			this.tabLab[3][8].changeMur();

			for (int i = 3 ; i <= 4 ; i++){
				this.tabLab[i][7].changeMur();
			}

			for (int i = 2 ; i <= 3 ; i++){
				this.tabLab[i][9].changeMur();
			}

			for (int i = 9 ; i <= 12 ; i++){
				this.tabLab[2][i].changeMur();
			}

			for (int i = 12 ; i <= 15 ; i++){
				this.tabLab[3][i].changeMur();
			}

			for (int i = 12 ; i <= 15 ; i++){
				this.tabLab[4][i].changeMur();
			}

			for (int i = 18 ; i <= 19 ; i++){
				this.tabLab[3][i].changeMur();
			}

			for (int i = 3 ; i <= 5 ; i++){
				this.tabLab[i][19].changeMur();
			}

			for (int i = 19 ; i <= 22 ; i++){
				this.tabLab[5][i].changeMur();
			}

			for (int i = 6 ; i <= 9 ; i++){
				this.tabLab[7][i].changeMur();
			}

			for (int i = 7 ; i <= 11 ; i++){
				this.tabLab[i][9].changeMur();
			}

			this.tabLab[6][6].changeMur();

			for (int i = 6 ; i <= 8 ; i++){
				this.tabLab[i][11].changeMur();
			}

			for (int i = 8 ; i <= 10 ; i++){
				for (int j = 12 ; j <= 15 ; j++){
					this.tabLab[i][j].changeMur();
				}
			}

			for (int i = 7 ; i <= 9 ; i++){
				this.tabLab[i][17].changeMur();
			}

			for (int i = 17 ; i <= 21 ; i++){
				this.tabLab[9][i].changeMur();
			}

			for (int i = 7 ; i <= 11 ; i++){
				this.tabLab[i][21].changeMur();
			}

			this.tabLab[7][22].changeMur();

			for (int i = 10 ; i <= 12 ; i++){
				this.tabLab[i][6].changeMur();
			}

			this.tabLab[10][7].changeMur();

			for (int i = 12 ; i <= 16 ; i++){
				this.tabLab[i][5].changeMur();
			}

			for (int i = 5 ; i <= 10 ; i++){
				this.tabLab[16][i].changeMur();
			}

			for (int i = 13 ; i <= 16 ; i++){
				this.tabLab[i][10].changeMur();
			}

			for (int i = 8 ; i <= 9 ; i++){
				this.tabLab[13][i].changeMur();
			}

			for (int i = 13 ; i <= 16 ; i++){
				for(int j = 12 ; j <= 16 ; j++){
					this.tabLab[i][j].changeMur();
				}
			}

			for (int i = 13 ; i <= 14 ; i++){
				this.tabLab[i][18].changeMur();
			}

			for (int i = 14 ; i <= 15 ; i++){
				this.tabLab[i][19].changeMur();
			}

			for (int i = 15 ; i <= 16 ; i++){
				this.tabLab[i][20].changeMur();
			}

			for (int i = 16 ; i <= 17 ; i++){
				this.tabLab[i][21].changeMur();
			}

			for (int i = 17 ; i <= 18 ; i++){
				this.tabLab[i][22].changeMur();
			}

			for (int i = 14 ; i <= 17 ; i++){
				this.tabLab[i][2].changeMur();
			}

			for (int i = 14 ; i <= 16 ; i++){
				this.tabLab[i][3].changeMur();
			}

			for (int i = 19 ; i <= 21 ; i++){
				this.tabLab[i][2].changeMur();
			}

			for (int i = 19 ; i <= 21 ; i++){
				this.tabLab[i][3].changeMur();
			}

			for (int i = 19 ; i <= 22 ; i++){
				this.tabLab[i][4].changeMur();
			}

			for (int i = 18 ; i <= 22 ; i++){
				this.tabLab[i][5].changeMur();
			}

			for (int i = 19 ; i <= 21 ; i++){
				this.tabLab[i][7].changeMur();
			}

			for (int i = 19 ; i <= 22 ; i++){
				this.tabLab[i][8].changeMur();
			}

			for (int i = 18 ; i <= 21 ; i++){
				this.tabLab[i][9].changeMur();
			}


			this.tabLab[18][10].changeMur();
			this.tabLab[18][11].changeMur();
			this.tabLab[21][10].changeMur();
			this.tabLab[21][15].changeMur();
			this.tabLab[22][17].changeMur();
			this.tabLab[20][20].changeMur();


			for (int i = 20 ; i <= 22 ; i++){
				this.tabLab[i][12].changeMur();
			}

			for (int i = 12 ; i <= 17 ; i++){
				this.tabLab[20][i].changeMur();
			}

			for (int i = 18 ; i <= 19 ; i++){
				this.tabLab[i][14].changeMur();
			}

			for (int i = 19 ; i <= 21 ; i++){
				this.tabLab[i][19].changeMur();
			}

			for (int i = 19 ; i <= 21 ; i++){
				this.tabLab[21][i].changeMur();
			}
		}

	}

	public Case [][] getTabLab() {
		return this.tabLab;
	}


	public void placerPerso(Personnage perso){
		this.p = perso;
	}

	public Personnage getP() {
		return p;
	}

	public void setP(Personnage p) {
		this.p = p;
	}

	public void setTabLab(Case[][] tabLab) {
		this.tabLab = tabLab;
	}

}
