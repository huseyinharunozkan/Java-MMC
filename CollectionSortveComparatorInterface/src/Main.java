
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class BuyuktenKucugeString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		  return -o1.compareTo(o2);
		  
	}
	
	
}
class KucuktenBuyugePlayer implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.getId() < o2.getId()){
			return -1;
		}
		else if(o1.getId() > o2.getId()) {
			return 15;
		}
		return 0;
	}
	
}
class BuyuktenKucugePlayer implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.getId() < o2.getId()){
			return 1;
		}
		else if(o1.getId() > o2.getId()) {
			return -1000;
		}
		return 0;
	}
	
}
class KucuktenBuyugeStringPlayer implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		
		return o1.getIsim().compareTo(o2.getIsim());
	}
	
}

class Player{
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + id + " Ýsim :" + isim + " |||";
       
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
		
		Collections.sort(listString,new BuyuktenKucugeString());
		
		for(String s : listString) {
			System.out.println(s);
		}
		*/
		
		
		List<Player> listPlayer = new ArrayList<Player>();
		
		listPlayer.add(new Player("Harun",17));
		listPlayer.add(new Player("Ýdil",06));
		listPlayer.add(new Player("Iklim",9));
		listPlayer.add(new Player("Muslera",4));
		
	//	Collections.sort(listPlayer,new KucuktenBuyugePlayer());
		
	//	Collections.sort(listPlayer,new BuyuktenKucugePlayer());
		
	//	Collections.sort(listPlayer, new KucuktenBuyugeStringPlayer());
		
		Collections.sort(listPlayer,new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				
				return -o1.getIsim().compareTo(o2.getIsim());
			}
			
		});
		
		for(Player p : listPlayer) {
			System.out.println(p);
		}
		
//		Player p1 = new Player("Harun",17);
//		Player p2 = new Player("Ýdil",06);
		
		
		
	//	System.out.println(p1.compareTo(p1));
		
	/*	Collections.sort(listPlayer);
		
		for(Player p : listPlayer) {
			System.out.println(p);
		}
		*/
/*		Set<Player> treeset = new TreeSet<Player>();

		treeset.add(new Player("Harun",17));
		treeset.add(new Player("Ýdil",06));
		treeset.add(new Player("Ýklim",9));
		treeset.add(new Player("Muslera",4));
		
		for(Player p : treeset ) {
			System.out.println(p);
		}
		*/
	}

}
