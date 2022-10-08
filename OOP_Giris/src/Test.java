
public class Test {

	public static void main(String[] args) {
		Araba araba1 = new Araba();
		araba1.renk = "Pembe";
		araba1.tekerler = 4;
		araba1.kapılar = 4;
		araba1.model = "mcQueen";
		araba1.motor = "1.8";
		
		System.out.println("Arabanın rengi: "+araba1.renk);
		System.out.println("Arabanın tekerlek sayısı: "+araba1.tekerler);
		System.out.println("Arabanın kapı sayısı: "+araba1.kapılar);
		System.out.println("Arabanın modeli: "+araba1.model);
		System.out.println("Arabanın motoru: "+araba1.motor);
		
	}

}
