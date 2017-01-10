package prox;



public class GamePlayer implements IGamePlayer {
	
	private String name = "";
	
	public GamePlayer(String _name) {
		this.name = _name;
	}
	
	 public GamePlayer(IGamePlayer _gGamePlayer,String _name) throws Exception {
		if (_gGamePlayer == null) {
			throw new Exception("���ܴ�����ʵ��ɫ");
		}else{
			this.name = _name;
		}
	}

	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("��½��Ϊ: "+user+"�û�:"+this.name+"��½�ɹ�!");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" ���");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"����һ��");
	}

}
