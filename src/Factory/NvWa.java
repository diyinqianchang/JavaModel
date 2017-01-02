package Factory;

public class NvWa {

	public static void main(String[] args) {
		AbstractHumanFactory yinYangLu = new HumanFactory();
		System.out.println("---造出的第一批白色人中");
		Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("\n---造出的第二批黑色人中");
		Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("\n---造出的第三批黑色人中");
		Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
