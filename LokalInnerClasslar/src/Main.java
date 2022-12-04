
public class Main {

	public static void main(String[] args) {

		class Alan{
			public void daireAlani(int yaricap) {
				System.out.println("Darirenin alaný : "+(yaricap * yaricap *Math.PI));
			}
		}
		Alan alan = new Alan();
		Alan alan2 = new Alan();
		
		alan.daireAlani(10);
		
		alan2.daireAlani(3);
	}
	public static void deneme() {
//		Alan alan3 = new Alan();
	}

}
