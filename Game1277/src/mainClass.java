
public class mainClass {
	public static void main(String[] args){
		Thread t1 = new Thread(new Game("one"));
		Thread t2 = new Thread(new Game("two"));
		Thread t3 = new Thread(new Game("three"));
		
		t1.start();
		t2.start();
		t3.start();
	}
}
