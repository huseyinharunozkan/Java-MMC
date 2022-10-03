import java.util.Scanner;

public class Benim {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir Sayý Giriniz: ");
		int sayi = scan.nextInt();
		System.out.print("Basamak Sayýsý Giriniz: ");
		int basamakSayisi = scan.nextInt();
		
		int geciciSayi = sayi;
		int toplam = 0;
		
		do {
			int basamakDegeri = geciciSayi % 10;
			geciciSayi /= 10;
			
			toplam += Math.pow(basamakDegeri, basamakSayisi);
			
		}while(geciciSayi > 0);
		
		if(toplam == sayi) {
			System.out.println("Bu sayý armstrong sayýsýdýr...");
		}
		else {
			System.out.println("Bu sayý armstorng sayýsý deðildir...");
		}
	}

}
