import java.util.Scanner;

public class Culture {
	private Perso _per;
	private Caracteristiques _car;
	private Competences _com;
	private Combat _combat;
	private static CompetencesAvancees saveComp;

	public Culture (Perso per, Caracteristiques car, Competences com, Combat combat) {

		this._per = per;
		this._car = car;
		this._com = com;
		this._combat = combat;

		Scanner in = new Scanner (System.in);
		String s;
		String culture = "";
		int x;
		int y;
		int antiMarouflage = 0;

		System.out.println("Choisir parmi :\n - 0 : Culture citadine\n - 1 : Culture civilisée\n - 2 : Culture maritime\n - 3 : Culture noble\n - 4 : Culture primitive\n - 5 : Culture rurale\n - 6 : Culture nomade arctique\n - 7 : Culture nomade désertique\n - 8 : Culture nomade tempérée\n");
		x = in.nextInt();
		switch(x) {

			case 0: System.out.println("\n######################################\nVous avez choisi la culture citadine\n"); culture = "citadine";
			System.out.println("Bonus de + 10% en :\n - Connaissance du Monde\n - Evaluation\n - Influence\n"); //Culture citadine
			this._com.setConnaissanceMonde(this._com.getConnaissanceMonde() + 10); this._com.setEvaluation(this._com.getEvaluation() + 10); this._com.setInfluence(this._com.getInfluence() + 10);
			s = in.nextLine();
			System.out.println("Choisir 2 bonus aux compétences à + 10% parmi :\n - 0 : Canotage\n - 1 : Conduite\n - 2 : Discretion\n - 3 : Athétisme\n - 4 : Escamotage\n - 5 : Persistence\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._com.setCanotage(this._com.getCanotage() + 10); System.out.println("Niveau en canotage = " + this._com.getCanotage() + "/100\n"); antiMarouflage++; break;
					case 1:	this._com.setConduite(this._com.getConduite() + 10); System.out.println("Niveau en conduite = " + this._com.getConduite() + "/100\n"); antiMarouflage++; break;
					case 2:	this._com.setDiscretion(this._com.getDiscretion() + 10); System.out.println("Niveau en discretion = " + this._com.getDiscretion() + "/100\n"); antiMarouflage++; break;
					case 3:	this._com.setAthletisme(this._com.getAthletisme() + 10); antiMarouflage++; System.out.println("Niveau en endurance = " + this._com.getAthletisme() + "/100\n"); break;
					case 4:	this._com.setEscamotage(this._com.getEscamotage() + 10); antiMarouflage++; System.out.println("Niveau en escamotage = " + this._com.getEscamotage() + "/100\n"); break;
					case 5:	this._com.setPersistence(this._com.getPersistence() + 10); antiMarouflage++; System.out.println("Niveau en persistence = " + this._com.getPersistence() + "/100\n"); break;
				}
			}
			antiMarouflage = 0;
			System.out.println("Choisir 2 bonus aux compétences à + 10% parmi :\n - 0 : Arbalète\n - 1 : Armes d'hast\n - 2 : Bouclier\n - 3 : Dague\n - 4 : Epée une main\n - 5 : Marteau à une main\n");
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._combat.setArbalete(this._combat.getArbalete() + 10); System.out.println("Niveau en arbalete = " + this._combat.getArbalete() + "/100\n"); antiMarouflage++; break;
					case 1: this._combat.setArmeHast(this._combat.getArmeHast() + 10); System.out.println("Niveau en arme d'hast = " + this._combat.getArmeHast() + "/100\n"); antiMarouflage++; break;
					case 2: this._combat.setBouclier(this._combat.getBouclier() + 10); System.out.println("Niveau en bouclier = " + this._combat.getBouclier() + "/100\n"); antiMarouflage++; break;
					case 3: this._combat.setDague(this._combat.getDague() + 10); System.out.println("Niveau en dague = " + this._combat.getDague() + "/100"); antiMarouflage++; break;
					case 4: this._combat.setEpee1M(this._combat.getEpee1M() + 10); System.out.println("Niveau en épée à une main = " + this._combat.getEpee1M() + "/100\n"); antiMarouflage++; break;
					case 5: this._combat.setMarteau1M(this._combat.getMarteau1M() + 10); System.out.println("Niveau en marteau à une main = " + this._combat.getMarteau1M() + "/100\n"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("\n######################################\n");
			System.out.println("Choix des compétences avancées :\n");
			CompetencesAvancees compA = new CompetencesAvancees(0);
			saveComp = compA;
			System.out.println("######################################");
			break;

			case 1: System.out.println("\nVous avez choisi la culture civilisée\n"); culture = "civilisée";
			System.out.println("Bonus de + 10% en :\n - Connaissance du Monde\nBonus de + 15% en :\n - Evaluation\n - Influence\n"); //Culture civilisée
			this._com.setConnaissanceMonde(this._com.getConnaissanceMonde() + 10); this._com.setEvaluation(this._com.getEvaluation() + 15); this._com.setInfluence(this._com.getInfluence() + 15);
			System.out.println("\nVeuillez choisir 2 bonus aux compétences à + 10 % parmi :\n - 0 : Arbalète\n - 1 : Rapiere\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._combat.setArbalete(this._combat.getArbalete() + 10); System.out.println("Niveau en arbalete = " + this._combat.getArbalete() + "/100\n"); antiMarouflage++; break;
					case 1: this._combat.setRapiere(this._combat.getRapiere() + 10); System.out.println("Niveau en rapiere = " + this._combat.getRapiere() + "/100\n"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("\n######################################\n");
			System.out.println("Choix des compétences avancées :\n");
			compA = new CompetencesAvancees(1);
			saveComp = compA;
			System.out.println("######################################");
			break;

			case 2: System.out.println("\nVous avez choisi la culture maritime\n"); culture = "maritime";
			System.out.println("Bonus de + 5% en :\n - Acrobatie\n - Chant\n - Connaissance des animaux\n - Esquive\n - Lancé\n");
			this._com.setAcrobatie(this._com.getAcrobatie() + 5); this._com.setChant(this._com.getChant() + 5); this._com.setConnaissanceAnimaux(this._com.getConnaissanceAnimaux() + 5); this._com.setEsquive(this._com.getEsquive() + 10); this._com.setLancer(this._com.getLancer() + 10);
			System.out.println("Bonus de + 10% en :\n - Athétisme\n - Connaissance du monde\n");
			this._com.setAthletisme(this._com.getAthletisme() + 10); this._com.setConnaissanceMonde(this._com.getConnaissanceMonde() + 10);
			System.out.println("Bonus de + 15% en :\n - Canotage\n");
			System.out.println("Veuillez choisir 2 bonus aux compétences à + 10% parmi :\n - 0 : Main nue\n - 1 : Dague\n - 2 : Epée à une main\n - 3 : Marteau à une main\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._combat.setMainNue(this._combat.getMainNue() + 10); System.out.println("Niveau en bagarre = " + this._combat.getMainNue() + "/100"); antiMarouflage++; break;
					case 1: this._combat.setDague(this._combat.getDague() + 10); System.out.println("Niveau en dague = " + this._combat.getDague() + "/100"); antiMarouflage++; break;
					case 2: this._combat.setEpee1M(this._combat.getEpee1M() + 10); System.out.println("Niveau en épée à une main = " + this._combat.getEpee1M() + "/100"); antiMarouflage++; break;
					case 3: this._combat.setMarteau1M(this._combat.getMarteau1M() + 10); System.out.println("Niveau en marteau à une main = " + this._combat.getMarteau1M() + "/100"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("\n######################################\n");
			System.out.println("Choix des compétences avancées :\n");
			compA = new CompetencesAvancees(2);
			saveComp = compA;
			System.out.println("######################################");
			break;

			case 3: System.out.println("\nVous avez choisi la culture noble\n"); culture = "noble";
			System.out.println("Bonus de + 10% en :\n - Connaissance du monde\n - Influence\n - Persistence\n");
			this._com.setConnaissanceMonde(this._com.getConnaissanceMonde() + 10); this._com.setInfluence(this._com.getInfluence() + 10); this._com.setPersistence(this._com.getPersistence() + 10);
			System.out.println("\nVeuillez choisir 2 bonus aux compétences à + 5% parmi :\n - 0 : Equitation\n - 1 : Esquive\n - 2 : Evaluation\n - 3 : Perception\n");
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._com.setEquitation(this._com.getEquitation() + 5); System.out.println("Niveau en équitation = " + this._com.getEquitation() + "/100"); antiMarouflage++; break;
					case 1: this._com.setEsquive(this._com.getEsquive() + 5); System.out.println("Niveau en esquive = " + this._com.getEsquive() + "/100"); antiMarouflage++; break;
					case 2: this._com.setEvaluation(this._com.getEvaluation() + 5); System.out.println("Niveau en évaluation = " + this._com.getEvaluation() + "/100"); antiMarouflage++; break;
					case 3: this._com.setPerception(this._com.getPerception() + 5); System.out.println("Niveau en perception = " + this._com.getPerception() + "/100"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("\nVeuillez choisir 2 bonus aux compétences à + 15% parmi :\n - 0 : Bouclier\n - 1 : Dague\n - 2 : Epée à une main\n - 3 : Epée à deux mains\n - 4 : Rapière\n");
			while(antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._combat.setBouclier(this._combat.getBouclier() + 15); System.out.println("Niveau en bouclier = " + this._combat.getBouclier() + "/100"); antiMarouflage++; break;
					case 1: this._combat.setDague(this._combat.getDague() + 15); System.out.println("Niveau en dague = " + this._combat.getDague() + "/100"); antiMarouflage++; break;
					case 2: this._combat.setEpee1M(this._combat.getEpee1M() + 15); System.out.println("Niveau en épée à une main = " + this._combat.getEpee1M() + "/100"); antiMarouflage++; break;
					case 3: this._combat.setEpee2M(this._combat.getEpee2M() + 15); System.out.println("Niveau en épée à deux main = " + this._combat.getEpee2M() + "/100"); antiMarouflage++; break;
					case 4: this._combat.setRapiere(this._combat.getRapiere() + 15); System.out.println("Niveau en rapière = " + this._combat.getRapiere() + "/100"); antiMarouflage++; break;   
				}
			}
			antiMarouflage = 0;
			System.out.println("\n######################################\n");
			System.out.println("Choix des compétences avancées :\n");
			compA = new CompetencesAvancees(3);
			saveComp = compA;
			System.out.println("######################################");
			break;

			case 4: System.out.println("\nVous avez choisi la culture primitive\n"); culture = "primitive";
			System.out.println("Bonus de + 10% en :\n - Athétisme\n - Connaissance des animaux\n - Connaissance des plantes\n - discrétion\n - Endurance\n - Perception\n");
			this._com.setAthletisme(this._com.getAthletisme() + 10); this._com.setConnaissanceAnimaux(this._com.getConnaissanceAnimaux() + 10); this._com.setConnaissancePlantes(this._com.getConnaissancePlantes() + 10); this._com.setDiscretion(this._com.getDiscretion() + 10); this._com.setAthletisme(this._com.getAthletisme() + 10); this._com.setPerception(this._com.getPerception() + 10);
			System.out.println("\nChoisir 1 bonus aux compétences à + 10% parmi :\n - 0 : Dague\n - 1 : Fronde\n - 2 : Hache à une main\n - 3 : Lance\n - 4 : Marteau à une main\n");
			while (antiMarouflage < 1) {
				y = in.nextInt();
				switch(y) {
					case 0: this._combat.setDague(this._combat.getDague() + 10); System.out.println("Niveau en dague = " + this._combat.getDague() + "/100"); antiMarouflage++; break;
					case 1: this._combat.setFronde(this._combat.getFronde() + 10); System.out.println("Niveau en Fronde = " + this._combat.getFronde() + "/100"); antiMarouflage++; break;
					case 2: this._combat.setHache1M(this._combat.getHache1M() + 10); System.out.println("Niveau en hache à une main = " + this._combat.getHache1M() + "/100"); antiMarouflage++; break;
					case 3: this._combat.setLance(this._combat.getLance() + 10); System.out.println("Niveau en lance = " + this._combat.getLance() + "/100"); antiMarouflage++; break;
					case 4: this._combat.setMarteau1M(this._combat.getMarteau1M() + 10); System.out.println("Niveau en marteau à une main = " + this._combat.getMarteau1M() + "/100"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("\n######################################\n");
			System.out.println("Choix des compétences avancées :\n");
			compA = new CompetencesAvancees(4);
			saveComp = compA;
			System.out.println("######################################");
			break;

			case 5: System.out.println("\nVous avez choisi la culture rurale\n"); culture = "rurale";
			System.out.println("Bonus de + 10% en :\n - Athétisme\n - Connaissance des animaux\n - Connaissance des plantes\n");
			this._com.setAthletisme(this._com.getAthletisme() + 10); this._com.setConnaissanceAnimaux(this._com.getConnaissanceAnimaux() + 10); this._com.setConnaissancePlantes(this._com.getConnaissancePlantes() + 10);
			System.out.println("\nChoisir 2 bonus aux compétences à + 10% parmi :\n - 0 : Canotage\n - 1 : Esquive\n - 2 : conduite\n - 3 : Premiers soins\n - 4 : Persistence");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._com.setCanotage(this._com.getCanotage() + 10); System.out.println("Niveau en canotage = " + this._com.getCanotage() + "/100"); antiMarouflage++; break;
					case 1: this._com.setEsquive(this._com.getEsquive() + 10); System.out.println("Niveau en esquive = " + this._com.getEsquive() + "/100"); antiMarouflage++; break;
					case 2: this._com.setConduite(this._com.getConduite() + 10); System.out.println("Niveau en conduite = " + this._com.getConduite() + "/100"); antiMarouflage++; break;
					case 3: this._com.setPSoins(this._com.getPSoin() + 10); System.out.println("Niveau en premiers soins = " + this._com.getPSoin() + "/100"); antiMarouflage++; break;
					case 4: this._com.setPersistence(this._com.getPersistence() + 10); System.out.println("Niveau en persistence = " + this._com.getPersistence() + "/100"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("choisir 2 bonus aux compétences à + 10% parmi :\n - Mains nues \n - Bâton\n - Dague\n - Fléau à une main\n - Fronde\n - Hache à une main\n - Hache à deux mains\n - Lance\n - Marteau à une main\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._combat.setMainNue(this._combat.getMainNue() + 10); System.out.println("Niveau en mains nues = " + this._combat.getMainNue() + "/100"); antiMarouflage++; break;
					case 1: this._combat.setBaton(this._combat.getBaton() + 10); System.out.println("Niveau en baton = " + this._combat.getBaton() + "/100"); antiMarouflage++; break;
					case 2: this._combat.setDague(this._combat.getDague() + 10); System.out.println("Niveau en dague = " + this._combat.getDague() + "/100"); antiMarouflage++; break;
					case 3: this._combat.setFleau1M(this._combat.getFleau1M() + 10); System.out.println("Niveau en fléau à une main = " + this._combat.getFleau1M() + "/100"); antiMarouflage++; break;
					case 5: this._combat.setFronde(this._combat.getFronde() + 10); System.out.println("Niveau en fronde = " + this._combat.getFronde() + "/100"); antiMarouflage++; break;
					case 6: this._combat.setHache1M(this._combat.getHache1M() + 10); System.out.println("Niveau en hache à une main = " + this._combat.getHache1M() + "/100"); antiMarouflage++; break;
					case 7: this._combat.setHache2M(this._combat.getHache2M() + 10); System.out.println("Niveau en hache à deux mains = " + this._combat.getHache2M() + "/100"); antiMarouflage++; break;
					case 8: this._combat.setLance(this._combat.getLance() + 10); System.out.println("Niveau en lance = " + this._combat.getLance() + "/100"); antiMarouflage++; break;
					case 9: this._combat.setMarteau1M(this._combat.getMarteau1M() + 10); System.out.println("Niveau en marteau à une main = " + this._combat.getMarteau1M() + "/100"); antiMarouflage++; break;
				}
			} 
			antiMarouflage = 0;
			System.out.println("\n######################################\n");
			System.out.println("Choix des compétences avancées :\n");
			compA = new CompetencesAvancees(5);
			saveComp = compA;
			System.out.println("######################################");
			break;

			case 6: System.out.println("\nVous avez choisi la culture nomade artique\n"); culture = "nomade artique";
			System.out.println("Bonus de + 5% en :\n - Athétisme\n - Connaissance des animaux\n - Discretion\n - Perception\n");
			this._com.setAthletisme(this._com.getAthletisme() + 5); this._com.setConnaissanceAnimaux(this._com.getConnaissanceAnimaux() + 5); this._com.setDiscretion(this._com.getDiscretion() + 5); this._com.setPerception(this._com.getPerception() + 5);
			System.out.println("Bonus de + 10% en :\n - Canotage\n - Athletisme\n");
			this._com.setCanotage(this._com.getCanotage() + 10); this._com.setAthletisme(this._com.getAthletisme() + 10);
			System.out.println("\nChoisir 2 bonus aux compétences à + 15% parmi :\n - 0 : Dague \n - 1 : Hache à une main\n - 2 : Lance\n - 3 : Marteau à une main\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._combat.setDague(this._combat.getDague() + 15); System.out.println("Niveau en dague = " + this._combat.getDague() + "/100"); antiMarouflage++; break;
					case 1: this._combat.setHache1M(this._combat.getHache1M() + 15); System.out.println("Niveau en hache à une main " + this._combat.getHache1M() + "/100"); antiMarouflage++; break;
					case 2: this._combat.setLance(this._combat.getLance() + 15); System.out.println("Nivrau en lance = " + this._combat.getLance() + "/100"); antiMarouflage++; break;
					case 3: this._combat.setMarteau1M(this._combat.getMarteau1M() + 15); System.out.println("Niveau en marteau à une main = " + this._combat.getMarteau1M() + "/100"); antiMarouflage++; break; 
				}
			}
			antiMarouflage = 0;
			System.out.println("\n######################################\n");
			System.out.println("Choix des compétences avancées :\n");
			compA = new CompetencesAvancees(6);
			saveComp = compA;
			System.out.println("######################################");
			break;

			case 7: System.out.println("\nVous avez choisi la culture nomade désertique\n"); culture = "nomade désertique";
			System.out.println("Bonus de + 5% en :\n - Athlétisme\n - Connaissance du monde\n - Discrétion\n - Perception\n");
			this._com.setAthletisme(this._com.getAthletisme() + 5); this._com.setConnaissanceMonde(this._com.getConnaissanceMonde() + 5); this._com.setDiscretion(this._com.getDiscretion() + 5); this._com.setPerception(this._com.getPerception() + 5);
			System.out.println("Bonus de + 10% en :\n - Equitation\n - Athlétisme\n");
			this._com.setEquitation(this._com.getEquitation() + 10); this._com.setAthletisme(this._com.getAthletisme() + 10);
			System.out.println("Choisir 2 bonus aux compétences à + 15% parmi :\n - 0 : Arc\n - 1 : Bouclier\n - 2 : Dague\n - 3 : Epée à une main\n - 4 : Hache à une main\n");
			while (antiMarouflage < 2) {
				y = in.nextInt();
				switch(y) {
					case 0: this._combat.setArc(this._combat.getArc() + 15); System.out.println("Niveau en arc = " + this._combat.getArc() + "/100"); antiMarouflage++; break;
					case 1: this._combat.setBouclier(this._combat.getBouclier() + 15); System.out.println("Niveau en bouclier = " + this._combat.getBouclier()); antiMarouflage++; break;
					case 2: this._combat.setDague(this._combat.getDague() + 15); System.out.println("Niveau en dague = " + this._combat.getDague() + "/100");
					case 3: this._combat.setEpee1M(this._combat.getEpee1M() + 15); System.out.println("Niveau en épée à une main = " + this._combat.getEpee1M() + "/100"); antiMarouflage++; break;
					case 4: this._combat.setHache1M(this._combat.getHache1M() + 15); System.out.println("Niveau en hache à une main = " + this._combat.getHache1M() + "/100"); antiMarouflage++; break;
				}
			}
			antiMarouflage = 0;
			System.out.println("\n######################################\n");
			System.out.println("Choix des compétences avancées :\n");
			compA = new CompetencesAvancees(7);
			saveComp = compA;
			System.out.println("######################################");
			break;

			case 8: System.out.println("\nVous avez choisi la culture nomade tempérée\n"); culture = "nomade tempérée";
			System.out.println("Bonus de + 5% en :\n - Connaissance des animaux\n - Connaissance des plantes\n - Connaissance du monde\n - Discretion\n - Perception\n");
			this._com.setConnaissanceAnimaux(this._com.getConnaissanceAnimaux() + 5); this._com.setConnaissancePlantes(this._com.getConnaissancePlantes() + 5); this._com.setConnaissanceMonde(this._com.getConnaissanceMonde() + 5); this._com.setDiscretion(this._com.getDiscretion() + 5); this._com.setPerception(this._com.getPerception() + 5);
			System.out.println("Bonus de + 15% en :\n - Athlétisme");
			this._com.setAthletisme(this._com.getAthletisme() + 15);
			System.out.println("Bonus de + 20% en :\n - Equitation\n ");
			this._com.setEquitation(this._com.getEquitation() + 20);
			System.out.println("Choix des compétences avancées :\n");
			compA = new CompetencesAvancees(8);
			saveComp = compA;
			System.out.println("######################################");
			break;
		}
	}

	public void compAAffichage() {
		saveComp.affichage();
	}
}