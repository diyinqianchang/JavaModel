package observe;

public class LiSiTest implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("��˹:�۲쵽�����ӻ����ʼ���ϰ�㱨");
		this.reportToQiShiHuang(context);
	}
	
	private void reportToQiShiHuang(String reportContext){
		System.out.println("�������ʼ��---->"+reportContext);
	}

}
