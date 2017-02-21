package mementoclone;

public class Originator implements Cloneable {
	
	private Originator backup;
	private String state = "";
	public String getState(){
		return state;
	}
	public void setState(String state){
		this.state = state;
	}
	
	public void createMemento() {
		this.backup = this.clone();
	}
	
	public void restoreMemeto( ) {
		this.setState(this.backup.getState());
	}
	
	@Override
	protected Originator clone()  {
		// TODO Auto-generated method stub
		try {
			return (Originator)super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
