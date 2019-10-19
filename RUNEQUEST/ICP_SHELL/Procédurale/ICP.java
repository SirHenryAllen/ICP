import java.util.Scanner;


public class ICP {

	public static void intro () {

		System.out.println("");
		for (int i = 0 ; i<138 ; i++) {
			System.out.print("#");
		}
		System.out.println("");
		for (int j = 0 ; j<50 ; j++) {
			System.out.print("#");
		}
		System.out.print(" Bienvenue dans l'interface d'aide à la ");
		for (int k = 0 ; k<48 ; k++) {
			System.out.print("#");
		}
		System.out.println("");
		for (int l = 0 ; l<57 ; l++) {
			System.out.print("#");
		}		
		System.out.print(" création de personnages ");
		for (int m = 0 ; m<56 ; m++) {
			System.out.print("#");
		}
		System.out.println("");
		for (int n = 0 ; n<67 ; n++) {
			System.out.print("#");
		} 
		System.out.print(" LTF ");
		for (int o = 0 ; o<66 ; o++) {
			System.out.print("#");
		}
		System.out.println("");
		for (int p = 0 ; p<138 ; p++) {
			System.out.print("#");
		}
		System.out.println("\n");
	}


	public static int[] caracteristiques () {

		int pts = 280;
		int forc = 0;
		int dex = 0;
		int con = 0;
		int pou = 0;
		int inte = 0;
		int cha = 0;
		int[] carP = new int[6];
		String[] carN = {"Force = " , "Dextérité = " , "Constitution = " , "Pouvoir = " , "Intelligence = " , "Charisme = "};
		String x = "";
		int check2 = 0;
		int check1 = 0;
		int val = 2;

		Scanner in = new Scanner(System.in);

		System.out.println("Vous avez 280 points à répartir parmi 6 caractèristiques :\n 		- Force \n 		- Dextérité \n 		- Constitution \n 		- Pouvoir \n 		- Intelligence \n 		- Charisme");
		System.out.println("Chaque caractèristique ne doit pas excéder 95 points ni être inférieur à 6");
		System.out.println("");
		System.out.println("[enter] pour continuer");
		x = in.nextLine();
		
		while (check2 == 0) {
			for (int i = 0 ; i<carP.length ; i++) {
				System.out.print(carN[i]);
				carP[i] = in.nextInt();
				pts = pts - carP[i];
				if ((pts < 0) || (carP[i] < 6 || carP[i] > 95)) {
					System.out.println("");
					System.out.println("Rappel : ne pas excéder 95 points ni être inférieur à 6");
					System.out.println("Attention à ne pas descendre en-dessous de 0 points de réserve");
					System.out.println("");
					pts = pts + carP[i];
					carP[i] = 0;
				}
				System.out.println("Points à distribuer restants : " + pts);
			}

			while (check1 == 0) {
				for (int j = 0 ; j<carP.length ; j++) {
					if (carP[j] == 0) {
						System.out.println(carN[j] + "0/100 ajoutez au moins 6 points");
						System.out.print(carN[j]);
						carP[j] = in.nextInt();
						pts = pts - carP[j];
						if ((pts < 0) || (carP[j] < 6 || carP[j] > 95)) {
							System.out.println("Rappel : ne pas excéder 95 points ni être inférieur à 6");
							System.out.println("Attention à ne pas descendre en-dessous de 0 points de réserve");
							pts = pts + carP[j];
							carP[j] = 0;
						} 
						System.out.println(pts);
					} else { check1 = 1; }
				}
			}

			System.out.println("\n");
			System.out.println("Caractéristiques de base :");
			System.out.println("");
			for (int k = 0 ; k<carP.length ; k++) {
				System.out.println(carN[k] + carP[k]);
			}
			System.out.println("");
			System.out.println("0 : pour recommencer, 1 : pour valider");
			val = in.nextInt();
			if (val == 0) {
				check2 = 0;
				check1 = 0;
				val = 2;
				pts = 280;
				for (int l = 0 ; l<carP.length ; l++) {
					carP[l] = 0;
				}
			}
			if (val == 1) {
				check2 = 1;
			}
		}

		return carP;
	}


	public static int[] competencesB (int[] car) {


		String[] compN = {"Premiers soins = " , "Acrobatie = " , "Athlétisme = " , "Canotage = " , "Chant = " , "Conduite = " , "Connaissance des animaux = " , "Connaissance des plantes = " , "Connaissance du monde = " , "Discretion = " , "Escamotage = " , "Equitation = " , "Esquive = " , "Evaluation = " , "Lancer = " , "Perception = " , "Persitence = " , "Persuasion = " , "Résistance = "};
		int[] compP = new int[19];
		Scanner in = new Scanner(System.in);
		String x = "";

		System.out.println("Vos compétences de base vont maintenant être calculées");
		System.out.println("");
		System.out.println("[enter] pour continuer");
		System.out.println("");
		x = in.nextLine();

		compP[0] = car[0]; //Premiers soins = intelligence
		compP[1] = car[1]; //Acronatie = dextérité
		if (car[0] < car[1]) {
			compP[2] = car[0] + car[1]/3; //Athlétisme = force + dextérité / 3
		} else { compP[2] = car[1] + car[0]/3; } //Athlétisme = (force / 3) + dextérité 
		compP[3] = car[0]; //Canotage = force
		compP[4] = car[5]; //Chant = charisme
		compP[5] = car[3] + 10; //Conduite = pouvoir + 10
		compP[6] = car[4]; //Connaissance des animaux = intelligence
		compP[7] = car[4]; //Connaissance des plantes = intelligence
		compP[8] = car[4]; //Connaissance du monde = intelligence
		compP[9] = 10 + car[1]; //Discretion = 10 + dextérité
		compP[10] = car[1]; //Escamotage = dextérité
		if (car[1] < car[3]) {
			compP[11] = car[1] + car[3]/3; //Equitation = dextérité + pouvoir / 3
		} else { compP[11] = car[1]/3 + car[3]; } //Equitation = dextérité / 3 + pouvoir
		compP[12] = car[1] + 10; //Esquive = dextérité + 10
		compP[13] = car[4]; //Evaluation = Intelligence
		if (car[0] < car[1]) {
			compP[14] = car[0] + car[1] / 3; //Lancer = force + dextérité / 3
		} else { compP[14] = car[1] + car[0]/3; } //Lancer = dextérité + force / 3
  		if (car[4] < car[3]) {
  			compP[15] = car[4] + car[3] / 3; //Perception = intelligence + pouvoir / 3
  		} else { compP[15] = car[3] + car[4] / 3; } //Perception = pouvoir + intelligence / 3
  		compP[16] = car[3] + 10; // Persistence = pouvoir + 10  
  		if (car[4] < car[5]) {
  			compP[17] = car[4] + car[5] / 3; //Persuasion = intelligence + charisme / 3
  		} else { compP[17] = car[5] + car[4] / 3; } //Persuasion = charisme + intelligence / 3
  		if (car[2] < car[3]) {
  			compP[18] = car[2] + car[3] / 3; //Résistance = constitution + pouvoir / 3
  		} else { compP[18] = car[3] + car[2] / 3; } //Résistance = pouvoir + constitution 3

  		for (int i = 0 ; i < compP.length ; i++) {
  			System.out.println(compN[i] + compP[i]);
  		}
  		System.out.println("");
  		return compP;
	}


		public static int[][] culture () {

			Scanner in = new Scanner(System.in);
			String x = "";
			int[][] t = new int[10][10]; 
			int y = 0;

			System.out.println("Vous allez maintenant choisir votre culture.");
			//System.out.println("");
			x = in.nextLine();
			System.out.println("Elle vous apportera des bonus aux statistiques de bases ainsi que de nouvelles caractéristiques relatives celle que vous aurez choisi. Il est donc nécessaire de choisir judicieusement votre culture afin que vos compétences soient cohérentes avec votre personnage.");
			x = in.nextLine();
			System.out.println("Pour lister les différentes cultures et leurs caractéristiques, tappez : 1 \nsinon 0 pour passer");
			y = in.nextInt();
			
			if (y == 1) {
				System.out.println("SOON");
			}

			System.out.println("");
			System.out.println("Choisissez maintenant votre culture : ");
			System.out.println("-----------------------------------------");
			System.out.println("1 : Culture barbare : ");
			System.out.println("");
			System.out.println("2 : Culture citadine : ");
			System.out.println("");
			System.out.println("3 : Culture civilisée");
			System.out.println("");
			System.out.println("4 : Culture maritime : ");
			System.out.println("");
			System.out.println("5 : culture Noble : ");
			System.out.println("");
			System.out.println("6 : Culture nomade artique : ");
			System.out.println("");
			System.out.println("7 : Culture nomade désertique : ");
			System.out.println("");
			System.out.println("8 : Culture nomade tempérée : ");
			System.out.println("");
			System.out.println("9 : Culture primitive : ");
			System.out.println("");
			System.out.println("10 : Culture rurale : ");
			System.out.println("");
			y = in.nextInt();

			if (y == 2) {
				
				t[0][0] = 2;
				t[1][0] = 10;
				t[1][1] = 10;
				t[1][2] = 10;
				t[1][3] = 10;

				System.out.println("Choisir deux à +10% parmis :\n - Canotage\n - Conduire\n - ");

			}

			return t;
		}
	

	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		String x = "";

		intro();

		System.out.println("[enter] pour continuer");
		x = in.nextLine();

		int[] car = caracteristiques();
		System.out.println("Debug = " + (java.util.Arrays.toString(car)));
		
		System.out.println("");
		System.out.println("[enter] pour continuer");
		x = in.nextLine();
		
		int[] compB = competencesB(car);
		System.out.println("Debug = " + (java.util.Arrays.toString(compB)));
		
		System.out.println("");
		System.out.println("[enter] pour continuer");
		x = in.nextLine();

/*		int[][] culture = culture();
		System.out.println("Debug = " + (java.util.Arrays.toString(culture)));
		System.out.println("Debug = OK");*/

	}

}