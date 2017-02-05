package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
	
	//被代理的对象
	Object obj = null;
	//通过构造函数传递一个对象
	public GamePlayIH(Object _obj){
		this.obj= _obj;
	}
	
	//代理方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		
		
		//被执行代理的方法
		Object result = method.invoke(this.obj, args);
		
		if (method.getName().equalsIgnoreCase("login")) {
			System.out.println("有人在用我的账号登陆！");
			
		}
		
		return result;
	}

}
