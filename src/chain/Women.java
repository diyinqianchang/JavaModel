package chain;




public class Women implements IWomen {

	
	private int type = 0;
	private String request = "";
	
	public Women(int _type,String _request) {
		// TODO Auto-generated constructor stub
		this.type = _type;
		switch (this.type) {
		case 1:
			this.request = "女儿的请求是："+_request;
			break;
		case 2:
			this.request = "妻子的请求是："+_request;
			break;
		case 3:
			this.request = "母亲的请求是："+_request;
			break;
		default:
			break;
		}
	}
	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public String getRequest() {
		// TODO Auto-generated method stub
		return this.request;
	}

}
