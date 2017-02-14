package observe;

public class LiSiTest implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("李斯:观察到韩非子活动，开始的老板汇报");
		this.reportToQiShiHuang(context);
	}
	
	private void reportToQiShiHuang(String reportContext){
		System.out.println("报告给秦始皇---->"+reportContext);
	}

}
