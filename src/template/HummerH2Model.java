package template;

public class HummerH2Model extends HummerModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("����H2����...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("����H2ͣ��...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("����H2����");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("����H2��������������");
	}
	
	@Override
	protected boolean isAlert() {
		// TODO Auto-generated method stub
		return false;
	}

}
