import java.util.Scanner;

public class Benim {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen anapara deðerinizi giriniz: ");
		double anapara = scan.nextDouble();
		System.out.print("Kaç yýl vadeli yatýrmak istiyorsunuz: ");
		int vadesuresi = scan.nextInt();
		double faizOrani = 0.06;
		
		
		for(int i = 1; i<=vadesuresi;i++) {
			
			anapara = anapara+(anapara*faizOrani);
			System.out.println(i+".yýlýn sonunda toplam para: "+anapara);
		}
	}

}
