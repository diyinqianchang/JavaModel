package chain;




public class Women implements IWomen {

	
	private int type = 0;
	private String request = "";
	
	public Women(int _type,String _request) {
		// TODO Auto-generated constructor stub
		this.type = _type;
		switch (this.type) {
		case 1:
			this.request = "Ů���������ǣ�"+_request;
			break;
		case 2:
			this.request = "���ӵ������ǣ�"+_request;
			break;
		case 3:
			this.request = "ĸ�׵������ǣ�"+_request;
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
