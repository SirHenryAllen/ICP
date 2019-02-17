import java.util.Scanner;

public class Intro {
	
	public static void affichage() {

		Scanner in = new Scanner(System.in);
		String q;
		String m = "\nBienvenue dans cet interface d'aide à la création de personnages";
		
		System.out.println("");
		for (int i = 0 ; i<m.length() ; i++) {
			System.out.print("#");
		}
		System.out.println(m); 
		for (int j = 0 ; j<m.length() ; j++) {
			System.out.print("#");
		}
		System.out.println("\n");

		System.out.println("Voulez-vous afficher les régles o/n ?");
		q = in.nextLine();
		if (q.charAt(0) == 'n') {
		} else { regles(); }
	}

	public static void regles() {

		Scanner in = new Scanner(System.in);
		String q;
		String a = "Vous allez d'abord devoir répartir 280 points parmis 6 caracteristiques :";
		
		System.out.println("");
		for (int i = 0 ; i<a.length() ; i++) {
			System.out.print("-");
		}
		System.out.println("");		
		System.out.print(a);
		
		q = in.nextLine();
		System.out.print("	Force");
		q = in.nextLine();
		System.out.print("	Dextérite");
		q = in.nextLine();
		System.out.print("	Constitution");
		q = in.nextLine();
		System.out.print("	Pouvoir");
		q = in.nextLine();
		System.out.print("	Intelligence");
		q = in.nextLine();
		System.out.println("	Charisme\n");

		q = in.nextLine();
		String b = "Le nombre de points attribués dans chaque caractèristique ne doit pas excéder 95 ni être inférieur à 6";
		System.out.println(b);
		for (int j = 0 ; j<b.length() ; j++) {
			System.out.print("-");
		}
		System.out.println("\n");

		q = in.nextLine();
		String c = "ATTENTION à ne pas dépenser tous vos points dans les premières caractèristiques";
		System.out.println(c);
		for (int j = 0 ; j<c.length() ; j++) {
			System.out.print("-");
		}
		System.out.println("\n");
		
	}

}