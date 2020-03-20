package flugzeug;

public class FlugzeugTest {

	public static void main(String[] args) {
		Segelflugzeug sf = new Segelflugzeug(17.0);
		Passagierflugzeug pg = new Passagierflugzeug(10.97, 4, 1.3);
		A380 a380 = new A380(79.8, 558, 1280);
		infoAusgeben(sf, pg, a380);

	}

	static void infoAusgeben(Segelflugzeug sf, Passagierflugzeug pg, A380 a380) {

		System.out.println(sf);
		System.out.println(pg);
		System.out.println(a380);

		System.out.println("Anzahl Flugzeuge: " + Flugzeug.anzahlFlugzeuge);
		System.out.println("Anzahl Segelflugzeuge: " + Segelflugzeug.anzahlSegelflugzeug);
		System.out.println("Anzahl Passagierflugzeuge: " + Passagierflugzeug.anzahlPassagierflugzeug);
		System.out.println("Anzahl A380: " + A380.anzahlA380);

	}

}
