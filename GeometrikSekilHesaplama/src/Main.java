import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String islemler = 		"��lemler : \n" 
						+ "1. Kare Alan Hesapla\n" 
						+ "2. ��gen Alan Hesapla\n" 
						+ "3. Daire Alan Hesapla\n"
						+ "��k�� : q";

		while (true) {
			System.out.println(islemler);
			System.out.print("Hangi �eklin Alan�n� Hesaplamak �stiyorsunuz : ");
			String sekilTuru = scan.nextLine();
			Sekil sekil = null;
			if (sekilTuru.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			} else if (sekilTuru.equals("1")) {
				System.out.print("Karenin Kenar : ");
				int kenar = scan.nextInt();
				scan.nextLine();

				sekil = new Kare("Kare1", kenar);

				sekil.alanHesapla();
			} else if (sekilTuru.equals("2")) {
				System.out.print("Kenar 1 : ");
				int kenar1 = scan.nextInt();
				System.out.print("Kenar 2 : ");
				int kenar2 = scan.nextInt();
				System.out.print("Kenar 3 : ");
				int kenar3 = scan.nextInt();
				
				scan.nextLine();

				sekil = new Ucgen("Ucgen1", kenar1, kenar2, kenar3);
				sekil.alanHesapla();

			} else if (sekilTuru.equals("3")) {
				System.out.print("Dairenin Yar��ap� : ");
				int yaricap = scan.nextInt();
				scan.nextLine();
				
				sekil = new Daire("Daire1", yaricap);
				sekil.alanHesapla();
			}
			else {
				System.out.println("Ge�ersiz i�lem...");
			}
		}

	}

}
