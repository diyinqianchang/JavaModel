package compositepattern;

import java.util.ArrayList;




public class Root implements IRoot {

	private ArrayList<Object> subordinateList = new ArrayList<Object>();
	private String name = "";
	private String position = "";
	private int salary = 0;
	
	public Root(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String getInfo() {
		String info = "";
		info = "名称 "+this.name + "\t 职位" +this.position + "\t 薪水"+this.salary;
		return info;
	}

	@Override
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
		
	}

	@Override
	public void add(ILeaf leaf) {
		
		this.subordinateList.add(leaf);
		
	}

	@Override
	public ArrayList<Object> getSubordinateInfo() {
		// TODO Auto-generated method stub
		return this.subordinateList;
	}

}
