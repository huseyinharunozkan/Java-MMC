import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

public static class Player{
	private String name ;
	private int id;
	public Player(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "|||| ID: "+ id+" Name : "+name+"||";
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
	
	public static void main(String[] args) {
		
		Set<Player> hashset = new HashSet<Player>();
		
		Player player1 = new Player("Harun", 1);
		Player player2 = new Player("Metin",10);
		Player player3 = new Player("Ýdil", 6);
		Player player4 = new Player("Harun", 1);
		
		hashset.add(player1);
		hashset.add(player2);
		hashset.add(player3);
		hashset.add(player4);
		
		for(Player p : hashset) {
			System.out.println(p);
		}
		
	}

}
