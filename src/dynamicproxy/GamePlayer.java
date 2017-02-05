package dynamicproxy;

public class GamePlayer implements IGamePlayer {
	
	
	
	private String name = "";
	
	public GamePlayer(String _name) {
		this.name = _name;
	}	

	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("登陆名为: "+user+"用户:"+this.name+"登陆成功!");
		
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" 打怪");
		
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"又升一级");
	}

}
