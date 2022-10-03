
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
			System.out.println("Askerli�imi yapt�m.");
		} else {
			System.out.println("Askerli�imi hen�z yapmad�m.");
		}

	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {

		return "Ortalamam: " + derece;
	}

	@Override
	public void adliSicilSorgula() {
		if (adliSicil) {
			System.out.println("Adli sicil kayd�m bulunuyor.");
		} else {
			System.out.println("Herhangi bir adli sicil kayd�m bulunmuyor.");
		}

	}

	@Override
	public void isTecrubesi(String[] array) {
		System.out.println("Bilgisaar M�hendisi olarak �u �irketlerde �al��t�m: ");
		for(String i : array) {
			System.out.println(i); 
		}
	}

}
