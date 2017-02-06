package chain;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(random.nextInt(4), "��Ҫȥ���"));
			
		}
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		father.setNext(husband);
		husband.setNext(son);
		for (IWomen women : arrayList) {
			father.handleMessage(women);
		}
		

	}

}
