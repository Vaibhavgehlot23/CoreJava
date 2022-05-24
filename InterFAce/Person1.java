
public class Person1 {
	private String firstname = null;
	private String lastname = null;
	private String address = null;

	public Person1() {
		System.out.println("default constructor");
	}

	public Person1(String fn, String ln) {
        
		firstname = fn;
		lastname = ln;
		System.out.println("parameter 1");
	}

	public Person1(String fn, String ln, String add) {

		this(fn, ln);
		this.address = add;
		System.out.println("parameter 2");
	}

public static void main(String[] args) {
	

Person1 p= new Person1("rays","tech","indore");

}
}