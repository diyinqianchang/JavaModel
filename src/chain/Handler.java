package chain;

public abstract class Handler {
	
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	//���δ�����
	private int level = 0;
	//���δ��ݣ���һ����������˭
	private Handler nextHandle;
	
	public Handler(int _level) {
		// TODO Auto-generated constructor stub
		this.level = _level;
	}
	//һ��Ů�� Ҫ���֣���Ҫ�����������  �����̳�
	public final void handleMessage(IWomen women){
		if (women.getType()==this.level) {
			this.response(women);
		} else {
			if (this.nextHandle!=null) {   //�趨�����߲�Ϊ��
				this.nextHandle.response(women);
			} else {
				System.out.println("----û�ط���ʾ��");
			}
		}
	}
	
	/*
	 * ����������㴦���������Ӧ��������дһ�����ڵ��ˣ�
	 * ������һ�������������˭
	 * */
	public void setNext(Handler _hHandler){
		this.nextHandle = _hHandler;
	}
	protected abstract void response(IWomen women);

}
