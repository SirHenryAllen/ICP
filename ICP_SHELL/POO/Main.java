import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {

		Intro.affichage();

		String s;
		Scanner in = new Scanner (System.in);
		System.out.println("[enter] pour continuer");
		s = in.nextLine();

		Perso per = new Perso ();

		boolean checkPerso = false;

		while (checkPerso == false) {
			System.out.println("Recommencer ? o/n");
			s = in.nextLine();
			if (s.charAt(0) == 'o') {
				System.out.println("");
				per = new Perso();
			} else {
				System.out.println("");
				checkPerso = true;
			}
		}

		Caracteristiques car = new Caracteristiques ();

		boolean checkCar = false;

		while (checkCar == false) {
			System.out.println("Recommencer ? o/n");
			s = in.nextLine();
			if (s.charAt(0) == 'o') {
				System.out.println("");
				car = new Caracteristiques();
			} else {
				System.out.println("");
				checkCar = true;
			}
		}

		System.out.println("------------------------------------\n");
		System.out.println("Déterminons maintenant ses compétences de base :\n");
		System.out.println("------------------------------------\n");
		s = in.nextLine();
		Competences com = new Competences (car.getForce(), car.getDexterite(), car.getConstitution(), car.getPouvoir(), car.getIntelligence(), car.getCharisme(), per.getTAI());

		s = in.nextLine();

		System.out.println("------------------------------------\n");
		System.out.println("Au tour des compétences de combat :\n");
		System.out.println("------------------------------------\n");
		s = in.nextLine();	
		Combat combat = new Combat (car.getForce(), car.getDexterite());

		s = in.nextLine();

		System.out.println("------------------------------------\n");
		System.out.println("Vous allez maintenant sélectionner la culture de votre personnage :\n");
		System.out.println("------------------------------------\n");
		s = in.nextLine();	
		Culture cul = new Culture (per, car, com, combat);

		s = in.nextLine();

		/*
		System.out.println("------------------------------------\n");
		System.out.println("Vous allez maintenant sélectionner la profession de votre personnage :\n");
		System.out.println("------------------------------------\n");
		s = in.nextLine();	
		Profession prof = new Profession (per, car, com, combat, cul);

		Recap.affichage(prof, per, car, com, combat, cul);
		*/

		//cul.compAAffichage();
	}
}