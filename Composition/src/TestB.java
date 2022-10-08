
public class TestB {

	public static void main(String[] args) {
		ResolutionB resolution = new ResolutionB(1920,1080);
		MonitorB monitor = new MonitorB("VS197DE","ASUS","18.5",resolution);
		
		KasaB kasa = new KasaB("ShadowBlade","Shadow","Temperli Cam");
		
		AnakartB anakart = new AnakartB("B250-PRO","Asus",10,"Windows 10");
		
		BilgisayarB pc = new BilgisayarB(monitor,kasa,anakart);
		
		pc.getKasa().bilgisayari_ac();
		
		pc.getMonitor().monitoru_kapat();
		
		pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
	}

}
