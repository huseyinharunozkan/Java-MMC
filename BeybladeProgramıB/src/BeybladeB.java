
public class BeybladeB {

	private String beybladeci ;
	private int donus_hizi;
	private int saldiri_gucu;
	public BeybladeB(String beybladeci, int donus_hizi, int saldiri_gucu) {
		
		this.beybladeci = beybladeci;
		this.donus_hizi = donus_hizi;
		this.saldiri_gucu = saldiri_gucu;
	}
	public String getBeybladeci() {
		return beybladeci;
	}
	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}
	public int getDonus_hizi() {
		return donus_hizi;
	}
	public void setDonus_hizi(int donus_hizi) {
		this.donus_hizi = donus_hizi;
	}
	public int getSaldiri_gucu() {
		return saldiri_gucu;
	}
	public void setSaldiri_gucu(int saldiri_gucu) {
		this.saldiri_gucu = saldiri_gucu;
	}
	public void saldiri() {
		System.out.println(getBeybladeci()+" " + saldiri_gucu +" ve "+ donus_hizi+" ile saldýrýyor...");
	}
	public void kutsal_canavar_ortaya_cikar() {
		System.out.println("Bu beyblade'in kutsal canavarý yok...");
	}
	public void bilgileri_goster() {
		System.out.println("Beybladeci ismi : "+ beybladeci);
		System.out.println("Saldýrý gücü : "+ saldiri_gucu);
		System.out.println("Dönüþ hýzý : "+ donus_hizi);
	
	}
}
