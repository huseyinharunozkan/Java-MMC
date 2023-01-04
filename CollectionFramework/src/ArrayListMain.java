import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("C#");
		list.add("Assembly");
		
		System.out.println(list.get(2)); 
		
		System.out.println("************************");
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("************************");
		for(String p : list) {
			System.out.println(p);
		}
		System.out.println("************************");
		
		list.remove(1);
		list.remove("Java");
		for(String p : list) {
			System.out.println(p);
		}

	}

}
