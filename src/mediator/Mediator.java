package mediator;

public class Mediator extends AbstratctMediator {

	@Override    //ע������д��  ���Դ��������ֵ
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
			System.out.println("�ɹ�IBM"+number+"̨");
		}else {
			int buyNumber = number/2;
			System.out.println("�ɹ�"+number+"̨");
		}
	}
	
	private void sellComputer(int number){
		if (super.stock.getStockNumber()<number) {  //��治������
			super.purchase.buyIBMComputer(number);
		}
		super.stock.decrease(number);
	}
	
	private void offSell(){
		System.out.println("�ۼ�����IBM"+stock.getStockNumber());
	}
	private void clearStock(){
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}
	

}
