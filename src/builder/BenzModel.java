package builder;

//modelʵ�־��峵�ķ��� û��ע�ذ�װ˳�򣬰�װ˳���й�������
public class BenzModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("Benz start");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("Benz stop");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("Benz alarm");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("Benz engine");
	}

}
