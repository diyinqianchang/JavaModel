package builder;

//model实现具体车的方法 没有注重安装顺序，安装顺序有工厂决定
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
