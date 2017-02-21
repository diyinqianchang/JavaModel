package visitor;

public class CommonEmployee extends Employee {

	
	private String job;
	
	@Override
	protected String getOtherInfo() {
		return "นคื๗: "+this.job+"\t";
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public void accept(IVisitor visitor) {
			visitor.visit(this);
	}

}
