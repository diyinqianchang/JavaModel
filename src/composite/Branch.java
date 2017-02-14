package composite;
import java.util.ArrayList;
public class Branch implements IBranch {
	
	private String name = "";
	private String position = "";
	private int salary = 0;
	
	ArrayList<ICop> subordinateList = new ArrayList<ICop>();
	
	public Branch(String name,String position,int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	@Override
	public String getInfo() {
		String info = "";
		info = "姓名"+this.name;
		info = info+"\t职位"+this.position;
		info = info+"\t薪水"+this.salary;
		return info;
	}
	@Override
	public void addSubordinate(ICop cop) {
		this.subordinateList.add(cop);
	}
	@Override
	public ArrayList<ICop> getSubordinate() {
		return this.subordinateList;
	}
}
