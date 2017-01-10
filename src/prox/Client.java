package prox;

public class Client {

	public static void main(String[] args) {
		
//		IGamePlayer player = new GamePlayer("小张");
//		IGamePlayer proxy = new GamePlayerProxy(player);
//		proxy.login("zhangsan", "123456789");
//		proxy.killBoss();
//		proxy.upgrade();
		IGamePlayer proxy = new GamePlayerProxy("张三");  //代理角色
		proxy.login("zhangsan", "password");  //代理用真实账号登陆
		proxy.killBoss();                                 //代理打怪
		proxy.upgrade();

	}

}
