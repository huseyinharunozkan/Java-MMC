
public class Main {

	public static void main(String[] args) {
//		Sekil sekil = new Sekil();

		Sekil sekil;
		sekil = new Kare("Kare2", 6);

		sekil.alanHesapla();
//		sekil.cevreHesapla();

		Kare kare1 = new Kare("Kare1", 5);
		Daire daire1 = new Daire("Daire", 3);

		kare1.alanHesapla();
		daire1.alanHesapla();
		kare1.cevreHesapla();
	}

}
