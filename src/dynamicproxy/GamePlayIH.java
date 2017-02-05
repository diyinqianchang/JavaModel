package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
	
	//������Ķ���
	Object obj = null;
	//ͨ�����캯������һ������
	public GamePlayIH(Object _obj){
		this.obj= _obj;
	}
	
	//������
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		
		
		//��ִ�д���ķ���
		Object result = method.invoke(this.obj, args);
		
		if (method.getName().equalsIgnoreCase("login")) {
			System.out.println("���������ҵ��˺ŵ�½��");
			
		}
		
		return result;
	}

}
