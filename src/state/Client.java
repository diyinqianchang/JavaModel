package state;

public class Client {
	
	public static void main(String[] args) {
		
//		ILift lift = new Lift();
//		lift.setState(ILift.STOPPING_STATE);
//		lift.open();
//		lift.close();
//		lift.run();
//		lift.stop();
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
