import java.util.Scanner;

public class Caracteristiques {
	private int _force;
	private int _dexterite;
	private int _constitution;
	private int _pouvoir;
	private int _intelligence;
	private int _charisme;

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
				if (_charisme != 0) {
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
							this._force = x;
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
							this._dexterite = x;
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
							this._constitution = x;
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
							this._pouvoir = x;
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
							this._intelligence = x;
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
							this._charisme = x;
							break;
						}
				} break;
			case 6 : check = 1; break;
			}
		}
		affichage();
	} 

	public int getForce() {
		return this._force;
	} 
	public int getDexterite() {
		return this._dexterite;
	}
	public int getConstitution() {
		return this._constitution;
	}
	public int getPouvoir() {
		return this._pouvoir;
	}
	public int getIntelligence() {
		return this._intelligence;
	}
	public int getCharisme() {
		return this._charisme;
	}

	public void setForce (int f) {
		this._force = f;
	}
	public void setDexterite (int d) {
		this._dexterite = d;
	}
	public void setConstitution (int c) {
		this._constitution = c;
	}
	public void setPouvoir (int p) {
		this._pouvoir = p;
	}
	public void setIntelligence (int i) {
		this._intelligence = i;
	}
	public void setCharisme (int c) {
		this._charisme = c;
	}

	public void affichage () {
		System.out.println("\n------------------------------------");
		System.out.println("Caractéristiques :\n");
		System.out.println("Force = " + this._force + "/100\n" + "Dexterite = " + this._dexterite + "/100\n" + "Constitution = " + this._constitution + "/100\n" + "Pouvoir = " + this._pouvoir + "/100\n" + "intelligence = " + this._intelligence + "/100\n" + "Charisme = " + this._charisme + "/100");
		System.out.println("------------------------------------\n");
	}
}