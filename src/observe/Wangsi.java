package observe;

public class Wangsi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("��˹�۲쵽,�����ӻ��");
		this.cry(context);
	}
	private void cry(String context){
		System.out.println("��˹����Ϊ"+context+"==�������˱�!");
	}

}
