import java.util.ArrayList;

public class Main {
	public static void yazdir(ArrayList<String> a) {
		for(int i = 0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();

		arraylist.add("Metallica");
		arraylist.add("Guns and Roses");
		arraylist.add("Black Sabbath");
		arraylist.add("Iron Maiden");
		arraylist.add("Metallica");
//		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(3));
//		System.out.println(arrayList.get(5));

		
//		System.out.println(arrayList.size());
//		arraylist.remove(1);
//		arraylist.remove("Metallica");

//		System.out.println(arraylist.indexOf("Metallica"));
//		System.out.println(arraylist.lastIndexOf("Metallica"));
//		System.out.println(arraylist.indexOf("Dream Theater"));
		
//		arraylist.set(4, "Megadeth");
		
		yazdir(arraylist);
		
	}

}
