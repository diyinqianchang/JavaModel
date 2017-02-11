package iterator;


//抽象容器
public interface IProject {
	
	//添加项目
	public void add(String name,int num,int cost);
	//获取项目信息
	public String getProjectInfo();
	//迭代器
	public IProjectIterator iprojectIterator();

}
