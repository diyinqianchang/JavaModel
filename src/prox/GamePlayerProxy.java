package prox;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(IGamePlayer _gamePlayer) {
		this.gamePlayer = _gamePlayer;
	}
	public GamePlayerProxy(String name) {
		try {
			System.out.println(this.getClass());
			gamePlayer = new GamePlayer(this,name);  //代理类里面 创建一个真实角色
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gamePlayer.upgrade();
	}

}
