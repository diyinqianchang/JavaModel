package mediator;

public abstract class AbstratctMediator {
	
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	//怎么关联起来 通过构造方法传值
	public AbstratctMediator() {
		purchase  = new Purchase(this);
		sale = new Sale(this) ;
		stock = new Stock(this);
		
	}
	
	public abstract void execute(String str,Object...objects);

}
