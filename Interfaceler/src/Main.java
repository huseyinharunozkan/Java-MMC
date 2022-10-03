
public class Main {
	public static void main(String[] args) {
		IMuhendis muhendis1 = new PcMuhendisi(false, false);

//		muhendis1.askerlikDurumuSorgula();
//		muhendis1.adliSicilSorgula();
//		System.out.println(muhendis1.mezuniyetOrtalamasi(3.07));
//		String[] tecrube = {"Vestel","Havelsan","Turksat"};
//		muhendis1.isTecrubesi(tecrube);

		MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);

		String[] tecrube = {};
		String[] referans = { "Mustafa Murat Coþkun", "Serhat Say" };
		muhendis2.adliSicilSorgula();
		muhendis2.askerlikDurumuSorgula();
		muhendis2.mezuniyetOrtalamasi(2.31);
		muhendis2.isTecrubesi(tecrube);
		muhendis2.referansGetir(referans);
		muhendis2.calis();
		;

	}

}
