package state;

public class Lift implements ILift {
	
	
	private int state;
	
	public void setState(int state) {
		this.state = state;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("电梯门开启...");
		switch (this.state) {
		case OPENING_STATE:
			
			break;
		case CLOSING_STATE:
				this.openWithoutLogic();
				this.setState(OPENING_STATE);
			break;
		case RUNNING_STATE:
			
			break;
		case STOPPING_STATE:
				this.openWithoutLogic();
				this.setState(OPENING_STATE);
			break;

		default:
			break;
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("电梯门关闭...");
		switch (this.state) {
		case OPENING_STATE:
				this.closeWithoutLogic();
				this.setState(CLOSING_STATE);
			break;
		case CLOSING_STATE:
			break;
		case RUNNING_STATE:
			break;
		case STOPPING_STATE:
			break;
		default:
			break;
		}
	}

	@Override
	public void run() {
		switch (this.state) {
		case OPENING_STATE:
			
			break;
		case CLOSING_STATE:
				this.runWithoutLogic();
				this.setState(RUNNING_STATE);
			break;
		case RUNNING_STATE:
			
			break;
		case STOPPING_STATE:
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);
			break;

		default:
			break;
		}
	}

	@Override
	public void stop() {
		System.out.println("电梯停止...");
		switch (this.state) {
		case OPENING_STATE:
			
			break;
		case CLOSING_STATE:
				this.stopWithoutLogic();
				this.setState(STOPPING_STATE);
			break;
		case RUNNING_STATE:
			
			break;
		case STOPPING_STATE:
			this.stopWithoutLogic();
			this.setState(STOPPING_STATE);
			break;

		default:
			break;
		}
	}
	
	private void closeWithoutLogic(){
		System.out.println("电梯门关闭....");
	}
	
	private void openWithoutLogic(){
		System.out.println("电梯门开启");
	}
	
	private void runWithoutLogic(){
		System.out.println("电梯上下运行起来");
	}
	
	private void stopWithoutLogic(){
		System.out.println("电梯停止了...");
	}
	

}
