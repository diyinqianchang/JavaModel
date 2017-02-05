package mediator;

public class Mediator extends AbstratctMediator {

	@Override    //注意这种写法  可以传过来多个值
	public void execute(String str, Object... objects) {
		
		if (str.equals("purchase.buy")) {
			this.buyComputer((Integer)objects[0]);
		}else if (str.equals("sale.sell")) {
			this.sellComputer((Integer)objects[0]);
		}else if (str.equals("sale.offsell")) {
			this.offSell();
		}else if (str.equals("stock.clear")) {
			this.clearStock();
		}
		
	}
	
	private void buyComputer(int number){
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus>80) {
			System.out.println("采购IBM"+number+"台");
		}else {
			int buyNumber = number/2;
			System.out.println("采购"+number+"台");
		}
	}
	
	private void sellComputer(int number){
		if (super.stock.getStockNumber()<number) {  //库存不够销售
			super.purchase.buyIBMComputer(number);
		}
		super.stock.decrease(number);
	}
	
	private void offSell(){
		System.out.println("折价销售IBM"+stock.getStockNumber());
	}
	private void clearStock(){
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}
	

}
