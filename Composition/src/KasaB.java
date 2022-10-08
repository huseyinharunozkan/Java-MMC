
public class KasaB {
	
	private String model;
	
	private String uretici;
	
	private String malzeme;

	public KasaB(String model, String uretici, String malzeme) {
		this.model = model;
		this.uretici = uretici;
		this.malzeme = malzeme;
	}
	
	public void bilgisayari_ac() {
		System.out.println("Bilgisayar Açýlýyor...");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public String getMalzeme() {
		return malzeme;
	}

	public void setMalzeme(String malzeme) {
		this.malzeme = malzeme;
	}
	
}
