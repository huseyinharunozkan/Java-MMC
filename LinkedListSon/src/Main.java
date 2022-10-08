import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void islemleriBastir() {
		System.out.println("0 - Ýþlemleri Görüntüle...");
		System.out.println("1 - Bir sonraki þehre git...");
		System.out.println("2 - Bir önceki þehre git...");
		System.out.println("3 - Uygulamadan Çýk...");

	}

	public static void sehirleriTurla(LinkedList<String> sehirler) {
		ListIterator<String> iterator = sehirler.listIterator();
		int islem;
		islemleriBastir();
		Scanner scan = new Scanner(System.in);

		if (!iterator.hasNext()) {
			System.out.println("Herhangi bir þehir bulunmuyor...");

		}
		boolean ileri = true;
		boolean cikis = false;
		while (!cikis) {
			System.out.println("Bir iþlem seçiniz : ");
			islem = scan.nextInt();
			switch (islem) {
			case 0:
				islemleriBastir();
				break;
			case 1:
				if (!ileri) {
					if (iterator.hasNext()) {

						iterator.next();
					}
					ileri = true;
				}
				if (iterator.hasNext()) {
					System.out.println("Þehre gidiliyor : " + iterator.next());
				} else {
					System.out.println("Gidilecek Þehir Kalmadý...");
					ileri = true;
				}
				break;
			case 2:
				if (ileri) {
					if (iterator.hasPrevious()) {
						iterator.previous();
					}
					ileri = false;
				}
				if (iterator.hasPrevious()) {
					System.out.println("Þehre gidiliyor : " + iterator.previous());
				} else {
					System.out.println("Þehir Turu Baþladý...");
				}
				break;

			case 3:
				cikis = true;
				System.out.println("Uygulamadan çýkýlýyor...");
				break;
				default :
					System.out.println("Geçersiz Ýþlem...");
			}
		}
	}

	public static void main(String[] args) {

		LinkedList<String> sehirler = new LinkedList<String>();

		sehirler.add("Ankara");
		sehirler.add("Eskiþehir");
		sehirler.add("Afyon");

		sehirleriTurla(sehirler);
	}

}
