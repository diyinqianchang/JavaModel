package command;

public class DeletaPageCommand extends Commad {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.pGroup.find();
		super.pGroup.delete();
		super.pGroup.plan();
	}

}
