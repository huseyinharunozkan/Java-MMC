
public class StaticClass {
	public static int objeSayisi = 0;
	private static String isim;
	
	public StaticClass(String isim) {
		this.isim = isim;
		objeSayisi++;
	}
	public static String getIsim() {
		return isim;
	}
}
