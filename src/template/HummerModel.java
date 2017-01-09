package template;

public abstract class HummerModel {
   
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	//���ӷ���  ��������ķ���ֵ����������޸����ֵ�Ӷ�Ӱ�� �������Ϊ�ṹ��
	protected  boolean isAlert() {
		return true;
	}
	
	// ��������Ĺ������� ���涼���������ʵ�ֵķ�����
	final public void run(){
		this.start();
		this.engineBoom();
		if (this.isAlert()) {
			this.alarm();
		}
		
		this.stop();
	}
	
}
