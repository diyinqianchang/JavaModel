package mediator;

import java.util.Random;

public  class Sale extends AbstractColleague {

	public Sale(AbstratctMediator mediator) {
		super(mediator);
	}
	
	public void sellIBMComputer(int number){
		super.mediator.execute("sale.sell", number);
		System.out.println("³öÊÛ"+number+"Ì¨");
	}
	
	public int getSaleStatus(){
		Random random = new Random(System.currentTimeMillis());
		int saleStatue = random.nextInt(100);
		return saleStatue;
	}
	public void offSale(){
		super.mediator.execute("sale.offsale");
	}
	
}
