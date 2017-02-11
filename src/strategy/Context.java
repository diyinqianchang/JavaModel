package strategy;

public class Context {
	
	private IStrategy strategy;
	public Context(IStrategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
	}
	
	public void operate(){
		this.strategy.operate();
	}

}
