package bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house = new House();
		System.out.println("---------------���ز���˾�������е�-----------------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println("-------------------------------");
		IPod iPod = new IPod();
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(iPod);
		shanZhaiCorp.makeMoney();
	}

}

//��Ʒ�в�Ʒ�ĳ����࣬��˾�й�˾�ĳ����ࡣ ͬʱ���幫˾ӵ�о����Ʒ�� ��Ʒ�ฺ�����������ۣ���˾�ฺ��׬Ǯ
// ׬Ǯ�ͱ������ ��Ʒ�����������۵ķ�������׬Ǯ
