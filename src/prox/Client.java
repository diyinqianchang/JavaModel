package prox;

public class Client {

	public static void main(String[] args) {
		
//		IGamePlayer player = new GamePlayer("С��");
//		IGamePlayer proxy = new GamePlayerProxy(player);
//		proxy.login("zhangsan", "123456789");
//		proxy.killBoss();
//		proxy.upgrade();
		IGamePlayer proxy = new GamePlayerProxy("����");  //�����ɫ
		proxy.login("zhangsan", "password");  //��������ʵ�˺ŵ�½
		proxy.killBoss();                                 //������
		proxy.upgrade();

	}

}
