package iterator;

import java.util.ArrayList;

//具体容器
public class Project implements IProject {
	
	//容纳对象的容器
	private ArrayList<IProject> projectList = new ArrayList<>();
	
	private String name = "";
	private int cost = 0;
	private int num = 0;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	public Project(String name,int num,int cost){
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	@Override
	public void add(String name, int num, int cost) {
		// TODO Auto-generated method stub
		//添加新项目   这个类是不是相当于项目管理类。
		this.projectList.add(new Project(name,num,cost));
	}

	@Override
	public String getProjectInfo() {
		// TODO Auto-generated method stub
		String info = "";
		info = info+"项目名称是"+this.name;
		info = info+"\t项目人数："+this.num;
		info = info +"\t项目费用"+this.cost;
		return info;
	}

	@Override
	public IProjectIterator iprojectIterator() {
		// TODO Auto-generated method stub
		return new ProjectIterator(this.projectList);
	}

}
