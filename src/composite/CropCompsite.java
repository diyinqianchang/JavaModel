package composite;


// �������
public abstract class CropCompsite {
	
	private String name = "";
	private String position = "";
	private int salary = 0;
	
	public CropCompsite(String _name,String _position,int _salary) {
		this.name = _name;
		this.position = _position;
		this.salary = _salary;
	}
	
	public String getInfo(){
		String info = "";
		info = "����"+this.name;
		info = info+"\tְλ"+this.position;
		info = info+"\tнˮ"+this.salary;
		return info;
	}

}
