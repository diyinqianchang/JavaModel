package mediator;

public abstract class AbstratctMediator {
	
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	//��ô�������� ͨ�����췽����ֵ
	public AbstratctMediator() {
		purchase  = new Purchase(this);
		sale = new Sale(this) ;
		stock = new Stock(this);
		
	}
	
	public abstract void execute(String str,Object...objects);

}
