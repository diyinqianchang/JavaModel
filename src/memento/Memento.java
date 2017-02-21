package memento;

public class Memento {
	
	private String state = "";
	public Memento(String _state) {
		// TODO Auto-generated constructor stub
		this.state = _state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

}
