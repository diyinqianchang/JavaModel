package absfactory;

public class NvWa {

	public static void main(String[] args) {
		//������
		HumanFactory maleHmanFactory = new MaleFactory();
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		Human maleYellowHuman = maleHmanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		
		femaleYellowHuman.getSex();
		maleYellowHuman.getSex();
		
	}

}
