package day1.basics;
import java.util.*;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value for A");
		a=s.nextInt();
		System.out.println("Enter the value for B ");
		b=s.nextInt();
		c=a+b;
		System.out.println("The addition of a="+a+" and b="+b+" is ="+c);
		s.close();

	}

}
