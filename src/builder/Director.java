package builder;

import java.util.ArrayList;

public class Director {
	
	private ArrayList<String> sequence = new ArrayList<>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	
	public BenzModel getABensModel(){
		//�����������һ������(������) ÿ��Ҫ����
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	public BenzModel getBBensModel(){
		//�����������һ������(������) ÿ��Ҫ����
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("alarm");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
}
