import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player>{
	private String isim;
	
	private int id;
	
	public Player(String isim,int id) {
		this.isim = isim;
		this.id = id;
	}

	@Override
	public String toString() {
		
		return "|||| ID: "+id+" Ýsim :"+isim+" |||";
	}

	@Override
	public int compareTo(Player player) {
		if(this.id < player.id) {
			return -1;
		}
		else if(this.id>player.id) {
			return 1;
		}
		return 0;
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		
/*	List<String> listString = new ArrayList<String>();
		
		listString.add("Java");
		listString.add("C++");
		listString.add("Python");
		listString.add("Php");
		listString.add("Go");
		
		Collections.sort(listString);
		
		for(String s : listString) {
			System.out.println(s);
		}
		*/
		
		List<Player> listPlayer = new ArrayList<Player>();
		
		listPlayer.add(new Player("Harun",17));
		listPlayer.add(new Player("Ýdil",06));
		listPlayer.add(new Player("Ýklim",9));
		listPlayer.add(new Player("Muslera",4));
		
		Player p1 = new Player("Harun",17);
		Player p2 = new Player("Ýdil",06);
		
		
	//	System.out.println(p1.compareTo(p1));
		
	/*	Collections.sort(listPlayer);
		
		for(Player p : listPlayer) {
			System.out.println(p);
		}
		*/
		Set<Player> treeset = new TreeSet<Player>();

		treeset.add(new Player("Harun",17));
		treeset.add(new Player("Ýdil",06));
		treeset.add(new Player("Ýklim",9));
		treeset.add(new Player("Muslera",4));
		
		for(Player p : treeset ) {
			System.out.println(p);
		}
	}

}
