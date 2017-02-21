package bridge;

public class HouseCorp extends Corp {

	public HouseCorp(Product product) {
		super(product);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void makeMoney() {
		// TODO Auto-generated method stub
		super.makeMoney();
		System.out.println("房地产公司大赚了");
	}

}
