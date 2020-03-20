package flugzeug;

public class Segelflugzeug extends Flugzeug {

	static int anzahlSegelflugzeug;

	public Segelflugzeug(double spannweite) {
		super(spannweite);
		anzahlSegelflugzeug++;

		Segelflugzeug.super.setSitzkapazitaet(1);
	}

	@Override
	public String toString() {
		return "Spannweite: " + getSpannweite() + ", Sitze: " + getSitzkapazitaet() + " ("
				+ getClass().getSuperclass().getSimpleName() + ")" + getClass().getSimpleName();
	}
}
