package daytwo;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int begin=10;
		int ending=20;

		for (int i = begin; i <= ending; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();

		}
	}

}
