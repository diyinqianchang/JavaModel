package composite;

public class Leaf implements ILeaf {
	//基本信息 
	private String name = "";
	private String position = "";
	private int salary = 0;
	//构造函数
	public Leaf(String name,String position,int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	//获取信息
	@Override
	public String getInfo() {
		String info = "";
		info = "姓名"+this.name;
		info = info+"\t职位"+this.position;
		info = info+"\t薪水"+this.salary;
		return info;
	}

}
