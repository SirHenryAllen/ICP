public class Competences {
	private double _pSoins;
	private double _acrobatie;
	private double _athletisme;
	private double _canotage;
	private double _chant;
	private double _conduite;
	private double _connaissanceAnimaux;
	private double _connaissancePlantes;
	private double _connaissanceMonde;
	private double _discretion;
	private double _escamotage;
	private double _equitation;
	private double _esquive;
	private double _evaluation;
	private double _lancer;
	private double _perception;
	private double _persistence;
	private double _persuasion;
	private double _resistance;
	private double _influence;
	private double _intimidation;

	public Competences (double force, double dexterite, double constitution, double pouvoir, double intelligence, double charisme, double tai) {
		
		double x;
		this._pSoins = intelligence;
		this._acrobatie = dexterite;
		if (plusFort(force, dexterite) == true) {
			x = (force/3) + dexterite;
		} else { x = (dexterite/3) + force; } 
		this._athletisme = x;
		this._canotage = force;
		this._chant = charisme;
		this._conduite = 10 + pouvoir;
		this._connaissanceAnimaux = intelligence;
		this._connaissancePlantes = intelligence;
		this._connaissanceMonde = intelligence;
		this._discretion = (10 + dexterite) - tai;
		this._escamotage = dexterite;
		if (plusFort(dexterite, pouvoir) == true) {
			x = (dexterite/3) + pouvoir;
		} else { x = (pouvoir/3) + dexterite; }
		this._equitation = x;
		this._esquive = (10 + dexterite) - tai;
		this._evaluation = intelligence;
		if (plusFort(force, dexterite) == true) {
			x = (force/3) + dexterite;
		} else { x = (dexterite/3) + force; } 
		this._lancer = x; 
		if (plusFort(intelligence, pouvoir) == true) {
			x = (intelligence/3) + pouvoir;
		} else { x = (pouvoir/3) + intelligence; }
		this._perception = x;
		this._persistence = 10 + pouvoir;
		if (plusFort(intelligence, charisme) == true) {
			x = (intelligence/3) + charisme;
		} else { x = (charisme/3) + intelligence; } 
		this._persuasion = x;
		if (plusFort(constitution, pouvoir) == true) {
			x = (constitution/3) + pouvoir;
		} else { x = (pouvoir/3) + constitution; } 		
		this._resistance = x;
		this._influence = intelligence;

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
		System.out.println("Compétences :\n");
		System.out.println("Premiers soins = " + this._pSoins + "\nAcrobatie = " + this._acrobatie + "\nAthlétisme = " + this._athletisme);
		System.out.println("canotage = " + this._canotage + "\nChant = " + this._chant + "\nConduite = " + this._conduite);
		System.out.println("connaissance des Animaux = " + this._connaissanceAnimaux + "\nConnaissance des Plantes = " + this._connaissancePlantes);
		System.out.println("connaissance du Monde = " + this._connaissanceMonde + "\nDiscretion = " + this._discretion);
		System.out.println("escamotage = " + this._escamotage + "\nEquitation = " + this._equitation + "\nEsquive = " + this._esquive);
		System.out.println("evaluation = " + this._evaluation + "\nLancer = " + this._lancer + "\nPerception = " + this._perception);
		System.out.println("persistence = " + this._persistence + "\nPersuasion = " + this._persuasion + "\nResistance = " + this._resistance);
		System.out.println("\n------------------------------------\n");		
	}

	public double getPSoin() {
		return this._pSoins;
	}
	public double getAcrobatie() {
		return this._acrobatie;
	} 
	public double getAthletisme() {
		return this._athletisme;
	}
	public double getCanotage() {
		return this._canotage;
	}
	public double getChant() {
		return this._chant;
	}
	public double getConduite() {
		return this._conduite;
	}
	public double getConnaissanceAnimaux() {
		return this._connaissanceAnimaux;
	}
	public double getConnaissancePlantes() {
		return this._connaissancePlantes;
	}
	public double getConnaissanceMonde() {
		return this._connaissanceMonde;
	}
	public double getDiscretion() {
		return this._discretion;
	}
	public double getEscamotage() {
		return this._escamotage;
	}
	public double getEquitation() {
		return this._equitation;
	}
	public double getEsquive() {
		return this._esquive;
	}
	public double getEvaluation() {
		return this._evaluation;
	}
	public double getLancer() {
		return this._lancer;
	}
	public double getPerception() {
		return this._perception;
	}
	public double getPersistence() {
		return this._persistence;
	}
	public double getPersuasion() {
		return this._persuasion;
	}
	public double getResistance() {
		return this._resistance;
	}
	public double getInfluence() {
		return this._influence;
	}

	public void setPSoins (double x) {
		this._pSoins = x;
	}
	public void setAcrobatie (double x) {
		this._acrobatie = x;
	}
	public void setAthletisme (double x) {
		this._athletisme = x;
	}
	public void setCanotage (double x) {
		this._canotage = x;
	}
	public void setChant (double x) {
		this._chant = x;
	}
	public void setConduite (double x) {
		this._conduite = x;
	}
	public void setConnaissanceAnimaux (double x) {
		this._connaissanceAnimaux = x;
	}
	public void setConnaissancePlantes (double x) {
		this._connaissancePlantes = x;
	}
	public void setConnaissanceMonde (double x) {
		this._connaissanceMonde = x;
	}
	public void setDiscretion (double x) {
		this._discretion = x;
	}
	public void setEscamotage (double x) {
		this._escamotage = x;
	}
	public void setEquitation (double x) {
		this._equitation = x;
	}
	public void setEsquive (double x) {
		this._esquive = x;
	}
	public void setEvaluation (double x) {
		this._evaluation = x;
	}
	public void setLancer (double x) {
		this._lancer = x;
	}
	public void setPerception (double x) {
		this._perception = x;
	}
	public void setPersistence (double x) {
		this._persistence = x;
	}
	public void setPersuasion (double x) {
		this._persuasion = x;
	}
	public void setResistance (double x) {
		this._resistance = x;
	}
	public void setInfluence (double x) {
		this._influence = x;
	}
}