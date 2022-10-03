
public class PcMuhendisi implements IMuhendis {

	private boolean askerlik;
	private boolean adliSicil;

	public PcMuhendisi(boolean askerlik, boolean adliSicil) {
		this.askerlik = askerlik;
		this.adliSicil = adliSicil;
	}

	@Override
	public void askerlikDurumuSorgula() {
		if (askerlik) {
			System.out.println("Askerliðimi yaptým.");
		} else {
			System.out.println("Askerliðimi henüz yapmadým.");
		}

	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {

		return "Ortalamam: " + derece;
	}

	@Override
	public void adliSicilSorgula() {
		if (adliSicil) {
			System.out.println("Adli sicil kaydým bulunuyor.");
		} else {
			System.out.println("Herhangi bir adli sicil kaydým bulunmuyor.");
		}

	}

	@Override
	public void isTecrubesi(String[] array) {
		System.out.println("Bilgisaar Mühendisi olarak þu þirketlerde çalýþtým: ");
		for(String i : array) {
			System.out.println(i); 
		}
	}

}
