package observe;

import java.util.ArrayList;

public class HanFeiZiTest implements Observable, IHanFeiZi {

	//观察者  批量的观察者
	private ArrayList<Observer> observerList = new ArrayList<>();
	
	@Override
	public void haveBreakfast() {
		// TODO Auto-generated method stub
		System.out.println("韩非子开始吃饭了");
		this.notifyObservers("韩非子开始吃饭了");
	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		System.out.println("韩非子娱乐");
		this.notifyObservers("韩非子娱乐");
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
