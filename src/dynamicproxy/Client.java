package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("����");
		InvocationHandler handler = (InvocationHandler) new GamePlayIH(player);
		
		ClassLoader classLoader = player.getClass().getClassLoader();
		
		IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(classLoader, new Class[] {IGamePlayer.class}, handler);
		
		proxy.login("zhangsan", "password");
		
		proxy.killBoss();
		
		proxy.upgrade();
		
	}

}
