package builder;

import java.util.ArrayList;

public class Director {
	
	private ArrayList<String> sequence = new ArrayList<>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	
	public BenzModel getABensModel(){
		//多个方法公用一个数组(生产线) 每次要重置
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	public BenzModel getBBensModel(){
		//多个方法公用一个数组(生产线) 每次要重置
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("alarm");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
}
