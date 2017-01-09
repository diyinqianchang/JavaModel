package absfactory;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("白色的");
	}
	@Override
	public void talk() {
		System.out.println("白色人中说话");
	}
	
}
