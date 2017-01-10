package builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

// 聚合关系是关联关系的一部分，是非常强的关联关系。聚合关系表现的更多的是整体与部分的关系。
//	例如汽车和车门、发动机之间的关系
	//工厂建造 车辆。 并决定安装顺序
	private BenzModel benz = new BenzModel();
	@Override
	public void setSequence(ArrayList<String> sequsence) {
			this.benz.setSequence(sequsence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
