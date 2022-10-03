
public class MakineMuhendisi implements IMuhendis, ICalisma{
	@Override
	public void calis() {
		System.out.println("Makine M�hendisi �al���yor...");
		
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
		
		if(array.length == 0) {
			System.out.println("Herhangi bir tecr�bem bulunmuyor.");
		}
		else {
			System.out.println("Makine M�hendisi olarak �u �irketlerde �al��t�m: ");
			for(String i : array) {
				System.out.println(i);
			}
		}
	}
	public void referansGetir(String[]array) {
		if(array.length ==0) {
			System.out.println("Herhangi bir referans�m bulunmuyor.");
		}
		else {
			System.out.println("Referanslar�m: ");
			for(String i : array) {
				System.out.println(i);
			}
		}
	}

}
