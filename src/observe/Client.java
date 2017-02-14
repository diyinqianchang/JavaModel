package observe;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HanFeiZi hanFeiZi = new HanFeiZi();
//		hanFeiZi.haveBreakfast();
//		hanFeiZi.haveFun();
		Observer lisi = new LiSiTest();
		HanFeiZiTest hanFeiZiTest  = new HanFeiZiTest();
		Wangsi wangsi = new Wangsi();
		hanFeiZiTest.addObserver(wangsi);
		hanFeiZiTest.addObserver(lisi);
		hanFeiZiTest.haveBreakfast();
		hanFeiZiTest.haveFun();

	}

}
