package day7.assingment.overloading.v1;

public class ConstructorOverloadingDemo {
	public static void main(String[] args) {

		System.out.println("------------------------ Constructor Overloading -----------------------");

		Operations p = new Operations(); // default constructor invoked
		System.out.println(p);

		Operations p1 = new Operations(14.5f); // single parameter constructor
		System.out.println(p1);

		Operations p2 = new Operations(12.5f, 20.50f); // two parameters constructor
		System.out.println(p2);

	}
}
