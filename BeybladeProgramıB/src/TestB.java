import java.util.Scanner;

public class TestB {
	
	public static void main(String[] args) {
		System.out.println("Beyblade Program�na Ho�geldiniz...");
		System.out.println("��k�� i�in q'ya bas�n...");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Hangi Beyblade'i �retmek istiyorsunuz ? ");
			String islem = scan.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			else {
				BeybladeFabrikas�B fabrika = new BeybladeFabrikas�B();
				
				BeybladeB beyblade = fabrika.beyblade_uret(islem);
			
				if (beyblade == null) {
					System.out.println("L�tfen ge�erli bir beyblade ismi girin...");
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
