package iterator;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {

	
	private ArrayList<IProject> projectList = new ArrayList<>();
	private int currentItem = 0;
	public ProjectIterator(ArrayList<IProject> projectList) {
		this.projectList = projectList;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		boolean b = true;
		if (this.currentItem>=projectList.size()||this.projectList.get(this.currentItem)==null) {
			b = false;
		}
		return b;
	}

	@Override
	public IProject next() {
		// TODO Auto-generated method stub
		return (IProject)this.projectList.get(this.currentItem++);
	}
	
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
