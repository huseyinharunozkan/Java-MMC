//Doðalgaz Abonesi

public class AboneB {
	public String isim;
	public int bakiye;
	
	public String sehir;
	
	public void dogalgaz_kullan(int miktar) {
		
		if((this.bakiye - miktar)<0) {
			System.out.println("Yeterli bakiye yok.");
		}
		else {
			this.bakiye -= miktar;
			
			if((this.bakiye-miktar)<=0) {
				System.out.println("Bakiyeniz Bitmiþtir. Lütfen en yakýn abone merkezine giderek kredi"
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
