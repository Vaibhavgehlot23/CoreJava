package SortingMarksheet;

public class Marksheet implements Comparable<Marksheet> {

	private String rollno;

	private String lastname;
	private int marks;
	private String fname;

	public Marksheet(String rollno, String fname, String lastname, int marks) {

		this.rollno = rollno;
		this.setFname(fname);
		this.setLastname(lastname);
		this.marks = marks;
	}

	public String getfname() {
		return this.getFname();
	}

	@Override
	public int compareTo(Marksheet o) {
		return rollno.compareTo(o.rollno);
	}

	public String toString() {
		return rollno + " , " + getFname() + " , " + getLastname() + " , " + marks;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
