
public class mainThread {
	public static void main(String[] args){
		
		Thread t1 = new Thread(new threadtest("one"));
		Thread t2 = new Thread(new threadtest("two"));
		Thread t3 = new Thread(new threadtest("three"));
		Thread t4 = new Thread(new threadtest("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
