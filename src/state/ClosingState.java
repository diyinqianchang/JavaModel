package state;

public class ClosingState extends LiftState {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.openningState);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("µÁÃ›√≈πÿ±’");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.runningState);
		super.context.getLiftState().open();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.stoppingState);
		super.context.getLiftState().stop();
	}

}
