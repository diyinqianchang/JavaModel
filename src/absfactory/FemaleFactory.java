package absfactory;

import absfactory.HumanFactory;

public class FemaleFactory implements HumanFactory {
	
	public Human createYellowHuman(){
		return new FemaleYellowHuman();
	}
}
