package flugzeug;

public class Passagierflugzeug extends Flugzeug {

	private double schub;
	static int anzahlPassagierflugzeug;

	public Passagierflugzeug(double spannweite, int sitzkapazitaet, double schub) {
		super(sitzkapazitaet, spannweite);
		this.schub = schub;
		anzahlPassagierflugzeug++;

	}

	public double getSchub() {
		return schub;
	}

	public void setSchub(double schub) {
		this.schub = schub;
	}

	@Override
	public String toString() {
		return "Spannweite: " + getSpannweite() + ", Sitze: " + getSitzkapazitaet() + ", Schub: " + getSchub() + "kn"
				+ " (" + getClass().getSuperclass().getSimpleName() + ")" + getClass().getSimpleName();
	}
}
