package command;

public class AddRequirementCommand extends Commad {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.rgGroup.find();
		super.rgGroup.add();
		super.rgGroup.plan();
	}

}
