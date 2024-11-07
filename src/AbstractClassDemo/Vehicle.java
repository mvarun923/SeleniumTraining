package AbstractClassDemo;

public abstract class Vehicle {
	
	//Abstract Method
	public abstract void run();
	
	//Non Abstract Method
	public void brake() {
		System.out.println("Non Abstract method of Vehicle");
	}

}
