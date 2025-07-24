package dayfour.firstassingment;
import java.util.*;
public class PersonDemo {

	public static void main(String[] args) {
		Person p=new Person();
		Scanner s=new Scanner(System.in);
		String pname,pcity;
		int pid;
		System.out.println("Enter Person details : Name, age and city");
		pname = s.nextLine();
		pid = s.nextInt();
		s.nextLine();
		pcity = s.nextLine();
		
		p.setPname(pname);
		p.setPid(pid);
		p.setPcity(pcity);
		System.out.println("Person Details Name : " + p.getPname() + "\tAge : " + p.getPid() + "\tCity : "
				+ p.getPcity());
		
		System.out.println("Enter Person details : Name, age and city");
		pname = s.nextLine();
		pid = s.nextInt();
		s.nextLine();
		pcity = s.nextLine();
		p = new Person(pname, pcity, pid); // parameterized constructor invoked);
		System.out.println("Person Details Name : " + p.getPname() + "\tAge : " + p.getPid() + "\tCity : "
				+ p.getPcity());
		s.close();
		

	}

}
