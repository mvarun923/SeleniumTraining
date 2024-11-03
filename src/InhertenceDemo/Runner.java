package InhertenceDemo;

public class Runner {
	public static void main(String [] args ){
		
		Student std1 = new Student("Varun", 26, "Malayil", "MCA", 25000);
		std1.printStudent();
		
		Professor prof1 = new Professor("Akhil", 50, "Clt", 25000, 5);
		prof1.printProfessor();
			
	}
}
