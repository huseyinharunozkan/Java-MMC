import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Matematik.Factorial factorial = new Matematik().new Factorial();
		Matematik.Asal asal = new Matematik().new Asal();
		Matematik.Alan alan = new Matematik().new Alan();
		Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan();

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir say� giriniz : ");

		int sayi = scan.nextInt();

		if (asal.asal_mi(sayi)) {
			System.out.println("Bu say� Asald�r.");
		} else {
			System.out.println("Bu say� asal de�ildir.");
		}
		factorial.faktoriyel();
//		alan.daire_alan(5);
		daire_alan.daire_alan(6);
	}

}
