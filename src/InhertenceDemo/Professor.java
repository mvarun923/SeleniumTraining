package InhertenceDemo;

public class Professor extends Person{
	int salary;
	int experience;
	
	public void printProfessor() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(experience);
	}
	
	public Professor(String nm, int ag, String addr, int s, int exp) {
		//calling parent Constructor
		super(nm, ag, addr);
		salary = s;
		
		experience =exp;
	}

}
