package visitor;

public class Manager extends Employee {
	
	private String performance;
	
	@Override
	protected String getOtherInfo() {
		// TODO Auto-generated method stub
		return "Òµ¼¨: "+this.performance+"\t";
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	

}
