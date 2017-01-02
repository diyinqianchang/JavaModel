package template;

public abstract class HummerModel {
   
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	//¹³×Ó·½·¨
	protected  boolean isAlert() {
		return true;
	}
	
	final public void run(){
		this.start();
		this.engineBoom();
		if (this.isAlert()) {
			this.alarm();
		}
		
		this.stop();
	}
	
}
