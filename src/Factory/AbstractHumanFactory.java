package Factory;

public abstract class AbstractHumanFactory {
	//���÷������Ʋ���������Class����ͬʱҲ������Human��ʵ����
	public abstract <T extends Human> T createHuman(Class<T> c);

}
