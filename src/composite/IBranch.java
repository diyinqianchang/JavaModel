package composite;

import java.util.ArrayList;

public interface IBranch extends ICop {
	
	//��������
	public void addSubordinate(ICop cop);
	//��ȡ����
	public ArrayList<ICop> getSubordinate();

}
