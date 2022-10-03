import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yat�rd���n�z har� bedeli: ");
		this.harc= scan.nextInt();
		scan.nextLine();
		
		System.out.print("Herhangi bir siyasi yasa��n�z var m�?(evet ya da hay�r) ");
		
		String cevap = scan.nextLine();
		if(cevap.equals("evet")){
			this.siyasiYasak = true;
		}
		else {
			this.siyasiYasak = false;
		}

		System.out.print("Vizeniz var m�?(evet ya da hay�r) ");
		String cevap2 = scan.nextLine();
		if(cevap2.equals("evet")) {
			this.vizeDurumu = true;
		}
		else {
			this.vizeDurumu = false;
		}
	}
	
	@Override
	public boolean yurtDisiHarci() {
		if(this.harc<15) {
			System.out.println("L�tgen yurtd��� ��k�� harc�n� tam yat�r�n.");
			return false;
		}
		else {
			System.out.println("Yurd��� harc� i�lemi tamam!");
			return true;
		}
		
	}
	@Override
	public boolean siyasiYasak() {
		if(this.siyasiYasak == true) {
			System.out.println("Siyasi yasa��n�z bulunuyor. Yurtd���na ��kamazs�n�z.");
			return false;
		}
		else {
			System.out.println("Siyasi yasa��n�z bulunmuyor.");
			return true;
		}
	}
	@Override
	public boolean vizeDurumu() {
		if(this.vizeDurumu == true) {
			System.out.println("Vize i�lemleri tamam!");
			return true;
			
		}
		else {
			System.out.println("Vizeniz gidece�iniz �lkeye bulunmamaktad�r.");
			return false;
		}
	}
	
}
