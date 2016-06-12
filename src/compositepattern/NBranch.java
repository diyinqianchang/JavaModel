package compositepattern;

import java.util.ArrayList;

public class NBranch extends Crop {

	ArrayList<Crop> subordinateList = new ArrayList<Crop>();
	public NBranch(String _name, String _position, int _salarry) {
		super(_name, _position, _salarry);
		// TODO Auto-generated constructor stub
	}
	public void addSubordinate(Crop crop){
		this.subordinateList.add(crop);
	}
	public ArrayList<Crop> getSubordinate() {
		return this.subordinateList;
	}

}
