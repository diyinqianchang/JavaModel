package mementoclone;

public class Client {
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("��ʼ״̬...");
		System.out.println("��ʼ״̬��"+originator.getState());
		originator.createMemento();
		originator.setState("�޸ĺ��״̬......");
		System.out.println(originator.getState());
		originator.restoreMemeto();
		System.out.println(originator.getState());
	}

}
