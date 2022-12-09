
public class Test {

	public static void main(String[] args) {

		Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
		Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);

		Sayisal birinci = birinci(sayisal1, sayisal2);

		EsitAgirlik esitAgirlik1 = new EsitAgirlik(30, 20, 40, 2);
		EsitAgirlik esitAgirlik2 = new EsitAgirlik(40, 10, 50, 0);

		EsitAgirlik birinci2 = birinci(esitAgirlik1, esitAgirlik2);
		System.out.println("Birinci Sayýsal Öðrencisinin Puaný: " + birinci.puanHesapla());
		System.out.println("Birinci Eþitaðýrlýk Öðrencisinin Puaný: " + birinci2.puanHesapla());

//		Character[] charDizi = new Character[] { 'J', 'A', 'V', 'A' };
//		Integer[] integerDizisi = new Integer[] { 1, 2, 3, 4, 5, 6 };
//
//		String[] stringDizi = new String[] { "Java", "Python", "C++", "Php" };
//
//		Ogrenci[] ogrenciDizi = { new Ogrenci("Harun"), new Ogrenci("Hüseyin"), new Ogrenci("Özkan") };
//
//		yazdir(charDizi);
//		yazdir(stringDizi);
//		yazdir(integerDizisi);
//		yazdir(ogrenciDizi);
	}

	public static <E extends Aday> E birinci(E e1, E e2) {
		if (e1.puanHesapla() > e2.puanHesapla()) {
			return e1;
		} else {
			return e2;
		}

	}

//	public static <E> void yazdir(E[] dizi) {
//		for (E e : dizi) {
//
//			System.out.println(e);
//		}
//	}
//	
}
