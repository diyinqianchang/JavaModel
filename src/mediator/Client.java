package mediator;

public class Client {

	public static void main(String[] args) {
		
		AbstratctMediator mediator = new Mediator();
		Purchase purchase = new Purchase(mediator);
		Sale sale = new Sale(mediator);
		Stock stock = new Stock(mediator);
		
		purchase.buyIBMComputer(100);
		sale.sellIBMComputer(1);
		stock.clearStock();

	}

}
