package absfactory;

public abstract class AbstractBlockHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�Ǻ�ɫ��");	
	}
	@Override
	public void talk() {
		System.out.println("��ɫ����˵��");	
	}
}
