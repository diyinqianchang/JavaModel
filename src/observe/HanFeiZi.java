package observe;

public class HanFeiZi implements IHanFeiZi {
	
	private ILiSi liSi = new LiSi();

	@Override
	public void haveBreakfast() {
		// TODO Auto-generated method stub
		System.out.println("������:��ʼ�Է���");
		this.liSi.update("�������ڳԷ�");
	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		System.out.println("������:��ʼ����");
		this.liSi.update("������������");
	}

}
