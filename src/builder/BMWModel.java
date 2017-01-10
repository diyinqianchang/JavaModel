package builder;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("BWM start");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("BWM stop");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("BWM alarm");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("BWM engine");
	}

}
