
public class Main {

	public static void main(String[] args) {
		Seyirci seyirci1 = new Seyirci("O�uz Art�ran");
		Seyirci seyirci2 = new Seyirci("H�seyin Harun �zkan");
		
		seyirci1.oyunSeyret();
		System.out.println("Seyirci Say�s�: "+Seyirci.getSeyirciSayisi());
		System.out.println("Seyirci Say�s�: "+seyirci1.getSeyirciSayisi());
		System.out.println("Seyirci Say�s�: "+seyirci2.getSeyirciSayisi());

		selamla();
		
		System.out.println(Math.PI);
	}

	public static void selamla() {
		System.out.println("Selamlar...");
	}

}
