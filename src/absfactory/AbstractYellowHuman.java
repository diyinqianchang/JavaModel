package absfactory;

public abstract class AbstractYellowHuman implements Human {
	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǻ�ɫ��");	
	}
	@Override
	public void talk() {
		System.out.println("��ɫ����˵��");	
	}
}
