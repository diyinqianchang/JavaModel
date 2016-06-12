package compositepattern;

import java.util.ArrayList;

public interface IBranch extends Icorp {
//	public String getInfo();  //继承Icorp
	public void add(Icorp icorp);
//	public void add(ILeaf leaf);
//	public ArrayList<Object> getSubordinateInfo();
	
	public ArrayList<Icorp> getSubordinateInfo();
}
