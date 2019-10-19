	public class Combat {
	private double _mainNue;
	private double _hache1M;
	private double _hache2M;
	private double _fleau1M;
	private double _fleau2M;
	private double _fronde;
	private double _marteau1M;
	private double _marteau2M;
	private double _epee1M;
	private double _epee2M;
	private double _dague;
	private double _armeHast;
	private double _rapiere;
	private double _bouclier;
	private double _lance;
	private double _baton;
	private double _arc;
	private double _arbalete;
	private double _sarbacanne;
	private double _lancePierre;

	public Combat (double force, double dexterite) {
		double x;
		this._mainNue = force;
		if (plusFort(force, dexterite) == true) {
			x = (force/3) + dexterite;
		} else { x = (dexterite/3) + force; } 
		this._hache1M = x;
		this._hache2M = x;
		this._fleau1M = x;
		this._fleau2M = x;
		this._fronde = x;
		this._marteau1M = x;
		this._marteau2M = x;
		this._epee1M = x;
		this._epee2M = x;
		this._dague = x;
		this._armeHast = x;
		this._rapiere = x;
		this._bouclier = x;
		this._lance = x;
		this._baton = x + 10;
		this._arc = dexterite;
		this._arbalete = dexterite;
		this._sarbacanne = dexterite;
		this._lancePierre = dexterite;

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
		System.out.println("Caractéristiques combat :\n");
		System.out.println("Main nue = " + this._mainNue + "/100\nHache 1M = " + this._hache1M + "/100\nHache 2M = " + this._hache2M + "/100");
		System.out.println("Fléau 1M = " + this._fleau1M + "/100\nFléau 2M = " + this._fleau2M + "100/\nMarteau 1M = " + this._marteau1M + "/100");
		System.out.println("Marteau 2M = " + this._marteau2M + "/100\nEpée 1M = " + this._epee1M + "/100\nEpée 2M = " + this._epee2M + "/100");
		System.out.println("Dague = " + this._dague + "/100\nArme d'hast = " + this._armeHast + "/100\nRapiere = " + this._rapiere + "/100");
		System.out.println("Bouclier = " + this._bouclier + "/100\nLance = " + this._lance + "/100\nBaton = " + this._baton + "/100");
		System.out.println("Arc = " + this._arc + "/100\nArbalète = " + this._arbalete + "/100\nSarbacanne = " + this._sarbacanne + "/100\nLance pierre = " + this._lancePierre);
		System.out.println("\n------------------------------------");
	}

	public double getMainNue() {
		return this._mainNue;
	}
	public double getHache1M() {
		return this._hache1M;
	}
	public double getHache2M() {
		return this._hache2M;
	}
	public double getFleau1M() {
		return this._fleau1M;
	}
	public double getFleau2M() {
		return this._fleau2M;
	}
	public double getFronde() {
		return this._fronde;
	}
	public double getMarteau1M() {
		return this._marteau1M;
	}
	public double getMarteau2M() {
		return this._marteau2M;
	}
	public double getEpee1M() {
		return this._epee1M;
	}
	public double getEpee2M() {
		return this._epee2M;
	}
	public double getDague() {
		return this._dague;
	}
	public double getArmeHast() {
		return this._armeHast;
	}
	public double getRapiere() {
		return this._rapiere;
	}
	public double getBouclier() {
		return this._bouclier;
	}
	public double getLance() {
		return this._lance;
	}
	public double getBaton() {
		return this._baton;
	}
	public double getArc() {
		return this._arc;
	}
	public double getArbalete() {
		return this._arbalete;
	}
	public double getSarbacanne() {
		return this._sarbacanne;
	}
	public double getLancePierre() {
		return this._lancePierre;
	}

	public void setMainNue(double x) {
		this._mainNue = x;
	}
	public void setHache1M(double x) {
		this._hache1M = x;
	}
	public void setHache2M(double x) {
		this._hache2M = x;
	}
	public void setFleau1M(double x) {
		this._fleau1M = x;
	}
	public void setFleau2M(double x) {
		this._fleau2M = x;
	}
	public void setFronde(double x) {
		this._fronde = x;
	}
	public void setMarteau1M(double x) {
		this._marteau1M = x;
	}
	public void setMarteau2M(double x) {
		this._marteau2M = x;
	}
	public void setEpee1M(double x) {
		this._epee1M = x;
	}
	public void setEpee2M(double x) {
		this._epee2M = x;
	}
	public void setDague(double x) {
		this._dague = x;
	}
	public void setArmeHast(double x) {
		this._armeHast = x;
	}
	public void setRapiere(double x) {
		this._rapiere = x;
	}
	public void setBouclier(double x) {
		this._bouclier = x;
	}
	public void setLance(double x) {
		this._lance = x;
	}
	public void setBaton(double x) {
		this._baton = x;
	}
	public void setArc(double x) {
		this._arc = x;
	}
	public void setArbalete(double x) {
		this._arbalete = x;
	}
	public void setSarbacanne(double x) {
		this._sarbacanne = x;
	}
	public void setLancePierre(double x) {
		this._lancePierre = x;
	}

}