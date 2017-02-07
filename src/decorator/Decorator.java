package decorator;

//���������û�г��󷽷�
public abstract class Decorator extends SchoolReport {
	
	//����ʲô�ɼ���
	private SchoolReport schoolReport;
	
	public Decorator(SchoolReport stReport) {
		this.schoolReport = stReport;
	}
	
	public void report(){
		System.out.println(this.schoolReport.getClass()+"------");
		this.schoolReport.report();
		
	}
	//�������û�б� ���������� ��д
	public void sign(String name){
		this.schoolReport.sign(name);
	}

}
