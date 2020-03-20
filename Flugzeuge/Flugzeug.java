package flugzeug;

public class Flugzeug {

	static int anzahlFlugzeuge;
	private int sitzkapazitaet;
	private double spannweite;

	public Flugzeug(double spannweite) {
		this.spannweite = spannweite;
		anzahlFlugzeuge++;

	}

	public Flugzeug(int sitzkapazitaet, double spannweite) {
		this.sitzkapazitaet = sitzkapazitaet;
		this.spannweite = spannweite;
		anzahlFlugzeuge++;

	}

	public int getSitzkapazitaet() {
		return sitzkapazitaet;
	}

	public void setSitzkapazitaet(int sitzkapazitaet) {
		this.sitzkapazitaet = sitzkapazitaet;
	}

	public double getSpannweite() {
		return spannweite;
	}

	public void setSpannweite(double spannweite) {
		this.spannweite = spannweite;
	}
}
