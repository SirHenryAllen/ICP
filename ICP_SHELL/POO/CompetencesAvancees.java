import java.util.Scanner;

public class CompetencesAvancees {
	private String _compA;
	
	public CompetencesAvancees (int x) {

		Scanner in = new Scanner (System.in);
		int y = 0;
		int antiMarouflage = 0;

		switch (x) {

			/* culture citadine */
			case 0: System.out.println("Choisir un parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Danse\n - 3 : Jouer d'un instrument\n - 4 : Langue\n - 5 : Navigation\n"); 
			this._compA = "\nConnaissance de la région\nLangue maternelle\nSens de la rue\n";
			while (antiMarouflage < 1) {
				y = in.nextInt();
				switch (y) {
					case 0: this._compA += "Artisanat\n"; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += "Danse\n"; antiMarouflage++; break;
					case 3: this._compA += "Jouer d'un instrument\n"; antiMarouflage++; break;
					case 4: this._compA += "Langue\n"; antiMarouflage++; break;
					case 5: this._compA += "Navigation\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;

			/* culture civilisée */
			case 1: System.out.println("Choisir 3 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Danse\n - 3 : Expression artistique\n - 4 : Jouer d'un instrument\n - 5 : Langue\n - 6 : Mécanisme\n - 7 : Sens de la rue\n");
			this._compA = "\nCourtoisie\nConnaissance de la région\nLangue maternelle\n";
			while (antiMarouflage < 3) {
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += "Artisanat\n"; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += "Danse\n"; antiMarouflage++; break;
					case 3: this._compA += "Expression artistique\n"; antiMarouflage++; break;
					case 4: this._compA += "Jouer d'un instrument\n"; antiMarouflage++; break;
					case 5: this._compA += "Langue\n"; antiMarouflage++; break;
					case 6: this._compA += "Mécanisme\n"; antiMarouflage++; break;
					case 7: this._compA += "Sens de la rue\n"; antiMarouflage++; break; 
				}
			} 
			this.affichage();
			antiMarouflage = 0;
			break;
			
			/* culture maritime */
			case 2: System.out.println("Choisir 1 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Langue\n - 3 : Navigation\n");
			this._compA = "\nLangue maternelle\nConnaissance de la région\n";
			while (antiMarouflage < 1) {
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += "Artisanat\n"; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += "Langue\n"; antiMarouflage++; break;
					case 3: this._compA += "Navigation\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;		
			break;		
			
			/* culture noble */
			case 3: System.out.println("Choisir 2 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Danse\n - 3 : Jouer d'un instrument\n - 4 : Langue\n - 5 : Navigation\n");
			this._compA = "\nConnaissance de la région\nLangue maternelle\n";
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += "Artisanat\n"; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += "Danse\n"; antiMarouflage++; break;
					case 3: this._compA += "Jouer d'un instrument\n"; antiMarouflage++; break;
					case 4: this._compA += "Langue\n"; antiMarouflage++; break;
					case 5: this._compA += "Navigation\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;
			
			/* culture primitive */
			case 4 : this._compA = "Langue maternelle\nConnaissance de la région\nPistage\nSurvie\n";
			this.affichage();
			break;

			/* culture rurale */
			case 5 : System.out.println("Choisir 2 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Danse\n - 3 : Jouer d'un instrument\n - 4 : Survie\n");
			this._compA = "\nLangue maternelle\nConnaissance de la région\n";
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += "Artisanat\n"; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += "Danse\n"; antiMarouflage++; break;
					case 3: this._compA += "Jouer d'un instrument\n"; antiMarouflage++; break;
					case 4: this._compA += "Survie\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;

			/* culture nomade artique */
			case 6: System.out.println("choisir 1 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Pistage\n");
			this._compA = "\nConnaissance de la région\nLangue maternelle\nSurvie\n";
			while (antiMarouflage < 1) {
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += "Artisanat\n"; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += "Pistage\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;

			/* culture nomade désertique */
			case 7: System.out.println("choisir 1 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Pistage\n");
			this._compA = "\nConnaissance de la région\nLangue maternelle\nSurvie\n";
			while (antiMarouflage < 1) {
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += "Artisanat\n"; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += "Pistage\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;
			
			/* culture nomade tempérée */
			case 8: System.out.println("choisir 1 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Pistage\n");	
			this._compA = "\nConnaissance de la région\nLangue maternelle\nSurvie\n";
			while (antiMarouflage < 1) {
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += "Artisanat\n"; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += "Pistage\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;
		}
	}

	public static String fCon() {
		String s;
		Scanner in = new Scanner (System.in);
		System.out.println("entrez le nom de la connaissance désirée");
		s = in.nextLine();
		return s;
	}

	public void affichage() {
		System.out.println("\nVos compétences avancées :\n" + this._compA);
	}
}