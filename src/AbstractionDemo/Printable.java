package AbstractionDemo;

public interface Printable {
	
	//abstract method, method without implementation, not giving details or functionality.
	public void print();
	public void testPrint();
	
	//variables are by default public static final
	String addr = "Public static final variable";
	
	//Interface can have static methods with implementations.
	public static void printaddr() {
		System.out.println("Static method with Implimentations");
	}

}
