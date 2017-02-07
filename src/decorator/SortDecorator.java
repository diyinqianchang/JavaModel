package decorator;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport stReport) {
		super(stReport);
		System.out.println(stReport.getClass()+"+++++");
	}
	
	@Override
	public void report() {
		// TODO Auto-generated method stub
		super.report();   //先调用父类的方法  其父类是 HighScore (在这里)
		this.reportSort();
	}
	
	private void reportSort() {
		System.out.println("我是排名第38名");
	}

}
