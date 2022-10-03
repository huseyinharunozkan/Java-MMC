import java.util.Scanner;

public class Benim {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir Say� Giriniz: ");
		int sayi = scan.nextInt();
		System.out.print("Basamak Say�s� Giriniz: ");
		int basamakSayisi = scan.nextInt();
		
		int geciciSayi = sayi;
		int toplam = 0;
		
		do {
			int basamakDegeri = geciciSayi % 10;
			geciciSayi /= 10;
			
			toplam += Math.pow(basamakDegeri, basamakSayisi);
			
		}while(geciciSayi > 0);
		
		if(toplam == sayi) {
			System.out.println("Bu say� armstrong say�s�d�r...");
		}
		else {
			System.out.println("Bu say� armstorng say�s� de�ildir...");
		}
	}

}
