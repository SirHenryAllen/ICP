import java.util.Scanner;

public class CompetencesAvancees {
	private String _compA;
	public static int a, b, c, d, e, f, g = 0;
	public static String stringAux = "";
	
	public CompetencesAvancees (int x) {

		Scanner in = new Scanner (System.in);
		int y = 0;
		int antiMarouflage = 0;

		switch (x) {

			/* culture citadine */
			case 0: System.out.println("######################################\nChoisir un parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Danse\n - 3 : Jouer d'un instrument\n - 4 : Langue\n - 5 : Navigation\n"); 
			this._compA = "\n - Connaissance de la région\n - Langue maternelle\n - Sens de la rue\n";
			while (antiMarouflage < 1) {
				System.out.print("Votre choix : ");
				y = in.nextInt();
				switch (y) {
					case 0: this._compA += " - Artisan de niveau 1 : Artisan amateur en : " + fArti() + "\nVous êtes capables de bricoler des objets utiles dans votre domaine\nUn atout majeur durant vos aventures\n"; antiMarouflage++; break;
					case 1: this._compA += " - Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += " - Danseur de niveau 1 : Danseur amateur\n(Vous avez du talent pour la danse !\nCela vous permet de distraire vos compagnons ou de prendre\nl'avantage dans certaines situation.)\n"; antiMarouflage++; break;
					case 3: this._compA += " - Musicien de niveau 1 : Musicien amateur\n(Vous connaissez la musique. En tous cas,\nsuffisament bien pour égailler des veillées autour du feu...)\n"; antiMarouflage++; break;
					case 4: this._compA += " - Langue de niveau 1 : Maîtrise du : " + fLan(); antiMarouflage++; break;
					case 5: this._compA += " - Navigateur de niveau 1 : Bases en navigation.\n(Vous avez une certaine expérience du milieu maritime et êtes donc capable\nd'une certaine expertise lorsque vous vous trouvez sur un bateau.)\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;

			/* culture civilisée */
			case 1: System.out.println("######################################\nChoisir 3 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Danse\n - 3 : Expression artistique\n - 4 : Jouer d'un instrument\n - 5 : Langue\n - 6 : Mécanisme\n - 7 : Sens de la rue\n");
			this._compA = "\n - Courtoisie\n - Connaissance de la région\n - Langue maternelle\n";
			while (antiMarouflage < 3) {
				if (antiMarouflage == 0) {
					System.out.print("\nPremière compétence : ");
				}
				if (antiMarouflage == 1) {
					System.out.print("\nDeuxième compétence : ");
				}
				if (antiMarouflage == 2) {
					System.out.print("\nTroisième compétence : ");
				}
				y = in.nextInt();
				switch(y) {
					case 0: a++; antiMarouflage++; break;
					case 1: this._compA += " - Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: b++; antiMarouflage++; break;
					case 3: c++; antiMarouflage++; break;
					case 4: d++; antiMarouflage++; break;
					case 5: e++; antiMarouflage++; break;
					case 6: f++; antiMarouflage++; break;
					case 7: g++; antiMarouflage++; break; 
				}
			} 
			if (a == 3) {
				this._compA += " - Artisan de niveau 3 : Maître artisan en : " + fArti() + "\n(Votre art n'a plus de secrets pour vous ! Postulez pour devenir\n l'artisan d'un roi ou d'un empereur, vous avez toutes vos chances...)\n";
			}
			else if (a == 2) {
				this._compA += " - Artisan de niveau 2 : Artisan de profession en : " + fArti() + "\n(Vous avez une connaissance poussée de votre métier\nVous êtes capable de concevoir des pièces d'une grande qualité)\n";
			}
			else if (a == 1) {
				this._compA += " - Artisan de niveau 1 : Artisan amateur en : " + fArti() + "\nVous êtes capables de bricoler des objets utiles dans votre domaine\nUn atout majeur durant vos aventures\n";
			}
			if (b == 3) {
				this._compA += " - Danseur de niveau 3 : Danseur illusre\n(Vous dansez pour distraire les personnes les plus importantes du monde.\nVous êtes même parfois reconnu dans la rue\n";
			}
			else if (b == 2) {
				this._compA += " - Danseur de niveau 2 : Danseur de profession\n(La danse est votre métier et pouvez gagner votre vie grace à elle.)\n";
			}
			else if (b == 1) {
				this._compA += " - Danseur de niveau 1 : Danseur amateur\n(Vous avez du talent pour la danse !\nCela vous permet de distraire vos compagnons ou de prendre\nl'avantage dans certaines situation.)\n";
			}
			if (c == 3) {
				this._compA += " - Artiste de niveau 3 : Artiste reconnu\n(Votre art ainsi que votre talent sont reconnus dans le monde entier.)\n";
			}
			else if (c == 2) {
				this._compA += " - Artiste de niveau 2 : Artiste de profession\n(Vos création vous fond vivre.)\n";
			}
			else if (c == 1) {
				this._compA += " - Artiste de niveau 1 : Artiste amateur\n(L'art est une passion pour vous, elle vous permet de vous évader dans les moments difficiles.)\n";
			}
			if (d == 3) {
				this._compA += " - Musicien de niveau 3 : Musicien illustre\n(Vos compositions et votre talent de musicien sont reconnus dans le monde entier.)\n";
			}
			else if (d == 2) {
				this._compA += " - Musicien de niveau 2 : Musicien de profession\n(La musique est votre métier, elle vous fait vivre.)\n";
			}
			else if (d == 1) {
				this._compA += " - Musicien de niveau 1 : Musicien amateur\n(Vous connaissez la musique. En tous cas,\nsuffisament bien pour égailler des veillées autour du feu...)\n";
			}
			if (e == 3) {
				this._compA += " - Langue de niveau 3 : Expert dans toutes langues\n(Aucune langue ne vous résite !\nSi vous n'en maîtrisé pas une, vous l'apprendrai bien assez vite.)\n";
			}
			else if (e == 2) {
				this._compA += " - Langue de niveau 2 : Maîtrise du : " + fLan() + " et du : " + fLan() + "\n";
			}
			else if (e == 1) {
				this._compA += " - Langue de niveau 1 : Maîtrise du : " + fLan() + "\n";
			}
			if (f == 3) {
				this._compA += " - Mécanismes de niveau 3 : Maître en mécanique & mécanisme\n(Que ce soit les mécanisme de précision comme l'horlogerie\nou la grosse mécanique qui fait déplacer des trucs\nvous êtes un expert !\nConstruisez des trébuchets ou fabriquez des montres...)\n";
			}
			else if (f == 2) {
				this._compA += " - Mécanismes de niveau 2 : Mécanicien de profession\n(Vous êtes un vrai professionnel de tout ce qui tourne ou se déplace.)\n";
			}
			else if (f == 1) {
				this._compA += " - Mécanisme de niveau 1 : Mécanicien amateur\n(Vous êtes capable de fabriquer certains mécanismes simples\nou des systèmes mécaniques basiques.)\n";
			}
			if (g == 3) {
				this._compA += " - Sens de la rue de niveau 3 : Connaissance sans faille de la rue\n(Pour vous, impossible de vous perdre dans une rue !\nLes yeux bandés ou non.)\n";
			}
			else if (g == 2) {
				this._compA += " - Sens de la rue de niveau 2 : Guide de la rue\n(Votre connaissance de la rue et de ses subtilités vous permet\nde guider n'importe qui et de vous extraire de situations délicates, rapidement.)\n";
			}
			else if (g == 1) {
				this._compA += " - Sens de la rue de niveau 1 : Bon sens de l'orientation en ville\n(Facile pour vous de trouver votre chemin.)\n";
			}


			this.affichage();
			antiMarouflage = 0;
			break;
			
			/* culture maritime */
			case 2: System.out.println("######################################\nChoisir 1 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Langue\n - 3 : Navigation\n");
			this._compA = "\n - Langue maternelle\n - Connaissance de la région\n";
			while (antiMarouflage < 1) {
				System.out.print("Votre choix : ");
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += " - Artisan de niveau 1 : Artisan amateur en : " + fArti() + "\nVous êtes capables de bricoler des objets utiles dans votre domaine\nUn atout majeur durant vos aventures\n"; antiMarouflage++; break;
					case 1: this._compA += " - Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += " - Langue de niveau 1 : Maîtrise du : " + fLan(); antiMarouflage++; break;
					case 3: this._compA += " - Navigateur de niveau 1 : Bases en navigation.\n(Vous avez une certaine expérience du milieu maritime et êtes donc capable\nd'une certaine expertise lorsque vous vous trouvez sur un bateau.)\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;		
			break;		
			
			/* culture noble */
			case 3: System.out.println("######################################\nChoisir 2 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Danse\n - 3 : Jouer d'un instrument\n - 4 : Langue\n - 5 : Navigation\n");
			this._compA = "\n - Connaissance de la région\n - Langue maternelle\n";
			while(antiMarouflage < 2) {
				if (antiMarouflage == 0) {
					System.out.print("\nPremière compétence : ");
				}
				if (antiMarouflage == 1) {
					System.out.print("\nSeconde compétence : ");
				}
				y = in.nextInt();
				switch(y) {
					case 0: a++; antiMarouflage++; break;
					case 1: this._compA += " - Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: b++; antiMarouflage++; break;
					case 3: c++; antiMarouflage++; break;
					case 4: d++; antiMarouflage++; break;
					case 5: e++; antiMarouflage++; break;
				}
			}
			if (a == 2) {
				this._compA += " - Artisan de niveau 2 : Artisan de profession en : " + fArti() + "\n(Vous avez une connaissance poussée de votre métier\nVous êtes capable de concevoir des pièces d'une grande qualité)\n";
			}
			else if (a == 1) {
				this._compA += " - Artisan de niveau 1 : Artisan amateur en : " + fArti() + "\nVous êtes capables de bricoler des objets utiles dans votre domaine\nUn atout majeur durant vos aventures\n";
			}
			if (b == 2) {
				this._compA += " - Danseur de niveau 2 : Danseur de profession\n(La danse est votre métier et pouvez gagner votre vie grace à elle.)\n";
			}
			else if (b == 1) {
				this._compA += " - Danseur de niveau 1 : Danseur amateur\n(Vous avez du talent pour la danse !\nCela vous permet de distraire vos compagnons ou de prendre\nl'avantage dans certaines situation.\n)";
			}
			if (c == 2) {
				this._compA += " - Musicien de niveau 2 : Musicien de profession\n(La musique est votre métier, elle vous fait vivre.)\n";
			}
			else if (c == 1) {
				this._compA += " - Musicien de niveau 1 : Musicien amateur\n(Vous connaissez la musique. En tous cas,\nsuffisament bien pour égailler des veillées autour du feu...)\n";
			}
			if (d == 2) {
				this._compA += " - Langue de niveau 2 : Maîtrise du : " + fLan() + " et du : " + fLan() + "\n";
			}
			else if (d == 1) {
				this._compA += " - Langue de niveau 1 : Maîtrise du : " + fLan() + "\n";
			}
			if (e == 2) {
				this._compA += " - Navigateur de niveau 2 : Navigateur de profession\n(L'eau coule dans vos veine ! Le véritable chez vous, c'est sur un vavire...\nSi vous ne l'êtes pas déjà, vous pouvez sans soucis devenir capitaine d'un jour (ou deux...).)\n";
			}
			else if (e == 1) {
				this._compA += " - Navigateur de niveau 1 : Bases en navigation.\n(Vous avez une certaine expérience du milieu maritime et êtes donc capable\nd'une certaine expertise lorsque vous vous trouvez sur un bateau.)\n";
			}
			this.affichage();
			antiMarouflage = 0;
			break;
			
			/* culture primitive */
			case 4 : this._compA = " - Langue maternelle\n - Connaissance de la région\n - Pistage\n - Survie\n";
			this.affichage();
			break;

			/* culture rurale */
			case 5 : System.out.println("######################################\nChoisir 2 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Danse\n - 3 : Jouer d'un instrument\n - 4 : Survie\n");
			this._compA = "\nLangue maternelle\nConnaissance de la région\n";
			while(antiMarouflage < 2) {
				if (antiMarouflage == 0) {
					System.out.print("\nPremière compétence : ");
				}
				if (antiMarouflage == 1) {
					System.out.print("\nSeconde compétence : ");
				}
				y = in.nextInt();
				switch(y) {
					case 0: a++; antiMarouflage++; break;
					case 1: this._compA += "Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: b++; antiMarouflage++; break;
					case 3: c++; antiMarouflage++; break;
					case 4: d++; antiMarouflage++; break;
				}
			}
			if (a == 2) {
				this._compA += " - Artisan de niveau 2 : Artisan de profession en : " + fArti() + "\n(Vous avez une connaissance poussée de votre métier\nVous êtes capable de concevoir des pièces d'une grande qualité)\n";
			}
			else if (a == 1) {
				this._compA += " - Artisan de niveau 1 : Artisan amateur en : " + fArti() + "\nVous êtes capables de bricoler des objets utiles dans votre domaine\nUn atout majeur durant vos aventures\n";
			}
			if (b == 2) {
				this._compA += " - Danseur de niveau 2 : Danseur de profession\n(La danse est votre métier et pouvez gagner votre vie grace à elle.)\n";
			}
			else if (b == 1) {
				this._compA += " - Danseur de niveau 1 : Danseur amateur\n(Vous avez du talent pour la danse !\nCela vous permet de distraire vos compagnons ou de prendre\nl'avantage dans certaines situation.\n)";
			}
			if (c == 2) {
				this._compA += " - Musicien de niveau 2 : Musicien de profession\n(La musique est votre métier, elle vous fait vivre.)\n";
			}
			else if (c == 1) {
				this._compA += " - Musicien de niveau 1 : Musicien amateur\n(Vous connaissez la musique. En tous cas,\nsuffisament bien pour égailler des veillées autour du feu...)\n";
			}
			if (d == 2) {
				this._compA += " - Survivant de niveau 2 : Connaisseur des milieux difficiles.\n(Vous avez connu des situations difficiles où votre survie\na dépendue de votre capacité à vous adapter à votre environnement.\nEn cas de problèmes, vous arriverez sans mal à vous en sortir une nouvelle fois...).\n";
			}
			else if (d == 1) {
				this._compA += " - Suvrivant de niveau 1 : Bases de la survie.\n(Vous avez, grâce à quelques expériences ou rencontres, acquis\nquelques connaissances pour survivre en milieu hostile.\nVous êtes donc capable de faire appel à ces connaissances pour tenter\nde ne pas mourrir de faim, de froid, de chaud, ou d'autre chose...).\n";
			}
			this.affichage();
			antiMarouflage = 0;
			break;

			/* culture nomade artique */
			case 6: System.out.println("######################################\nchoisir 1 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Pistage\n");
			this._compA = "\n - Connaissance de la région\n - Langue maternelle\n - Survie\n";
			while (antiMarouflage < 1) {
				System.out.print("Votre choix : ");
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += " - Artisan de niveau 1 : Artisan amateur en : " + fArti() + "\n(Vous êtes capables de bricoler des objets utiles dans votre domaine\nUn atout majeur durant vos aventures)\n"; antiMarouflage++; break;
					case 1: this._compA += " - Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += " - Pistage de niveau 1 : Pisteur amareur\nCela vous arrive de temps à autres de pister une bête ou autre chose...).\n"; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;

			/* culture nomade désertique */
			case 7: System.out.println("######################################\nchoisir 1 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Pistage\n");
			this._compA = "\n - Connaissance de la région\n - Langue maternelle\n - Survie\n";
			while (antiMarouflage < 1) {
				System.out.print("Votre choix : ");
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += " - Artisan de niveau 1 : Artisan amateur en : " + fArti() + "\n(Vous êtes capables de bricoler des objets utiles dans votre domaine\nUn atout majeur durant vos aventures)\n"; antiMarouflage++; break;
					case 1: this._compA += " - Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += " - Pistage de niveau 1 : Pisteur amareur\nCela vous arrive de temps à autres de pister une bête ou autre chose...)."; antiMarouflage++; break;
				}
			}
			this.affichage();
			antiMarouflage = 0;
			break;
			
			/* culture nomade tempérée */
			case 8: System.out.println("######################################\nchoisir 1 parmi :\n - 0 : Artisanat\n - 1 : Connaissance (au choix)\n - 2 : Pistage\n");	
			this._compA = "\n - Connaissance de la région\n - Langue maternelle\n - Survie\n";
			while (antiMarouflage < 1) {
				System.out.print("Votre choix : ");
				y = in.nextInt();
				switch(y) {
					case 0: this._compA += " - Artisan de niveau 1 : Artisan amateur en : " + fArti() + "\n(Vous êtes capables de bricoler des objets utiles dans votre domaine\nUn atout majeur durant vos aventures)\n"; antiMarouflage++; break;
					case 1: this._compA += " - Connaissance en : " + fCon() + "\n"; antiMarouflage++; break;
					case 2: this._compA += " - Pistage de niveau 1 : Pisteur amareur\nCela vous arrive de temps à autres de pister une bête ou autre chose...)."; antiMarouflage++; break;
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
		System.out.println("Entrez le nom de la connaissance désirée : ");
		s = in.nextLine();
		return s;
	}
	public static String fLan() {
		String s;
		Scanner in = new Scanner (System.in);
		System.out.println("Entrez le nom de la langue parlée : ");
		s = in.nextLine();
		return s;
	}
	public static String fArti() {
		String s;
		Scanner in = new Scanner (System.in);
		System.out.println("Entrez le nom de la technique d'artisanat maîtrisée : ");
		s = in.nextLine();
		return s;
	}

	public void affichage() {
		System.out.println("######################################\nVos compétences avancées :\n" + this._compA);
	}
}