package compositepattern;


public class Leaf implements ILeaf {

	private String name = "";
	private String position = "";
	private int salary = 0;
	
	public Leaf(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info = "";
		info = "名称 "+this.name + "\t 职位" +this.position + "\t 薪水"+this.salary;
		return info;
	}

}
