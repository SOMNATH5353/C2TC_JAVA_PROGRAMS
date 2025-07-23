package DayThree;
import java.util.*;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("Enter the Customer name");
		name=s.nextLine();
		System.out.println("Enter the Customer city");
		city=s.nextLine();
		System.out.println("Enter the Customer id:");
		id=s.nextInt();
		Customer c1=new Customer();		
		c1.setCcity("Pondicherry");
		c1.setCid(1);
		c1.setCname("Somnath");
		System.out.println(c1);
		
		System.out.println("Enter the Customer name");
		name=s.nextLine();
		System.out.println("Enter the Customer city");
		city=s.nextLine();
		System.out.println("Enter the Customer id:");
		id=s.nextInt();
		Customer c2=new Customer(name,city,id);
		System.out.println(c2);
		s.close();
		
		

	}

}
