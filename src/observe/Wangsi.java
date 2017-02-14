package observe;

public class Wangsi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("王斯观察到,韩非子活动了");
		this.cry(context);
	}
	private void cry(String context){
		System.out.println("王斯：因为"+context+"==所以我伤悲!");
	}

}
