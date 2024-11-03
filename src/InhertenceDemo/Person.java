package InhertenceDemo;

//Parent Class
public class Person {
	String name;
	int age;
	String address;
	
	public void printPerson() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	
	//Parent Constructor which is called by super keyword
	public Person(String n, int a, String add) {
		name = n;
		age = a;
		address = add;

	}

}
