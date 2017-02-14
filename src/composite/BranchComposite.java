package composite;

import java.util.ArrayList;

public class BranchComposite extends CropCompsite {

	ArrayList<CropCompsite> subordinateList = new ArrayList<>();
	public BranchComposite(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}
	
	public void addSubordinate(CropCompsite compsite) {
		this.subordinateList.add(compsite);
	}
	
	public ArrayList<CropCompsite> getSubordinate() {
		return this.subordinateList;
	}

}
