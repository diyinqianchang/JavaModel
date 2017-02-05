package mediator;

public class Purchase extends AbstractColleague {

	public Purchase(AbstratctMediator mediator) {
		super(mediator);
	}
	
	public void buyIBMComputer(int number){
		super.mediator.execute("purchase.buy", number);
	}
	public void refuseBuyIBM(){
		System.out.println("²»ÔÚ²É¹º");
	}

}
