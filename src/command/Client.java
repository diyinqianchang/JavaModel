package command;



public class Client {

	public static void main(String[] args) {
		
		
		Invoker xiaosan = new Invoker();
		System.out.println("------------�ͻ�����");
		
		Commad commad = new AddRequirementCommand();
		xiaosan.setCommand(commad);
		xiaosan.action();
		System.out.println("------------�ͻ�����");
		Commad commad2 = new DeletaPageCommand();
		xiaosan.setCommand(commad2);
		xiaosan.action();
	}

}
