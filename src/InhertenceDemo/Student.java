package InhertenceDemo;

public class Student extends Person{
	String courseName;
	int fees;
	
	public void printStudent() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(courseName);
		System.out.println(fees);
	}
	
	public Student(String nm, int ag, String addr, String cn, int fee) {
		//calling parent Constructor
		super(nm, ag, addr);
		
		courseName = cn;
		fees = fee;
	}

}
