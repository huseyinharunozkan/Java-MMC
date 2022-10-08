
public class GelismisAboneB {

	private String isim;
	
	private int bakiye = 120;
	
	private String sehir;

	public GelismisAboneB(String isim, int bakiye, String sehir) {

		this.isim = isim;
		
		if (bakiye>=0 && bakiye<=120) {
			this.bakiye = bakiye;
		}
		
		
		this.sehir = sehir;
	}
	
public void dogalgaz_kullan(int miktar) {
		
		if((this.bakiye - miktar)<0) {
			System.out.println("Yeterli bakiye yok.");
		}
		else {
			this.bakiye -= miktar;
			
			if((this.bakiye-miktar)<=0) {
				System.out.println("Bakiyeniz Bitmiştir. Lütfen en yakın abone merkezine giderek kredi"
						+ " yükleyin. Maksimum kredi limiti = 120 TL");
				
			}
			else {
				System.out.println("Yeni bakiye = "+bakiye);
			}
		}
	}
	public void bakiye_ogren() {
		System.out.println("Bakiye = "+bakiye);
	}
}
