package template;

public class HummerH1Model extends HummerModel {

	private boolean alarmFlag = true;
	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("悍马H1发动...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("悍马H1停车...");
	}
	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("悍马H1鸣笛");
	}
	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("悍马H1引擎声音是这样");
	}
	
	//子类方法的返回值决定公共部分的执行结果
	@Override
	protected boolean isAlert() {
		// TODO Auto-generated method stub
		return this.alarmFlag;
	}
	//客户可以决定
	public void setAlarmFlag(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}

}
