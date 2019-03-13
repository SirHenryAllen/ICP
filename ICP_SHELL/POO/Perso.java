import java.util.Scanner;

public class Perso {
	private String nom;
	private boolean sexe;
	private int age; 
	private String race;
	private int taille;
	private int poids;
	private double tai;

	public Perso () {
		
		String s;
		int x;
		Scanner in = new Scanner (System.in);
		
		System.out.print("Comment s'appelle votre personnage ? ");
		s = in.nextLine();
		this.nom = s;
		
		System.out.print("Quel est son sexe ? m/f : ");
		s = in.nextLine();
		if (s.charAt(0) == 'm') {
			this.sexe = false;
		} else { this.sexe = true; }

		System.out.print("Quelle est sa race ? ");
		s = in.nextLine();
		this.race = s;

		System.out.print("Quel est son age ? ");
		x = in.nextInt();
		this.age = x;
		
		System.out.print("Quelle est sa taille ? (en cm) : ");
		x = in.nextInt();
		this.taille = x;

		System.out.print("Quelle est son poids ? (en kg) : ");
		x = in.nextInt();
		this.poids = x;

		this.tai = tAI(this.taille, this.poids);

		affichage();

	}

	public String getNom() {
		return this.nom;
	}
	public boolean getSexe() {
		return this.sexe;
	}
	public int getAge() {
		return this.age;
	}
	public String getRace() {
		return this.race;
	}
	public int getTaille() {
		return this.taille;
	}
	public int getPoids() {
		return this.poids;
	}
	public double getTAI() {
		return this.tai;
	}

/*	public void setNom (String n) {
		this.nom = n;
	}
	public void setSexe (boolean s) {
		this.sexe = s;
	}
	public void setAge (int a) {
		this.age = a;
	}
	public void setRace (int r) {
		this.race = r;
	}
	public void setTaille (int t) {
		this.taille = t;
	}
	public void setPoids (int p) {
		this.poids = p;
	}*/

	public double tAI (double t, double p) {
		double tai = t/10 + p/10;
		return tai;
	}

	public void affichage() {
		
		String s;

		if (this.sexe == true) {
			s = "femelle";
		} else {
			s = "male";
		}

		System.out.println("\n------------------------------------");
		System.out.println("\nRécapitulatif de votre personnage : ");
		System.out.println("\nNom : " + this.nom + "\nSexe : " + s + "\nRace : " + this.race + "\nAge : " + this.age + " ans\nPoids : " + this.poids + " kg\nTaille : " + this.taille + " cm\n");
		System.out.println("------------------------------------\n");
	}
}