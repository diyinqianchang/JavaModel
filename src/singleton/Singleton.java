package singleton;

/**
 * 单利模式的通用代码
 *
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();
	//限制产生多个对象
	private Singleton() {
		
	}
	//通过该方法获得实例
	public static Singleton getSingleton() {
		return singleton;
	}
	
	public static void doSomething() {
		
	}
}
