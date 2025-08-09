package day6.staticblock.finalusing;

public class FinalClassMethodTest {
	public class FinalMethodClassTest extends FinalClassMethod  {
		  // Compile time error because we cannot override the final method 
			/*
			 * @Override void show() {
			 * 
			 * System.out.println("This is the final method of FinalMethodEx class"); }
			 */
		   
	}
}
