package observe;

public class LiSi implements ILiSi {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("��˹:�۲쵽�����ӻ����ʼ���ϰ�㱨");
		this.reportToQiShiHuang(context);
		System.out.println("��˹���㱨���");
	}
	
	private void reportToQiShiHuang(String reportContext){
		System.out.println("�������ʼ��---->"+reportContext);
	}

}
