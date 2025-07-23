package DayThree;

public class Customer {
	
	private int cid;
	private String cname,ccity;
	
	public Customer()
	{
		System.out.println("Default Constructor");
	}
	
	public Customer(String cname,String ccity,int cid)
	{
		this();
		System.out.println("Parameterized Constructor");
		this.ccity=ccity;
		this.cid=cid;
		this.cname=cname;
		
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCcity() {
		return ccity;
	}

	public void setCcity(String ccity) {
		this.ccity = ccity;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", ccity=" + ccity + "]";
	}
	
}
