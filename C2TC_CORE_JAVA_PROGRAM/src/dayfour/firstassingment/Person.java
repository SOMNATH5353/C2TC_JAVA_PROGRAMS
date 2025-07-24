package dayfour.firstassingment;

public class Person {

		private String pname,pcity;
		private int pid;
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getPcity() {
			return pcity;
		}
		public void setPcity(String pcity) {
			this.pcity = pcity;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		
		public Person()
		{
			System.out.println("Default Constructor");
			
		}
		
		public Person(String pname,String pcity,int pid)
		{
			System.out.println("Parameterized Constructor");
			this.pname=pname;
			this.pid=pid;
			this.pcity=pcity;
		}
		
	}

