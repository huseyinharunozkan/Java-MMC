
public class Kare extends Sekil {
	private int kenar;

	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar = kenar;
	}

	@Override
	void alanHesapla() {
		System.out.println(getIsim() + " alan� " + (kenar * kenar) + " d�r");

	}

	public void cevreHesapla() {
		System.out.println(getIsim() + " �evresi " + (4 * kenar));
	}

}
