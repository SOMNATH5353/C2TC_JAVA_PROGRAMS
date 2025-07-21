package daytwo;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 5; k < 15; k++)
		{
		// Even numbers are skipped
		if (k%2 == 0)
		continue;
		// Odd numbers are printed
		System.out.print(k + " ");
		}
	}

}
