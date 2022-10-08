
public class Main {

	public static void main(String[] args) {
		Seyirci seyirci1 = new Seyirci("Oðuz Artýran");
		Seyirci seyirci2 = new Seyirci("Hüseyin Harun Özkan");
		
		seyirci1.oyunSeyret();
		System.out.println("Seyirci Sayýsý: "+Seyirci.seyirciSayisi);
		System.out.println("Seyirci Sayýsý: "+seyirci1.seyirciSayisi);
		System.out.println("Seyirci Sayýsý: "+seyirci2.seyirciSayisi);
		
	}

}
