package bridge;

public abstract class Corp {
	
//	protected abstract void produce();
//	
//	protected abstract void sell();
	
	private Product product;
	
	public Corp(Product product) {
		this.product = product;
	}
	
	public void makeMoney(){
//		this.produce();
//		this.sell();
		this.product.beProducted();
		this.product.beSelled();
	}

}
