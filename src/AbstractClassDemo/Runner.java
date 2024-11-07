package AbstractClassDemo;

public class Runner {

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		b1.run();
		
		//Its not in Bike class but in Vehicle
		b1.brake();

	}

}
