package memento;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy boy = new Boy();
		
		Caretaker caretaker = new Caretaker();
		
		boy.setState("����ܰ�");
		System.out.println("=======�к����ڵ�״̬========");
		System.out.println(boy.getState());
		
//		Memento memento = boy.createMemento();
		caretaker.setMemento(boy.createMemento());
		boy.changeState();
		System.out.println("=========�к�׷Ů�����״̬===========");
		System.out.println(boy.getState());
		
//		boy.restoreMemeto(memento);
		boy.restoreMemeto(caretaker.getMemento());
		System.out.println("=============�к��ָ����״̬================");
		System.out.println(boy.getState());
		
	}

}
