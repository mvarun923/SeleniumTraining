package AbstractionDemo;

//implements is used to create parent class relation ship with Interface.
public class Book implements Printable, Interface2{
	
	//need to give implementation for all methods in the Interface. Its also called overriding it.
	public void print() {
		System.out.println("Print");
	}
	
	public void testPrint() {
		System.out.println("Test");
	}
	
	public void testPrint2() {
		System.out.println("Test");
	}
	
}
