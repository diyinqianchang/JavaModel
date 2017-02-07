package decorator;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport stReport) {
		super(stReport);
		System.out.println(stReport.getClass()+"+++++");
	}
	
	@Override
	public void report() {
		// TODO Auto-generated method stub
		super.report();   //�ȵ��ø���ķ���  �丸���� HighScore (������)
		this.reportSort();
	}
	
	private void reportSort() {
		System.out.println("����������38��");
	}

}
