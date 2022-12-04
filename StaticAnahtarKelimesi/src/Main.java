
public class Main {

	public static void main(String[] args) {
		Seyirci seyirci1 = new Seyirci("Oðuz Artýran");
		Seyirci seyirci2 = new Seyirci("Hüseyin Harun Özkan");
		
		seyirci1.oyunSeyret();
		System.out.println("Seyirci Sayýsý: "+Seyirci.getSeyirciSayisi());
		System.out.println("Seyirci Sayýsý: "+seyirci1.getSeyirciSayisi());
		System.out.println("Seyirci Sayýsý: "+seyirci2.getSeyirciSayisi());

		selamla();
		
		System.out.println(Math.PI);
	}

	public static void selamla() {
		System.out.println("Selamlar...");
	}

}
