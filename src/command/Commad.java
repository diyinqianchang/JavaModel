package command;

public abstract class Commad {
	
	protected RequirementGroup rgGroup = new RequirementGroup();
	protected PageGroup pGroup = new PageGroup();
	protected CodeGroup cGroup = new CodeGroup();
	
	//�ھ���������оͿ���ָ��һ�������ߣ������Ͳ����ڳ�����ָ��������
//	protected final Receiver1 receiver1;
//	public Commad(Receiver1 _receiver){
//		this.receiver1 = _receiver
//	}
	
	public abstract void execute();

}
