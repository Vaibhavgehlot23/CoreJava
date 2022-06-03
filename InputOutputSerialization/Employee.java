package InputOutputSerialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private int Id;
	private String FirstName;
	private String LastName;
	private transient String tempValue;

	public Employee() {

	}

	public Employee(int id, String firstName, String lastName) {
	
		this.Id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		
	}

	public int getId() {
		return Id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getTempValue() {
		return tempValue;
	}
 
}
