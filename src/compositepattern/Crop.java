package compositepattern;

public abstract class Crop {
	private String name = "";
	private String position = "";
	private int salary = 0;
	public Crop(String _name, String _position, int _salarry) {
		super();
		this.name = _name;
		this.position = _position;
		this.salary = _salarry;
	}
	public String getInfo() {
		String info = "";
		info = "名称 "+this.name + "\t 职位" +this.position + "\t 薪水"+this.salary;
		return info;
	}

}
