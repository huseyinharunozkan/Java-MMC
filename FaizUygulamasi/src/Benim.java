import java.util.Scanner;

public class Benim {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen anapara de�erinizi giriniz: ");
		double anapara = scan.nextDouble();
		System.out.print("Ka� y�l vadeli yat�rmak istiyorsunuz: ");
		int vadesuresi = scan.nextInt();
		double faizOrani = 0.06;
		
		
		for(int i = 1; i<=vadesuresi;i++) {
			
			anapara = anapara+(anapara*faizOrani);
			System.out.println(i+".y�l�n sonunda toplam para: "+anapara);
		}
	}

}
