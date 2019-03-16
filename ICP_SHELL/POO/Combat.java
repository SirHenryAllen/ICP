public class Combat {
	private double mainNue;
	private double hache1M;
	private double hache2M;
	private double fleau1M;
	private double fleau2M;
	private double fronde;
	private double marteau1M;
	private double marteau2M;
	private double epee1M;
	private double epee2M;
	private double dague;
	private double armeHast;
	private double rapiere;
	private double bouclier;
	private double lance;
	private double baton;
	private double arc;
	private double arbalete;
	private double sarbacanne;
	private double lancePierre;

	public Combat (double force, double dexterite) {
		double x;
		this.mainNue = force;
		if (plusFort(force, dexterite) == true) {
			x = (force/3) + dexterite;
		} else { x = (dexterite/3) + force; } 
		this.hache1M = x;
		this.hache2M = x;
		this.fleau1M = x;
		this.fleau2M = x;
		this.fronde = x;
		this.marteau1M = x;
		this.marteau2M = x;
		this.epee1M = x;
		this.epee2M = x;
		this.dague = x;
		this.armeHast = x;
		this.rapiere = x;
		this.bouclier = x;
		this.lance = x;
		this.baton = x + 10;
		this.arc = dexterite;
		this.arbalete = dexterite;
		this.sarbacanne = dexterite;
		this.lancePierre = dexterite;

		affichage();

	}

	public boolean plusFort (double a, double b) {
		if (a < b) {
			return false;
		} else {
			return true;
		}
	}

	public void affichage () {
		System.out.println("\n------------------------------------");
		System.out.println("Récapitulatif caractéristiques combat :\n");
		System.out.println("Main nue = " + this.mainNue + "/100\nHache 1M = " + this.hache1M + "/100\nHache 2M = " + this.hache2M + "/100");
		System.out.println("Fléau 1M = " + this.fleau1M + "/100\nFléau 2M = " + this.fleau2M + "100/\nMarteau 1M = " + this.marteau1M + "/100");
		System.out.println("Marteau 2M = " + this.marteau2M + "/100\nEpée 1M = " + this.epee1M + "/100\nEpée 2M = " + this.epee2M + "/100");
		System.out.println("Dague = " + this.dague + "/100\nArme d'hast = " + this.armeHast + "/100\nRapiere = " + this.rapiere + "/100");
		System.out.println("Bouclier = " + this.bouclier + "/100\nLance = " + this.lance + "/100\nBaton = " + this.baton + "/100");
		System.out.println("Arc = " + this.arc + "/100\nArbalète = " + this.arbalete + "/100\nSarbacanne = " + this.sarbacanne + "/100\nLance pierre = " + this.lancePierre);
		System.out.println("\n------------------------------------");
	}

	public double getMainNue() {
		return this.mainNue;
	}
	public double getHache1M() {
		return this.hache1M;
	}
	public double getHache2M() {
		return this.hache2M;
	}
	public double getFleau1M() {
		return this.fleau1M;
	}
	public double getFleau2M() {
		return this.fleau2M;
	}
	public double getFronde() {
		return this.fronde;
	}
	public double getMarteau1M() {
		return this.marteau1M;
	}
	public double getMarteau2M() {
		return this.marteau2M;
	}
	public double getEpee1M() {
		return this.epee1M;
	}
	public double getEpee2M() {
		return this.epee2M;
	}
	public double getDague() {
		return this.dague;
	}
	public double getArmeHast() {
		return this.armeHast;
	}
	public double getRapiere() {
		return this.rapiere;
	}
	public double getBouclier() {
		return this.bouclier;
	}
	public double getLance() {
		return this.lance;
	}
	public double getBaton() {
		return this.baton;
	}
	public double getArc() {
		return this.arc;
	}
	public double getArbalete() {
		return this.arbalete;
	}
	public double getSarbacanne() {
		return this.sarbacanne;
	}
	public double getLancePierre() {
		return this.lancePierre;
	}

	public void setMainNue(double x) {
		this.mainNue = x;
	}
	public void setHache1M(double x) {
		this.hache1M = x;
	}
	public void setHache2M(double x) {
		this.hache2M = x;
	}
	public void setFleau1M(double x) {
		this.fleau1M = x;
	}
	public void setFleau2M(double x) {
		this.fleau2M = x;
	}
	public void setFronde(double x) {
		this.fronde = x;
	}
	public void setMarteau1M(double x) {
		this.marteau1M = x;
	}
	public void setMarteau2M(double x) {
		this.marteau2M = x;
	}
	public void setEpee1M(double x) {
		this.epee1M = x;
	}
	public void setEpee2M(double x) {
		this.epee2M = x;
	}
	public void setDague(double x) {
		this.dague = x;
	}
	public void setArmeHast(double x) {
		this.armeHast = x;
	}
	public void setRapiere(double x) {
		this.rapiere = x;
	}
	public void setBouclier(double x) {
		this.bouclier = x;
	}
	public void setLance(double x) {
		this.lance = x;
	}
	public void setBaton(double x) {
		this.baton = x;
	}
	public void setArc(double x) {
		this.arc = x;
	}
	public void setArbalete(double x) {
		this.arbalete = x;
	}
	public void setSarbacanne(double x) {
		this.sarbacanne = x;
	}
	public void setLancePierre(double x) {
		this.lancePierre = x;
	}

}