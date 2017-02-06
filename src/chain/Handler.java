package chain;

public abstract class Handler {
	
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	//责任处理级别
	private int level = 0;
	//责任传递，下一个人责任是谁
	private Handler nextHandle;
	
	public Handler(int _level) {
		// TODO Auto-generated constructor stub
		this.level = _level;
	}
	//一个女性 要求逛街，你要处理这个请求  不被继承
	public final void handleMessage(IWomen women){
		if (women.getType()==this.level) {
			this.response(women);
		} else {
			if (this.nextHandle!=null) {   //设定接任者不为空
				this.nextHandle.response(women);
			} else {
				System.out.println("----没地方请示了");
			}
		}
	}
	
	/*
	 * 如果不属于你处理的请求，你应该让她找写一个环节的人，
	 * 设置下一个处理请求的是谁
	 * */
	public void setNext(Handler _hHandler){
		this.nextHandle = _hHandler;
	}
	protected abstract void response(IWomen women);

}
