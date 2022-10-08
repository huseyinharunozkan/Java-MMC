
public class Drayga extends BeybladeB {
	private String kutsal_canavar;
	public Drayga(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar) {
		super(beybladeci, donus_hizi, saldiri_gucu);
		this.kutsal_canavar = kutsal_canavar;
	}
	
	@Override
	public void bilgileri_goster() {
		
		super.bilgileri_goster();
		System.out.println("Kutsal canavar ad� : "+ kutsal_canavar);
	}

	
	@Override
	public void kutsal_canavar_ortaya_cikar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+"� ortaya ��kard�...");
		System.out.println(getBeybladeci()+" �n sald�r�s� : Kaplan Pen�esi");
	}
	
}
