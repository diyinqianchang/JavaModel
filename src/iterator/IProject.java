package iterator;


//��������
public interface IProject {
	
	//�����Ŀ
	public void add(String name,int num,int cost);
	//��ȡ��Ŀ��Ϣ
	public String getProjectInfo();
	//������
	public IProjectIterator iprojectIterator();

}
