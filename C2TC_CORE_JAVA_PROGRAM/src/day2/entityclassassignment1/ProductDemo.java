package day2.entityclassassignment1;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		p1.setPcity("Mumbai");
		p1.setPid(201);
		p1.setPname("Dove Shampoo");
		System.out.println("\nThe product id is "+p1.getPid()+" and the name is "+p1.getPname()+" from "+p1.getPcity());
		System.out.println(p1);
		
		p2.setPcity("Chennai");
		p2.setPid(301);
		p2.setPname("Himalaya Shampoo");
		System.out.println("\nThe product id is "+p2.getPid()+" and the name is "+p2.getPname()+" from "+p2.getPcity());
		System.out.println(p2);
		
		p3.setPcity("Hyderabad");
		p3.setPid(401);
		p3.setPname("Sunsilk Shampoo");
		System.out.println("\nThe product id is "+p3.getPid()+" and the name is "+p3.getPname()+" from "+p3.getPcity());
		System.out.println(p3);
		
		p4.setPcity("Delhi");
		p4.setPid(501);
		p4.setPname("Mountain Shampoo");
		System.out.println("\nThe product id is "+p4.getPid()+" and the name is "+p4.getPname()+" from "+p4.getPcity());
		System.out.println(p4);

	}

}
