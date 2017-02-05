package mediator;

public class Stock extends AbstractColleague {

	public Stock(AbstratctMediator mediator) {
		super(mediator);
	}
	private static int COMPUTER_NUMBER = 100;
	public void increase(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("库存量为:"+COMPUTER_NUMBER);
	}
	public void decrease(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("库存量为:"+COMPUTER_NUMBER);
	}
	public int getStockNumber(){
		return COMPUTER_NUMBER;
	}
	public void clearStock(){
		System.out.println("清理存货");
		super.mediator.execute("stock.clear");
	}

}
