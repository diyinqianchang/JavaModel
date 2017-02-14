package composite;

public class Leaf implements ILeaf {
	//������Ϣ 
	private String name = "";
	private String position = "";
	private int salary = 0;
	//���캯��
	public Leaf(String name,String position,int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	//��ȡ��Ϣ
	@Override
	public String getInfo() {
		String info = "";
		info = "����"+this.name;
		info = info+"\tְλ"+this.position;
		info = info+"\tнˮ"+this.salary;
		return info;
	}

}
