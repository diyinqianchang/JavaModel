package observe;

import java.util.ArrayList;

public class HanFeiZiTest implements Observable, IHanFeiZi {

	//�۲���  �����Ĺ۲���
	private ArrayList<Observer> observerList = new ArrayList<>();
	
	@Override
	public void haveBreakfast() {
		// TODO Auto-generated method stub
		System.out.println("�����ӿ�ʼ�Է���");
		this.notifyObservers("�����ӿ�ʼ�Է���");
	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		System.out.println("����������");
		this.notifyObservers("����������");
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		// TODO Auto-generated method stub
		for (Observer observer : observerList) {
			observer.update(context);
		}
		
	}

}
