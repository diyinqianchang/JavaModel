package memento;


public class Boy {
	
	private String state = "";
	
	public void changeState() {
		this.state = "������ܺܲ���";
	}
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	public void restoreMemeto(Memento _mMemento){
		this.setState(_mMemento.getState());
	}

}
