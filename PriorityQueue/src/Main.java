import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
	private String isim;
	private int id;
	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}

	@Override
	public int compareTo(Player player) {
		if (this.id < player.id) {
			return -1;
		} else if (this.id > player.id) {
			return 1;

		}
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ýsim : " + isim + " Id : "+ id ;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Queue<Player> queue = new PriorityQueue<Player>();
		
		queue.offer(new Player("Murat",5));
		queue.offer(new Player("Harun",1));
		queue.offer(new Player("Kerim",100));
		
		while(!queue.isEmpty()) {
			System.out.println("Eleman Çýkarýlýyor | "+ queue.poll());
		}
	/*	queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(100);
		
		System.out.println(queue.peek());
		
		System.out.println(queue.contains(100));
		
		while(!queue.isEmpty()) {
			System.out.println("Eleman çýkarýlýyor : "+ queue.poll());
		}
		/*	for(int i :queue) {
		System.out.println(i);
	}
	*/
	
		
	}

}
