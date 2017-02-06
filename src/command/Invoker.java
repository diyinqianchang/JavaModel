package command;

public class Invoker {
	
	
	private Commad commad;
	public void setCommand(Commad commad){
		this.commad = commad;
	}
	public void action(){
		this.commad.execute();
	}

}
