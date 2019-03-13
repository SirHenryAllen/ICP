import java.util.Scanner;

public class Culture {

	public Culture () {

		Scanner in = new Scanner (System.in);
		String s;
		int x;
		int y;
		int antiMarouflage = 0;

		x = in.nextInt();
		switch(x) {

			case 0: System.out.println("Bonus de + 10% en :\n - Connaissance du Monde\n - Evaluation\n - Influence\n"); //Culture citadine
			this.setConnaissanceMonde(this.getConnaissanceMonde() + 10); this.setEvaluation(this.getEvaluation() + 10); this.setInfluence(this.getInfluence() + 10);
			System.out.println("Choisir 2 à + 10% parmi :\n0 : Canotage\n1 : Conduite\n2 : Discretion\n3 : Endurance\n4 : Escamotage\n5 : Persistence\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this.setCanotage(this.getCanotage() + 10); antiMarouflage++; break;
					case 1:	this.setConduite(this.getConduite() + 10); antiMarouflage++; break;
					case 2:	this.setDiscretion(this.getDiscretion() + 10); antiMarouflage++; break;
					case 3:	this.setEndurance(this.getEndurance() + 10); antiMarouflage++; break;
					case 4:	this.setEscamotage(this.getEscamotage() + 10); antiMarouflage++; break;
					case 5:	this.setPersistence(this.getPersistence() + 10); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("Choisir 2 à + 10% parmi :\n0 : Arbalète\n1 : Armes d'hast\n2 : Bouclier\n3 : Dague\n4 : Epée 1M\n5 : Marteau 1M\n");
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this.setArbalete(this.getArbalete() + 10); antiMarouflage++; break;
					case 1: this.setArmeHast(this.getArmeHast() + 10); antiMarouflage++; break;
					case 2: this.setBouclier(this.getBoublier() + 10); antiMarouflage++; break;
					case 3: this.setDague(this.getDague() + 10); antiMarouflage++; break;
					case 4: this.setEpee1M(this.getEpee1M() + 10); antiMarouflage++; break;
					case 5: this.setMarteau1M(this.getMarteau1M() + 10); antiMarouflage++; break;
				}
			}

			case 1: System.out.println("Bonus de + 10% en :\n - Connaissance du Monde\nBonus de + 15% en :\n - Evaluation\n - Influence"); //Culture civilisée
			this.setConnaissanceMonde(this.getConnaissanceMonde() + 10); this.setEvaluation(this.getEvaluation() + 15); this.setInfluence(this.getInfluence() + 15);
			System.out.println("Choisir 2 à + 10 % parmi :\n0 : ")
			
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:


	}
}