package flugzeug;

public class A380 extends Passagierflugzeug {

	static int anzahlA380;

	public A380(double spannweite, int sitzkapazitaet, double schub) {
		super(spannweite, sitzkapazitaet, schub);
		anzahlA380++;

	}

	@Override
	public String toString() {
		return "Spannweite: " + getSpannweite() + ", Sitze: " + getSitzkapazitaet() + ", Schub: " + getSchub() + "kn"
				+ " (" + getClass().getSuperclass().getSimpleName() + ")" + getClass().getSimpleName();
	}

}
