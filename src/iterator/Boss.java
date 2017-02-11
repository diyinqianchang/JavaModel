package iterator;

public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//相当于项目管理类
		IProject project = new Project();
		project.add("星球大战项目ddd", 10, 100000);
		project.add("扭转时空项目", 100, 1000000000);
		project.add("超人改造项目", 10000, 100000000);
		
		IProjectIterator projectIterator = project.iprojectIterator();
		while(projectIterator.hasNext()){
			IProject p = (IProject)projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}

}
