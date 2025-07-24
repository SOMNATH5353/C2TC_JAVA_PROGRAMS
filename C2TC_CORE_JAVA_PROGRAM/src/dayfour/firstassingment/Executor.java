package dayfour.firstassingment;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.defaultone();
		b.publicone();
		b.protectedone();
		
		
		b.normal=100;
		b.defaultone();
		
		b.pubnormal=25;
		b.publicone();
		
		b.pronormal=50;
		b.protectedone();
		
		System.out.println(b instanceof Base);

	}

}
