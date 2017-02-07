package decorator;

//这个抽象类没有抽象方法
public abstract class Decorator extends SchoolReport {
	
	//这是什么成绩单
	private SchoolReport schoolReport;
	
	public Decorator(SchoolReport stReport) {
		this.schoolReport = stReport;
	}
	
	public void report(){
		System.out.println(this.schoolReport.getClass()+"------");
		this.schoolReport.report();
		
	}
	//这个方法没有被 具体修饰类 重写
	public void sign(String name){
		this.schoolReport.sign(name);
	}

}
