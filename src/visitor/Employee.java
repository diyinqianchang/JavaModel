package visitor;

public abstract class Employee {
	
	public final static int MALE = 0;          //代表男性
	public final static int FEMALE = 1;    //代表女性
	
	private String name;
	private int salary;
	private int sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public final void report(){
		String info = "姓名"+this.name+"\t";
		info = info+"性别"+(this.sex==FEMALE ? "女":"男")+"\t";
		 info = info+this.getOtherInfo();
		 System.out.println(info);
	}
	
	protected abstract String getOtherInfo();
	
	//删除report方法
	//增加了accept方法 接受访问者的访问
	//删除getOtherInfo方法
	
	public abstract void accept(IVisitor visitor);

}
