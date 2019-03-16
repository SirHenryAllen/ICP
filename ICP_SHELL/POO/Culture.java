import java.util.Scanner;

public class Culture {
	private Perso per;
	private Caracteristiques car;
	private Competences com;
	private Combat combat;

	public Culture (Perso per, Caracteristiques car, Competences com, Combat combat) {

		this.per = per;
		this.car = car;
		this.com = com;
		this.combat = combat;

		Scanner in = new Scanner (System.in);
		String s;
		int x;
		int y;
		int antiMarouflage = 0;

		System.out.println("Choisir parmi :\n - 0 : Culture citadine\n - 1 : Culture civilisée\n - 2 : Culture maritime\n - 3 : Culture noble\n - 4 : Culture primitive\n - 5 : Culture rurale\n - 6 : Culture nomade artique\n - 7 : Culture nomade désertique\n - 8 : Culture nomade tempérée\n");
		x = in.nextInt();
		switch(x) {

			case 0: System.out.println("\n######################################\nVous avez choisi la culture citadine\n");
			System.out.println("Bonus de + 10% en :\n - Connaissance du Monde\n - Evaluation\n - Influence\n"); //Culture citadine
			this.com.setConnaissanceMonde(this.com.getConnaissanceMonde() + 10); this.com.setEvaluation(this.com.getEvaluation() + 10); this.com.setInfluence(this.com.getInfluence() + 10);
			s = in.nextLine();
			System.out.println("Choisir 2 à + 10% parmi :\n - 0 : Canotage\n - 1 : Conduite\n - 2 : Discretion\n - 3 : Athétisme\n - 4 : Escamotage\n - 5 : Persistence\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this.com.setCanotage(this.com.getCanotage() + 10); System.out.println("Niveau en canotage = " + this.com.getCanotage() + "/100\n"); antiMarouflage++; break;
					case 1:	this.com.setConduite(this.com.getConduite() + 10); System.out.println("Niveau en conduite = " + this.com.getConduite() + "/100\n"); antiMarouflage++; break;
					case 2:	this.com.setDiscretion(this.com.getDiscretion() + 10); System.out.println("Niveau en discretion = " + this.com.getDiscretion() + "/100\n"); antiMarouflage++; break;
					case 3:	this.com.setAthletisme(this.com.getAthletisme() + 10); antiMarouflage++; System.out.println("Niveau en endurance = " + this.com.getAthletisme() + "/100\n"); break;
					case 4:	this.com.setEscamotage(this.com.getEscamotage() + 10); antiMarouflage++; System.out.println("Niveau en escamotage = " + this.com.getEscamotage() + "/100\n"); break;
					case 5:	this.com.setPersistence(this.com.getPersistence() + 10); antiMarouflage++; System.out.println("Niveau en persistence = " + this.com.getPersistence() + "/100\n"); break;
				}
			}
			antiMarouflage = 0;
			System.out.println("Choisir 2 à + 10% parmi :\n - 0 : Arbalète\n - 1 : Armes d'hast\n - 2 : Bouclier\n - 3 : Dague\n - 4 : Epée une main\n - 5 : Marteau à une main\n");
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this.combat.setArbalete(this.combat.getArbalete() + 10); System.out.println("Niveau en arbalete = " + this.combat.getArbalete() + "/100\n"); antiMarouflage++; break;
					case 1: this.combat.setArmeHast(this.combat.getArmeHast() + 10); System.out.println("Niveau en arme d'hast = " + this.combat.getArmeHast() + "/100\n"); antiMarouflage++; break;
					case 2: this.combat.setBouclier(this.combat.getBouclier() + 10); System.out.println("Niveau en bouclier = " + this.combat.getBouclier() + "/100\n"); antiMarouflage++; break;
					case 3: this.combat.setDague(this.combat.getDague() + 10); System.out.println("Niveau en dague = " + this.combat.getDague() + "/100"); antiMarouflage++; break;
					case 4: this.combat.setEpee1M(this.combat.getEpee1M() + 10); System.out.println("Niveau en épée à une main = " + this.combat.getEpee1M() + "/100\n"); antiMarouflage++; break;
					case 5: this.combat.setMarteau1M(this.combat.getMarteau1M() + 10); System.out.println("Niveau en marteau à une main = " + this.combat.getMarteau1M() + "/100\n"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
/*			System.out.println("Voici les compétences avancées liées à votre culture :\n - Connaissance de la région : 50/100\n - Langue maternelle : 50/100\n - Sens de la rue : 50/100\n");
			System.out.println("Veuillez choisir une compétence avancée supplémentaire parmi :\n - 0 : Artisanat\n - 1 : Danse\n - 2 : Jouer d'un instrument\n - 3 : Connaissance d'une langue\n - 4 : Navigation\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
				}
			}*/
			System.out.println("######################################");
			break;

			case 1: System.out.println("\nVous avez choisi la culture civilisée\n");
			System.out.println("Bonus de + 10% en :\n - Connaissance du Monde\nBonus de + 15% en :\n - Evaluation\n - Influence\n"); //Culture civilisée
			this.com.setConnaissanceMonde(this.com.getConnaissanceMonde() + 10); this.com.setEvaluation(this.com.getEvaluation() + 15); this.com.setInfluence(this.com.getInfluence() + 15);
			System.out.println("\nVeuillez choisir 2 à + 10 % parmi :\n - 0 : Arbalète\n - 1 : Rapiere\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this.combat.setArbalete(this.combat.getArbalete() + 10); System.out.println("Niveau en arbalete = " + this.combat.getArbalete() + "/100\n"); antiMarouflage++; break;
					case 1: this.combat.setRapiere(this.combat.getRapiere() + 10); System.out.println("Niveau en rapiere = " + this.combat.getRapiere() + "/100\n"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;

			case 2: System.out.println("\nVous avez choisi la culture maritime\n");
			System.out.println("Bonus de + 5% en :\n - Acrobatie\n - Chant\n - Connaissance des animaux\n - Esquive\n - Lancé\n");
			this.com.setAcrobatie(this.com.getAcrobatie() + 5); this.com.setChant(this.com.getChant() + 5); this.com.setConnaissanceAnimaux(this.com.getConnaissanceAnimaux() + 5); this.com.setEsquive(this.com.getEsquive() + 10); this.com.setLancer(this.com.getLancer() + 10);
			System.out.println("Bonus de + 10% en :\n - Athétisme\n - Connaissance du monde\n");
			this.com.setAthletisme(this.com.getAthletisme() + 10); this.com.setConnaissanceMonde(this.com.getConnaissanceMonde() + 10);
			System.out.println("Bonus de + 15% en :\n - Canotage\n");
			System.out.println("Veuillez choisir 2 à + 10% parmi :\n - 0 : Main nue\n - 1 : Dague\n - 2 : Epée à une main\n - 3 : Marteau à une main\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this.combat.setMainNue(this.combat.getMainNue() + 10); System.out.println("Niveau en bagarre = " + this.combat.getMainNue() + "/100"); antiMarouflage++; break;
					case 1: this.combat.setDague(this.combat.getDague() + 10); System.out.println("Niveau en dague = " + this.combat.getDague() + "/100"); antiMarouflage++; break;
					case 2: this.combat.setEpee1M(this.combat.getEpee1M() + 10); System.out.println("Niveau en épée à une main = " + this.combat.getEpee1M() + "/100"); antiMarouflage++; break;
					case 3: this.combat.setMarteau1M(this.combat.getMarteau1M() + 10); System.out.println("Niveau en marteau à une main = " + this.combat.getMarteau1M() + "/100"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
		
			case 3: System.out.println("\nVous avez choisi la culture noble\n");
			System.out.println("Bonus de + 10% en :\n - Connaissance du monde\n - Influence\n - Persistence\n");
			this.com.setConnaissanceMonde(this.com.getConnaissanceMonde() + 10); this.com.setInfluence(this.com.getInfluence() + 10); this.com.setPersistence(this.com.getPersistence() + 10);
			System.out.println("\nVeuillez choisir 2 à + 5% parmi :\n - 0 : Equitation\n - 1 : Esquive\n - 2 : Evaluation\n - 3 : Perception\n");
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this.com.setEquitation(this.com.getEquitation() + 5); System.out.println("Niveau en équitation = " + this.com.getEquitation() + "/100"); antiMarouflage++; break;
					case 1: this.com.setEsquive(this.com.getEsquive() + 5); System.out.println("Niveau en esquive = " + this.com.getEsquive() + "/100"); antiMarouflage++; break;
					case 2: this.com.setEvaluation(this.com.getEvaluation() + 5); System.out.println("Niveau en évaluation = " + this.com.getEvaluation() + "/100"); antiMarouflage++; break;
					case 3: this.com.setPerception(this.com.getPerception() + 5); System.out.println("Niveau en perception = " + this.com.getPerception() + "/100"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("\nVeuillez choisir 2 à + 15% parmi :\n - 0 : Bouclier\n - 1 : Dague\n - 2 : Epée à une main\n - 3 : Epée à deux mains\n - 4 : Rapière\n");
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this.combat.setBouclier(this.combat.getBouclier() + 15); System.out.println("Niveau en bouclier = " + this.combat.getBouclier() + "/100"); antiMarouflage++; break;
					case 1: this.combat.setDague(this.combat.getDague() + 15); System.out.println("Niveau en dague = " + this.combat.getDague() + "/100"); antiMarouflage++; break;
					case 2: this.combat.setEpee1M(this.combat.getEpee1M() + 15); System.out.println("Niveau en épée à une main = " + this.combat.getEpee1M() + "/100"); antiMarouflage++; break;
					case 3: this.combat.setEpee2M(this.combat.getEpee2M() + 15); System.out.println("Niveau en épée à deux main = " + this.combat.getEpee2M() + "/100"); antiMarouflage++; break;
					case 4: this.combat.setRapiere(this.combat.getRapiere() + 15); System.out.println("Niveau en rapière = " + this.combat.getRapiere() + "/100"); antiMarouflage++; break;   
				}
			}
			antiMarouflage = 0;

			case 4: System.out.println("\nVous avez choisi la culture primitive\n");
			System.out.println("Bonus de + 10% en :\n - Athétisme\n - Connaissance des animaux\n - Connaissance des plantes\n - discrétion\n - Endurance\n - Perception\n");
			this.com.setAthletisme(this.com.getAthletisme() + 10); this.com.setConnaissanceAnimaux(this.com.getConnaissanceAnimaux() + 10); this.com.setConnaissancePlantes(this.com.getConnaissancePlantes() + 10); this.com.setDiscretion(this.com.getDiscretion() + 10); this.com.setAthletisme(this.com.getAthletisme() + 10); this.com.setPerception(this.com.getPerception() + 10);
			System.out.println("\nChoisir 1 à + 10% parmi :\n - 0 : Dague\n - 1 : Fronde\n - 2 : Hache à une main\n - 3 : Lance\n - 4 : Marteau à une main\n");
			while (antiMarouflage < 1) {
				y = in.nextInt();
				switch(y) {
					case 0: this.combat.setDague(this.combat.getDague() + 10); System.out.println("Niveau en dague = " + this.combat.getDague() + "/100"); antiMarouflage++; break;
					case 1: this.combat.setFronde(this.combat.getFronde() + 10); System.out.println("Niveau en Fronde = " + this.combat.getFronde() + "/100"); antiMarouflage++; break;
					case 2: this.combat.setHache1M(this.combat.getHache1M() + 10); System.out.println("Niveau en hache à une main = " + this.combat.getHache1M() + "/100"); antiMarouflage++; break;
					case 3: this.combat.setLance(this.combat.getLance() + 10); System.out.println("Niveau en lance = " + this.combat.getLance() + "/100"); antiMarouflage++; break;
					case 4: this.combat.setMarteau1M(this.combat.getMarteau1M() + 10); System.out.println("Niveau en marteau à une main = " + this.combat.getMarteau1M() + "/100"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;

		}
	}
}
