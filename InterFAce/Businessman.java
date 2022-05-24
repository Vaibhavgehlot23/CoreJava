
public class Businessman implements Richman, SocialWorker {
	private String name;
	private String address;
	
	public void earnMoney() {
		System.out.println("Earning Money by doing Business");
	}
	public void donation() {
		System.out.println("Giving Donation");
	}
	public void party() {
		System.out.println("Party in weekend");
	}
	public void helpToOthers() {
		System.out.println("Helping Others");
	}
  }

