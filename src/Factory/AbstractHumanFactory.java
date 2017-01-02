package Factory;

public abstract class AbstractHumanFactory {
	//采用泛型限制参数必须是Class类型同时也必须是Human的实现类
	public abstract <T extends Human> T createHuman(Class<T> c);

}
