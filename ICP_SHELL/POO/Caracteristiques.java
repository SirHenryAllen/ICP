import java.util.Scanner;

public class Caracteristiques {
	
	public int force;
	public int dexterite;
	public int constitution;
	public int pouvoir;
	public int intelligence;
	public int charisme;

	public Caracteristiques () {

		int check = 0;
		Scanner in = new Scanner (System.in);
		int a;
		int pts = 280;
		int num;
		String caracteristique;

		//this.force = 0;
		//this.dexterite = 0;
		//this.constitution = 0;
		//this.pouvoir = 0;
		//this.intelligence = 0;
		//this.intelligence = 0;

		while (check == 0) {

		if (switchC() == 1) {
			System.out.print("Force = ");
			a = in.nextInt();
			pts = pts - a;
			if (pts <= 0 || a <= 6 || a >= 96 ) {
				pts = pts + a;
				System.out.println("Veuillez surveiller que votre réserve de points ne déscende pas en-dessous de 0");
				System.out.println("Ainsi que l'attribution des points dans une caractéristique ne dépasse pas 95 et ne soit pas inférieur à 6\n");
			}
			this.force = a;
			System.out.println(a);
		} else { this.force = 0; } 

		if (switchC() == 2) {
			System.out.print("Dextérité = ");
			a = in.nextInt();
			pts = pts - a;
			if (pts <= 0 || a <= 6 || a >= 96 ) {
				pts = pts + a;
				System.out.println("Veuillez surveiller que votre réserve de points ne déscende pas en-dessous de 0");
				System.out.println("Ainsi que l'attribution des points dans une caractéristique ne dépasse pas 95 et ne soit pas inférieur à 6\n");
			}
			this.dexterite = a;
			System.out.println(a);
		} else { this.dexterite = 0; }

		if (switchC() == 3) {
			System.out.print("Constitution = ");
			a = in.nextInt();
			pts = pts - a;
			if (pts <= 0 || a <= 6 || a >= 96 ) {
				pts = pts + a;
				System.out.println("Veuillez surveiller que votre réserve de points ne déscende pas en-dessous de 0");
				System.out.println("Ainsi que l'attribution des points dans une caractéristique ne dépasse pas 95 et ne soit pas inférieur à 6\n");
			}
			this.constitution = a;
			System.out.println(a);
		} else { this.constitution = 0; }

		if (switchC() == 4) {
			System.out.print("Pouvoir = ");
			a = in.nextInt();
			pts = pts - a;
			if (pts <= 0 || a <= 6 || a >= 96 ) {
				pts = pts + a;
				System.out.println("Veuillez surveiller que votre réserve de points ne déscende pas en-dessous de 0");
				System.out.println("Ainsi que l'attribution des points dans une caractéristique ne dépasse pas 95 et ne soit pas inférieur à 6\n");
			}
			this.pouvoir = a;
			System.out.println(a);
		} else { this.pouvoir = 0; }

		if (switchC() == 5) {
			System.out.print("Intelligence = ");
			a = in.nextInt();
			pts = pts - a;
			if (pts <= 0 || a <= 6 || a >= 96 ) {
				pts = pts + a;
				System.out.println("Veuillez surveiller que votre réserve de points ne déscende pas en-dessous de 0");
				System.out.println("Ainsi que l'attribution des points dans une caractéristique ne dépasse pas 95 et ne soit pas inférieur à 6\n");
			}
			this.intelligence = a;
			System.out.println(a);
		} else { this.intelligence = 0; }

		if (switchC() == 6) {
			System.out.print("Charisme = ");
			a = in.nextInt();
			pts = pts - a;
			if (pts <= 0 || a <= 6 || a >= 96 ) {
				pts = pts + a;
				System.out.println("Veuillez surveiller que votre réserve de points ne déscende pas en-dessous de 0");
				System.out.println("Ainsi que l'attribution des points dans une caractéristique ne dépasse pas 95 et ne soit pas inférieur à 6\n");
			}
			this.charisme = a;
			System.out.println(a);
		} else { this.charisme = 0; }
	}
}


	public int switchC() {

		Scanner in = new Scanner (System.in);

		int car;
		int caracteristique;
		System.out.println("1 : force - 2 : dextérite - 3 : constitution - 4 : pouvoir - 5 : intelligence - 6 : charisme");
		car = in.nextInt();

		switch (car) {
			case 1: caracteristique = 1; return caracteristique;
			case 2: caracteristique = 2; return caracteristique;
			case 3: caracteristique = 3; return caracteristique;
			case 4: caracteristique = 4; return caracteristique;
			case 5: caracteristique = 5; return caracteristique;
			case 6: caracteristique = 6; return caracteristique;
			default: caracteristique = 1; return caracteristique;		
		}
	}

}