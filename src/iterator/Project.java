package iterator;

import java.util.ArrayList;

//��������
public class Project implements IProject {
	
	//���ɶ��������
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
		//�������Ŀ   ������ǲ����൱����Ŀ�����ࡣ
		this.projectList.add(new Project(name,num,cost));
	}

	@Override
	public String getProjectInfo() {
		// TODO Auto-generated method stub
		String info = "";
		info = info+"��Ŀ������"+this.name;
		info = info+"\t��Ŀ������"+this.num;
		info = info +"\t��Ŀ����"+this.cost;
		return info;
	}

	@Override
	public IProjectIterator iprojectIterator() {
		// TODO Auto-generated method stub
		return new ProjectIterator(this.projectList);
	}

}
