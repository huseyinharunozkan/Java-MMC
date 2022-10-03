
public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sabiha Gökçen Havalimanýna Hoþgeldiniz");

		String sartlar = "Yurt Dýþý Çýkýþ Kurallarý:\n" + "Herhangi bir siyasi yasaðnýýzýn bulunamamasý gerekiyor\n"
				+ "15 TL harç bedelini yatýrmanýz gerekiyor\n" + "Gideceðiniz ülkeye vizenizi bulunmasý gerekiyor";
		String message = "Yurtdýþý þartlarýndan hepsini saðlamanýz gerekiyor.";

		while (true) {
			System.out.println("*****************************************");
			System.out.println(sartlar);
			System.out.println("*****************************************");
			

			Yolcu yolcu = new Yolcu();
			System.out.println("Harç Bedeli Kontrol Ediliyor...");

			Thread.sleep(3000);
			if (yolcu.yurtDisiHarci() == false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Siyasi Yasak Kontrol Ediliyor...");

			Thread.sleep(3000);
			if (yolcu.siyasiYasak() == false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Vize Durumu Kontrol Ediliyor...");
			Thread.sleep(3000);
			if (yolcu.vizeDurumu() == false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Ýþlemleriniz Tamam. Yurtdýþýna çýkabilirsiniz.");
			break;
		}

	}

}
