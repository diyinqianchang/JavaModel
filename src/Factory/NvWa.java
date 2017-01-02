package Factory;

public class NvWa {

	public static void main(String[] args) {
		AbstractHumanFactory yinYangLu = new HumanFactory();
		System.out.println("---����ĵ�һ����ɫ����");
		Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("\n---����ĵڶ�����ɫ����");
		Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("\n---����ĵ�������ɫ����");
		Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
