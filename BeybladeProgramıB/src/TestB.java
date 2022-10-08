import java.util.Scanner;

public class TestB {
	
	public static void main(String[] args) {
		System.out.println("Beyblade Programýna Hoþgeldiniz...");
		System.out.println("Çýkýþ için q'ya basýn...");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ? ");
			String islem = scan.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			}
			else {
				BeybladeFabrikasýB fabrika = new BeybladeFabrikasýB();
				
				BeybladeB beyblade = fabrika.beyblade_uret(islem);
			
				if (beyblade == null) {
					System.out.println("Lütfen geçerli bir beyblade ismi girin...");
				}
				else {
					beyblade.bilgileri_goster();
					beyblade.saldiri();
					beyblade.kutsal_canavar_ortaya_cikar();
				}
				
			}
			
			
			
		}
	}
}
