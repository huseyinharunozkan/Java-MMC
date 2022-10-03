
public class MakineMuhendisi implements IMuhendis, ICalisma{
	@Override
	public void calis() {
		System.out.println("Makine Mühendisi çalýþýyor...");
		
	}
	private boolean askerlik;
	private boolean adliSicil;

	public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
		super();
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
		
		if(array.length == 0) {
			System.out.println("Herhangi bir tecrübem bulunmuyor.");
		}
		else {
			System.out.println("Makine Mühendisi olarak þu þirketlerde çalýþtým: ");
			for(String i : array) {
				System.out.println(i);
			}
		}
	}
	public void referansGetir(String[]array) {
		if(array.length ==0) {
			System.out.println("Herhangi bir referansým bulunmuyor.");
		}
		else {
			System.out.println("Referanslarým: ");
			for(String i : array) {
				System.out.println(i);
			}
		}
	}

}
