
public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sabiha G�k�en Havaliman�na Ho�geldiniz");

		String sartlar = "Yurt D��� ��k�� Kurallar�:\n" + "Herhangi bir siyasi yasa�n��z�n bulunamamas� gerekiyor\n"
				+ "15 TL har� bedelini yat�rman�z gerekiyor\n" + "Gidece�iniz �lkeye vizenizi bulunmas� gerekiyor";
		String message = "Yurtd��� �artlar�ndan hepsini sa�laman�z gerekiyor.";

		while (true) {
			System.out.println("*****************************************");
			System.out.println(sartlar);
			System.out.println("*****************************************");
			

			Yolcu yolcu = new Yolcu();
			System.out.println("Har� Bedeli Kontrol Ediliyor...");

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
			System.out.println("��lemleriniz Tamam. Yurtd���na ��kabilirsiniz.");
			break;
		}

	}

}
