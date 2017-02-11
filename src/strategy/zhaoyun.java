package strategy;

public class zhaoyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context context;
		System.out.println("-------¸Õµ½Îâ¹ú--------");
		context = new Context(new BackDoor());
		context.operate();
		System.out.println("\n\n\n");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println("-=-=-=-=--=");
		context = new Context(new BlockEnemy());
		context.operate();
	}

}
