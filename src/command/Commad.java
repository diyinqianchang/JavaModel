package command;

public abstract class Commad {
	
	protected RequirementGroup rgGroup = new RequirementGroup();
	protected PageGroup pGroup = new PageGroup();
	protected CodeGroup cGroup = new CodeGroup();
	
	//在具体的命令中就可以指定一个接受者，这样就不用在场景中指定接收者
//	protected final Receiver1 receiver1;
//	public Commad(Receiver1 _receiver){
//		this.receiver1 = _receiver
//	}
	
	public abstract void execute();

}
