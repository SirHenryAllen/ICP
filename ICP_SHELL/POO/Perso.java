import java.util.Scanner;

public class Perso {
	private String _nom;
	private boolean _sexe;
	private int _age; 
	private String _race;
	private int _taille;
	private int _poids;
	private double _tai;

	public Perso () {
		
		String s;
		int x;
		Scanner in = new Scanner (System.in);
		
		System.out.print("Comment s'appelle votre personnage ? ");
		s = in.nextLine();
		this._nom = s;
		
		System.out.print("Quel est son sexe ? m/f : ");
		s = in.nextLine();
		if (s.charAt(0) == 'm') {
			this._sexe = false;
		} else { this._sexe = true; }

		System.out.print("Quelle est sa race ? ");
		s = in.nextLine();
		this._race = s;

		System.out.print("Quel est son age ? ");
		x = in.nextInt();
		this._age = x;
		
		System.out.print("Quelle est sa taille ? (en cm) : ");
		x = in.nextInt();
		this._taille = x;

		System.out.print("Quelle est son poids ? (en kg) : ");
		x = in.nextInt();
		this._poids = x;

		this._tai = tAI(this._taille, this._poids);

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