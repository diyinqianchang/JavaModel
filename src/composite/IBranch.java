package composite;

import java.util.ArrayList;

public interface IBranch extends ICop {
	
	//增加下属
	public void addSubordinate(ICop cop);
	//获取下属
	public ArrayList<ICop> getSubordinate();

}
