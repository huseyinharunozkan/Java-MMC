
public class MonitorB {
	
	private String model;
	
	private String uretici;
	
	private String boyut;
	
	private ResolutionB resolution ;

	public MonitorB(String model, String uretici, String boyut, ResolutionB resolution) {
		this.model = model;
		this.uretici = uretici;
		this.boyut = boyut;
		this.resolution = resolution;
	}
	
	public void monitoru_kapat() {
		System.out.println("Monitor kapatýlýyor...");
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

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public ResolutionB getResolution() {
		return resolution;
	}

	public void setResolution(ResolutionB resolution) {
		this.resolution = resolution;
	}
	
	
}
