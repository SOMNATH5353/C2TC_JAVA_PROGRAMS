package day2.entityclassassignment1;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setScity("Pondicherry");
		s1.setSid(11);
		s1.setSname("Somnath");
		//Student 1
		System.out.println("\nThe city of student "+s1.getSname()+" is "+s1.getScity());
		System.out.println("The id of student "+s1.getSname()+" is "+s1.getSid());
		System.out.println("The name of student "+s1.getSname()+" is "+s1.getSname());
		System.out.println(s1);
		//Student 2
		s2.setScity("Mumbai");
		s2.setSid(69);
		s2.setSname("Vijay Balaji");
		System.out.println("\nThe city of student "+s2.getSname()+" is "+s2.getScity());
		System.out.println("The id of student "+s2.getSname()+" is "+s2.getSid());
		System.out.println("The name of student "+s2.getSname()+" is "+s2.getSname());
		System.out.println(s2);
		//Student 3
		s3.setScity("Dubai");
		s3.setSid(99);
		s3.setSname("Valavanur Balaji");
		System.out.println("\nThe city of student "+s3.getSname()+" is "+s3.getScity());
		System.out.println("The id of student "+s3.getSname()+" is "+s3.getSid());
		System.out.println("The name of student "+s3.getSname()+" is "+s3.getSname());
		System.out.println(s3);
		

	}

}
