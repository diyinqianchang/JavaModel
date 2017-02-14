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
		info = "����"+this.name;
		info = info+"\tְλ"+this.position;
		info = info+"\tнˮ"+this.salary;
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
