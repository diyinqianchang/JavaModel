package template;

public abstract class HummerModel {
   
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	//钩子方法  来自子类的返回值。子类可以修改这个值从而影响 父类的行为结构。
	protected  boolean isAlert() {
		return true;
	}
	
	// 抽象出来的公共部分 里面都是子类具体实现的方法。
	final public void run(){
		this.start();
		this.engineBoom();
		if (this.isAlert()) {
			this.alarm();
		}
		
		this.stop();
	}
	
}
