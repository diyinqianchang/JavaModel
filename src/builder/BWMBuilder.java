package builder;

import java.util.ArrayList;

public class BWMBuilder extends CarBuilder {

	private BMWModel bmw = new BMWModel();
	@Override
	public void setSequence(ArrayList<String> sequsence) {
		this.setSequence(sequsence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;
	}

}
