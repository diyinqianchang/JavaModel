package builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

// �ۺϹ�ϵ�ǹ�����ϵ��һ���֣��Ƿǳ�ǿ�Ĺ�����ϵ���ۺϹ�ϵ���ֵĸ�����������벿�ֵĹ�ϵ��
//	���������ͳ��š�������֮��Ĺ�ϵ
	//�������� ������ ��������װ˳��
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
