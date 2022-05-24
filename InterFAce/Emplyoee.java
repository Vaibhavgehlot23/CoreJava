
public class Emplyoee extends Person1{
	private String designation =null;

	public Emplyoee() {
		System.out.println("deafault constructor");
	}

	public Emplyoee(String fn , String ln ,String des, String add) {
		super(fn, ln, add);
		this.designation = des;
		System.out.println("parameter 3");
	}
	public static void main(String[]args) {
		Emplyoee E = new Emplyoee ("rays","tech","indore","qa");
	}
	}
	
	
	


