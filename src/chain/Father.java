package chain;

public class Father extends Handler {
	
	public Father() {
		// TODO Auto-generated constructor stub
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub
		System.out.println("----------Ů��������ʾ-----------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��\n");
	}

}
