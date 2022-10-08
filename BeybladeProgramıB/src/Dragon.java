
public class Dragon extends BeybladeB{
	private String kutsal_canavar;
	private String gizli_yetenek;

	public Dragon(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar,String gizli_yetenek) {
		super(beybladeci, donus_hizi, saldiri_gucu);
		this.kutsal_canavar = kutsal_canavar;
		this.gizli_yetenek = gizli_yetenek;
	}
	
	@Override
	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavar ad� : "+ kutsal_canavar);
		System.out.println("Gizli yetenek : "+ gizli_yetenek);
	}

	@Override
	public void kutsal_canavar_ortaya_cikar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+"� ortaya ��kard�...");
		System.out.println(getBeybladeci()+" �n sald�r�s� : Hayalet Kas�rgas�");

		
	}

	
}
