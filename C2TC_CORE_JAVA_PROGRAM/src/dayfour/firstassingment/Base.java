package dayfour.firstassingment;

public class Base {

	
			
		int normal=10;
		public int pubnormal=20;
		private int prinormal=30;
		protected int pronormal=40;
		// Using Default,Public,Private methods
		void defaultone()
		{
			System.out.println("This is an Default Method");
			System.out.println("Default variable:"+normal);
		}
		
		public void publicone()
		{
			System.out.println("This is an Public Method");
			System.out.println("Public Variable:"+pubnormal);
		}
		
		/*
		 * // private void methodPrivate() // { //
		 * System.out.println("Private access Base class"); //
		 * System.out.println("Private Variable : "+prinormal); // // }
		 */		
		protected void protectedone()
		{
			System.out.println("This is an Protected Method");
			System.out.println("Protected Variable:"+pronormal);
		}
		
		
		
	}


