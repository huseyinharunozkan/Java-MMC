
public class FinalTest {

	public final int objeSayisi;
	
	private static int say = 0;
	private final String isim;
	
	public FinalTest(String isim) {
		this.isim = isim;
		say++;
		objeSayisi = say;
	
	}

	public static int getSay() {
		return say;
	}

	public static void setSay(int say) {
		FinalTest.say = say;
	}

	public int getObjeSayisi() {
		return objeSayisi;
	}

	public String getIsim() {
		return isim;
	}
	
	
	
}
