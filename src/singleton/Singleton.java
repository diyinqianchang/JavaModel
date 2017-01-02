package singleton;

/**
 * ����ģʽ��ͨ�ô���
 *
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();
	//���Ʋ����������
	private Singleton() {
		
	}
	//ͨ���÷������ʵ��
	public static Singleton getSingleton() {
		return singleton;
	}
	
	public static void doSomething() {
		
	}
}
