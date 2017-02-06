package chain;

public class Father extends Handler {
	
	public Father() {
		// TODO Auto-generated constructor stub
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub
		System.out.println("----------女儿向父亲请示-----------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是:同意\n");
	}

}
