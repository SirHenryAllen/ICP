public class Competences {
	private double pSoins;
	private double acrobatie;
	private double athletisme;
	private double canotage;
	private double chant;
	private double conduite;
	private double connaissanceAnimaux;
	private double connaissancePlantes;
	private double connaissanceMonde;
	private double discretion;
	private double escamotage;
	private double equitation;
	private double esquive;
	private double evaluation;
	private double lancer;
	private double perception;
	private double persistence;
	private double persuasion;
	private double resistance;
	private double influence;

	public Competences (double force, double dexterite, double constitution, double pouvoir, double intelligence, double charisme, double tai) {
		
		double x;
		this.pSoins = intelligence;
		this.acrobatie = dexterite;
		if (plusFort(force, dexterite) == true) {
			x = (force/3) + dexterite;
		} else { x = (dexterite/3) + force; } 
		this.athletisme = x;
		this.canotage = force;
		this.chant = charisme;
		this.conduite = 10 + pouvoir;
		this.connaissanceAnimaux = intelligence;
		this.connaissancePlantes = intelligence;
		this.connaissanceMonde = intelligence;
		this.discretion = (10 + dexterite) - tai;
		this.escamotage = dexterite;
		if (plusFort(dexterite, pouvoir) == true) {
			x = (dexterite/3) + pouvoir;
		} else { x = (pouvoir/3) + dexterite; }
		this.equitation = x;
		this.esquive = (10 + dexterite) - tai;
		this.evaluation = intelligence;
		if (plusFort(force, dexterite) == true) {
			x = (force/3) + dexterite;
		} else { x = (dexterite/3) + force; } 
		this.lancer = x;
		this.persistence = 10 + pouvoir;
		if (plusFort(intelligence, charisme) == true) {
			x = (intelligence/3) + charisme;
		} else { x = (charisme/3) + intelligence; } 
		this.persuasion = x;
		if (plusFort(constitution, pouvoir) == true) {
			x = (constitution/3) + pouvoir;
		} else { x = (pouvoir/3) + constitution; } 		
		this.resistance = x;
		this.influence = intelligence;

		affichage();
	}

	public boolean plusFort (double a, double b) {
		if (a < b) {
			return false;
		} else {
			return true;
		}
	}

	public void affichage() {
		System.out.println("\n------------------------------------");
		System.out.println("Compétences de base :\n");
		System.out.println("Premiers soins = " + this.pSoins + "\nAcrobatie = " + this.acrobatie + "\nAthlétisme = " + this.athletisme);
		System.out.println("canotage = " + this.canotage + "\nChant = " + this.chant + "\nConduite = " + this.conduite);
		System.out.println("connaissance des Animaux = " + this.connaissanceAnimaux + "\nConnaissance des Plantes = " + this.connaissancePlantes);
		System.out.println("connaissance du Monde = " + this.connaissanceMonde + "\nDiscretion = " + this.discretion);
		System.out.println("escamotage = " + this.escamotage + "\nEquitation = " + this.equitation + "\nEsquive" + this.esquive);
		System.out.println("evaluation = " + this.evaluation + "\nLancer = " + this.lancer + "\nPerception = " + this.perception);
		System.out.println("persistence = " + this.persistence + "\nPersuasion = " + this.persuasion + "\nResistance = " + this.resistance);
		System.out.println("\n------------------------------------\n");		
	}

	public double getPSoin() {
		return this.pSoins;
	}
	public double getAcrobatie() {
		return this.acrobatie;
	} 
	public double getAthletisme() {
		return this.athletisme;
	}
	public double getCanotage() {
		return this.canotage;
	}
	public double getChant() {
		return this.chant;
	}
	public double getConduite() {
		return this.conduite;
	}
	public double getConnaissanceAnimaux() {
		return this.connaissanceAnimaux;
	}
	public double getConnaissancePlantes() {
		return this.connaissancePlantes;
	}
	public double getConnaissanceMonde() {
		return this.connaissanceMonde;
	}
	public double getDiscretion() {
		return this.discretion;
	}
	public double getEscamotage() {
		return this.escamotage;
	}
	public double getEquitation() {
		return this.equitation;
	}
	public double getEsquive() {
		return this.esquive;
	}
	public double getEvaluation() {
		return this.evaluation;
	}
	public double getLancer() {
		return this.lancer;
	}
	public double getPerception() {
		return this.perception;
	}
	public double getPersistence() {
		return this.persistence;
	}
	public double getPersuasion() {
		return this.persuasion;
	}
	public double getResistance() {
		return this.resistance;
	}
	public double getInfluence() {
		return this.influence;
	}

	public void setPSoins (double x) {
		this.pSoins = x;
	}
	public void setAcrobatie (double x) {
		this.acrobatie = x;
	}
	public void setAthletisme (double x) {
		this.athletisme = x;
	}
	public void setCanotage (double x) {
		this.canotage = x;
	}
	public void setChant (double x) {
		this.chant = x;
	}
	public void setConduite (double x) {
		this.conduite = x;
	}
	public void setConnaissanceAnimaux (double x) {
		this.connaissanceAnimaux = x;
	}
	public void setConnaissancePlantes (double x) {
		this.connaissancePlantes = x;
	}
	public void setConnaissanceMonde (double x) {
		this.connaissanceMonde = x;
	}
	public void setDiscretion (double x) {
		this.discretion = x;
	}
	public void setEscamotage (double x) {
		this.escamotage = x;
	}
	public void setEquitation (double x) {
		this.equitation = x;
	}
	public void setEsquive (double x) {
		this.esquive = x;
	}
	public void setEvaluation (double x) {
		this.evaluation = x;
	}
	public void setLancer (double x) {
		this.lancer = x;
	}
	public void setPerception (double x) {
		this.perception = x;
	}
	public void setPersistence (double x) {
		this.persistence = x;
	}
	public void setPersuasion (double x) {
		this.persuasion = x;
	}
	public void setResistance (double x) {
		this.resistance = x;
	}
	public void setInfluence (double x) {
		this.influence = x;
	}
}