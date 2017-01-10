package builder;

import java.util.ArrayList;

public abstract class CarModel {
	
	private ArrayList<String> sequsence = new ArrayList<>();
	
	protected abstract void start(); 
	protected abstract void stop(); 
	protected abstract void alarm(); 
	protected abstract void engineBoom(); 
	
	public void run(){
		for (int i = 0; i < this.sequsence.size(); i++) {
			String actionName = this.sequsence.get(i);
			if (actionName.equals("start")) {
				this.start();
			}else if (actionName.equalsIgnoreCase("stop")) {
				this.stop();
			}else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm();
			}else if (actionName.equalsIgnoreCase("engine boom")) {
				this.engineBoom();
			}
		}
	}
	
	public void setSequence(ArrayList<String> sequsence){
		this.sequsence = sequsence;
	}
}
