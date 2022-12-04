import java.util.Scanner;

public class Matematik {
	private double PI = Math.PI;

	public class Factorial {

		public void faktoriyel() {

			Scanner scan = new Scanner(System.in);

			System.out.println("Bir say� giriniz: ");
			int sayi = scan.nextInt();
			int fakt = 1;

			for (int i = 2; i <= sayi; i++) {
				fakt*=i;
			}
			System.out.println("Fakt�riyel: " + fakt);
		}
	}

	public class Asal {

		public boolean asal_mi(int sayi) {
			int i = 2;
			while (i < sayi) {
				if (sayi % i == 0) {
					return false;
				}
				i++;

			}
			return true;
		}
	}

	public class Alan {

		public class DaireAlan {
			public void daire_alan(int yaricap) {

				System.out.println("Dairenin alan�: " + (yaricap * yaricap * PI));
			}

		}

	}
}
