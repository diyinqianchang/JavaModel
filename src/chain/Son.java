package chain;

public class Son extends Handler {

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
		
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("---------ĸ���������ʾ---------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ���:ͬ��");
		
	}

}
