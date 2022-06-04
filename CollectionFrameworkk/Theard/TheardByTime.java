package Theard;

public class TheardByTime extends Thread {

	private String name = null;

	public TheardByTime(String threadName) {
		this.name = threadName;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + name);
			try {
				Thread.sleep(1000);
				System.out.println("Sleep for 1 sec");
			} catch (Exception x) {
				x.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		TheardByTime t1 = new TheardByTime ("Le");
		TheardByTime t2 = new TheardByTime("va");
		
		t1.start();
		t2.start();
	}

}
