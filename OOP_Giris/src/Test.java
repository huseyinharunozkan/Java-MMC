
public class Test {

	public static void main(String[] args) {
		Araba araba1 = new Araba();
		araba1.renk = "Pembe";
		araba1.tekerler = 4;
		araba1.kap�lar = 4;
		araba1.model = "mcQueen";
		araba1.motor = "1.8";
		
		System.out.println("Araban�n rengi: "+araba1.renk);
		System.out.println("Araban�n tekerlek say�s�: "+araba1.tekerler);
		System.out.println("Araban�n kap� say�s�: "+araba1.kap�lar);
		System.out.println("Araban�n modeli: "+araba1.model);
		System.out.println("Araban�n motoru: "+araba1.motor);
		
	}

}
