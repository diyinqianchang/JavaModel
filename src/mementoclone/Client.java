package mementoclone;

public class Client {
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("初始状态...");
		System.out.println("初始状态是"+originator.getState());
		originator.createMemento();
		originator.setState("修改后的状态......");
		System.out.println(originator.getState());
		originator.restoreMemeto();
		System.out.println(originator.getState());
	}

}
