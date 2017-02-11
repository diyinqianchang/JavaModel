package iterator;

public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�൱����Ŀ������
		IProject project = new Project();
		project.add("�����ս��Ŀddd", 10, 100000);
		project.add("Ťתʱ����Ŀ", 100, 1000000000);
		project.add("���˸�����Ŀ", 10000, 100000000);
		
		IProjectIterator projectIterator = project.iprojectIterator();
		while(projectIterator.hasNext()){
			IProject p = (IProject)projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}

}
