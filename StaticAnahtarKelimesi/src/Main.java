
public class Main {

	public static void main(String[] args) {
		Seyirci seyirci1 = new Seyirci("O�uz Art�ran");
		Seyirci seyirci2 = new Seyirci("H�seyin Harun �zkan");
		
		seyirci1.oyunSeyret();
		System.out.println("Seyirci Say�s�: "+Seyirci.seyirciSayisi);
		System.out.println("Seyirci Say�s�: "+seyirci1.seyirciSayisi);
		System.out.println("Seyirci Say�s�: "+seyirci2.seyirciSayisi);
		
	}

}
