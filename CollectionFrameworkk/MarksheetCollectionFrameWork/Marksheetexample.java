package MarksheetCollectionFrameWork;

public class Marksheetexample {
	
	private String RollNo ;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	
	
	
	public Marksheetexample(String rollNo, String name, int physics, int chemistry, int maths) {
		
		RollNo = rollNo;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
		
		
	}
	public String getRollNo() {
		return RollNo;
	}
	public String getName() {
		return name;
	}
	public int getPhysics() {
		return physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public int getMaths() {
		return maths;
	}
	
	

}
