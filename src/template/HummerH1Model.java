package template;

public class HummerH1Model extends HummerModel {

	private boolean alarmFlag = true;
	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("����H1����...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("����H1ͣ��...");
	}
	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("����H1����");
	}
	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("����H1��������������");
	}
	
	//���෽���ķ���ֵ�����������ֵ�ִ�н��
	@Override
	protected boolean isAlert() {
		// TODO Auto-generated method stub
		return this.alarmFlag;
	}
	//�ͻ����Ծ���
	public void setAlarmFlag(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}

}
