
public class Kare extends Sekil {
	private int kenar;

	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar = kenar;
	}

	@Override
	void alanHesapla() {
		System.out.println(getIsim() + " alaný " + (kenar * kenar) + " dýr");

	}

	public void cevreHesapla() {
		System.out.println(getIsim() + " çevresi " + (4 * kenar));
	}

}
