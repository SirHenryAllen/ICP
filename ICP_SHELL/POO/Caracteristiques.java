import java.util.Scanner;

public class Caracteristiques {
	private int force;
	private int dexterite;
	private int constitution;
	private int pouvoir;
	private int intelligence;
	private int charisme;

	public Caracteristiques () {
		
		String s;
		int x;
		int pts = 280;
		int ic = 0;
		int check = 0;

		Scanner in = new Scanner (System.in);
		System.out.print("Déterminons maintenant les caractéristiques primaires de votre personnage.");
		s = in.nextLine();
		System.out.println("Vous possédez 280 points à répartir.");
		s = in.nextLine();
		System.out.print("RAPPEL : Attention à ne pas excéder 95 points ni à être inférieur à 6 dans chaque caractéristique.\n");
		s = in.nextLine();

		while (check == 0) {
			if (pts < 6) {
				if (charisme != 0) {
					break;
				} else {
					System.out.println("Oups, plus de points :/ - On recommence...");
					ic = 0;
					pts = 280;
				}
			}
			switch (ic++) {
			case 0 : while (true) {
						System.out.print("Force = ");
						x = in.nextInt();
						pts = pts - x;
						if (x < 6 || x > 95 || x < 0) {
							System.out.println("RAPPEL : Attention à ne pas excéder 95 points ni à être inférieur à 6 dans chaque caractéristique");
							pts = pts + x;
						} else {
							this.force = x;
							System.out.println("Points restants : " + pts);
							break;
						}
					} break;
			case 1 : while (true) {
						System.out.print("Dexterite = ");
						x = in.nextInt();
						pts = pts - x;
						if (x < 6 || x > 95 || x < 0) {
							System.out.println("RAPPEL : Attention à ne pas excéder 95 points ni à être inférieur à 6 dans chaque caractéristique");
							pts = pts + x;
						} else {
							this.dexterite = x;
							System.out.println("Points restants : " + pts);
							break;
						}
				} break;
			case 2 : while (true) {
						System.out.print("Constitution = ");
						x = in.nextInt();
						pts = pts - x;
						if (x < 6 || x > 95 || x < 0) {
							System.out.println("RAPPEL : Attention à ne pas excéder 95 points ni à être inférieur à 6 dans chaque caractéristique");
							pts = pts + x;
						} else {
							this.constitution = x;
							System.out.println("Points restants : " + pts);
							break;
						}
				} break;
			case 3 : while (true) {
						System.out.print("Pouvoir = ");
						x = in.nextInt();
						pts = pts - x;
						if (x < 6 || x > 95 || x < 0) {
							System.out.println("RAPPEL : Attention à ne pas excéder 95 points ni à être inférieur à 6 dans chaque caractéristique");
							pts = pts + x;
						} else {
							this.pouvoir = x;
							System.out.println("Points restants : " + pts);
							break;
						}
				} break;
			case 4 : while (true) {
						System.out.print("intelligence = ");
						x = in.nextInt();
						pts = pts - x;
						if (x < 6 || x > 95 || x < 0) {
							System.out.println("RAPPEL : Attention à ne pas excéder 95 points ni à être inférieur à 6 dans chaque caractéristique");
							pts = pts + x;
						} else {
							this.intelligence = x;
							System.out.println("Points restants : " + pts);
							break;
						}
				} break;
			case 5 : while (true) {
						System.out.print("Charisme = ");
						x = in.nextInt();
						pts = pts - x;
						if (x < 6 || x > 95 || x < 0) {
							System.out.println("RAPPEL : Attention à ne pas excéder 95 points ni à être inférieur à 6 dans chaque caractéristique");
							pts = pts + x;
						} else {
							this.charisme = x;
							break;
						}
				} break;
			case 6 : check = 1; break;
			}
		}
		affichage();
	} 

	public int getForce() {
		return this.force;
	} 
	public int getDexterite() {
		return this.dexterite;
	}
	public int getConstitution() {
		return this.constitution;
	}
	public int getPouvoir() {
		return this.pouvoir;
	}
	public int getIntelligence() {
		return this.intelligence;
	}
	public int getCharisme() {
		return this.charisme;
	}

	public void setForce (int f) {
		this.force = f;
	}
	public void setDexterite (int d) {
		this.dexterite = d;
	}
	public void setConstitution (int c) {
		this.constitution = c;
	}
	public void setPouvoir (int p) {
		this.pouvoir = p;
	}
	public void setIntelligence (int i) {
		this.intelligence = i;
	}
	public void setCharisme (int c) {
		this.charisme = c;
	}

	public void affichage () {
		System.out.println("\n------------------------------------");
		System.out.println("Récapitulatif caractéristiques :\n");
		System.out.println("Force = " + this.force + "/100\n" + "Dexterite = " + this.dexterite + "/100\n" + "Constitution = " + this.constitution + "/100\n" + "Pouvoir = " + this.pouvoir + "/100\n" + "intelligence = " + this.intelligence + "/100\n" + "Charisme = " + this.charisme + "/100");
		System.out.println("------------------------------------\n");
	}
}