package Theard;

public class Theardd extends Thread {
	private String name = null;
	public Theardd (String threadName) {
		this.name = threadName;
		}
	public void run () {
		for (int i = 0; i < 50; i++) {
			System.out.println(i  + name);
			}
	}
	public static void main(String[] args) {
		Theardd t1 = new Theardd("Le");
		Theardd t2 = new Theardd("va");
		t1.start();
		t2.start();
	}

}
