package bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house = new House();
		System.out.println("---------------房地产公司这样运行的-----------------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println("-------------------------------");
		IPod iPod = new IPod();
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(iPod);
		shanZhaiCorp.makeMoney();
	}

}

//产品有产品的抽象类，公司有公司的抽象类。 同时具体公司拥有具体产品。 产品类负责生产和销售，公司类负责赚钱
// 赚钱就必须调用 产品的生产和销售的方法才能赚钱
