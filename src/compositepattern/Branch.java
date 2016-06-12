package compositepattern;

import java.util.ArrayList;

public class Branch implements IBranch {

//	private ArrayList<Object> subordinateList = new ArrayList<Object>();
	
	private ArrayList<Icorp> subordinateList = new ArrayList<Icorp>();
	
	
	private String name = "";
	private String position = "";
	private int salary = 0;
	public Branch(String name, String position, int salary) {
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
	public void add(Icorp icorp) {
		// TODO Auto-generated method stub
		this.subordinateList.add(icorp);
	}

//	@Override
//	public void add(ILeaf leaf) {
//		// TODO Auto-generated method stub
//		this.subordinateList.add(leaf);
//	}

//	@Override
//	public ArrayList<Object> getSubordinateInfo() {
//		
//		return this.subordinateList;
//	}
	@Override
		public ArrayList<Icorp> getSubordinateInfo() {
			// TODO Auto-generated method stub
			return this.subordinateList;
		}

}
