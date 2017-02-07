package decorator;

public class HighScoreDecorater extends Decorator {

	public HighScoreDecorater(SchoolReport stReport) {
		super(stReport);
		System.out.println(stReport.getClass()+"OPOP");
	}
	private void reportHighScore(){
		System.out.println(System.currentTimeMillis());
		System.out.println("������������75����ѧ��78����Ȼ��80");
	}
	
	@Override
	public void report() {
		// TODO Auto-generated method stub
		System.out.println("H----------");
		this.reportHighScore();
		super.report();
		System.out.println(super.getClass()+"===90900");
	}

}
