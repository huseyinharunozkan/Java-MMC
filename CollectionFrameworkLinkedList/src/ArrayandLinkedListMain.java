import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayandLinkedListMain {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		zamanHesapla("LinkedList", linkedlist);
		zamanHesapla("ArrayList", arraylist);

	}
	public static void zamanHesapla(String veriTipi, List<Integer> list) {
		
		// Listin sonuna de�er ekleme
		long baslangic;
		long bitis;
		
		baslangic = System.currentTimeMillis();
		for(int i = 0; i<10000;i++) {
			
			list.add(0,i);
		} 
		bitis = System.currentTimeMillis();
		System.out.println(veriTipi +" ekleme s�resi "+(bitis- baslangic)+" ms");
	}

}
