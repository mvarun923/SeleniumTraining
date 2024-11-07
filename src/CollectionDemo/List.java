package CollectionDemo;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> num = new ArrayList<>();
		
		//Add elements
		num.add("a");
		num.add(" b ");
		num.add("  c ");
		num.add("   d ");
		
		//get elements
		System.out.println(num.get(0));
		
		for (int i=0; i<num.size(); i++) {
			System.out.println(num.get(i));
		}
		
	}

}
