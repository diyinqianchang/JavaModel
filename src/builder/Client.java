package builder;

//import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
//		ArrayList<String> sequence = new ArrayList<>();
//		sequence.add("engine boom");
//		sequence.add("start");
//		sequence.add("stop");
//		
//		BenzBuilder benzBuilder = new BenzBuilder();
//		benzBuilder.setSequence(sequence);
//		BenzModel benzModel= (BenzModel)benzBuilder.getCarModel();
//		benzModel.run();
		Director director = new Director();
		director.getABensModel().run();
		director.getBBensModel().run();

	}

}
