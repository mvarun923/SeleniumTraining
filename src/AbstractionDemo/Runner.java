package AbstractionDemo;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book();
		//from Interface 1
		b1.print();
		b1.testPrint();
		
		//public static final variables from Interface
		System.out.println(Printable.addr);
		
		//Static methods with Implimentations
		Printable.printaddr();
		
		//from Interface 2
		b1.testPrint2();

	}

}
