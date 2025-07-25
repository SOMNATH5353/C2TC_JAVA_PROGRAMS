package day5;

public class Trainer extends Person {
	
	private String session;
	private String desig;
	private String batchno;
	
	public Trainer(String session, String desig, String batchno) {
		super();
		this.session = session;
		this.desig = desig;
		this.batchno = batchno;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getBatchno() {
		return batchno;
	}
	@Override
	public String toString() {
		return "Trainer [session=" + session + ", desig=" + desig + ", batchno=" + batchno + "]";
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
}
