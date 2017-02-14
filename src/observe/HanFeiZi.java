package observe;

public class HanFeiZi implements IHanFeiZi {
	
	private ILiSi liSi = new LiSi();

	@Override
	public void haveBreakfast() {
		// TODO Auto-generated method stub
		System.out.println("韩非子:开始吃饭了");
		this.liSi.update("韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		System.out.println("韩非子:开始娱乐");
		this.liSi.update("韩非子在娱乐");
	}

}
