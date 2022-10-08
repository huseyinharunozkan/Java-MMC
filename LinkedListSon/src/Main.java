import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void islemleriBastir() {
		System.out.println("0 - ��lemleri G�r�nt�le...");
		System.out.println("1 - Bir sonraki �ehre git...");
		System.out.println("2 - Bir �nceki �ehre git...");
		System.out.println("3 - Uygulamadan ��k...");

	}

	public static void sehirleriTurla(LinkedList<String> sehirler) {
		ListIterator<String> iterator = sehirler.listIterator();
		int islem;
		islemleriBastir();
		Scanner scan = new Scanner(System.in);

		if (!iterator.hasNext()) {
			System.out.println("Herhangi bir �ehir bulunmuyor...");

		}
		boolean ileri = true;
		boolean cikis = false;
		while (!cikis) {
			System.out.println("Bir i�lem se�iniz : ");
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
					System.out.println("�ehre gidiliyor : " + iterator.next());
				} else {
					System.out.println("Gidilecek �ehir Kalmad�...");
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
					System.out.println("�ehre gidiliyor : " + iterator.previous());
				} else {
					System.out.println("�ehir Turu Ba�lad�...");
				}
				break;

			case 3:
				cikis = true;
				System.out.println("Uygulamadan ��k�l�yor...");
				break;
				default :
					System.out.println("Ge�ersiz ��lem...");
			}
		}
	}

	public static void main(String[] args) {

		LinkedList<String> sehirler = new LinkedList<String>();

		sehirler.add("Ankara");
		sehirler.add("Eski�ehir");
		sehirler.add("Afyon");

		sehirleriTurla(sehirler);
	}

}
