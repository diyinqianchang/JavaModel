package command;



public class Client {

	public static void main(String[] args) {
		
		
		Invoker xiaosan = new Invoker();
		System.out.println("------------客户需求");
		
		Commad commad = new AddRequirementCommand();
		xiaosan.setCommand(commad);
		xiaosan.action();
		System.out.println("------------客户需求");
		Commad commad2 = new DeletaPageCommand();
		xiaosan.setCommand(commad2);
		xiaosan.action();
	}

}
