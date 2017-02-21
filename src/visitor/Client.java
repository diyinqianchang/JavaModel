package visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		
		for (Employee employee : mockEmployee()) {
//			employee.report();
			employee.accept(new Visitor());
		}
		
	}
	
	public static List<Employee> mockEmployee() {
		
		List<Employee> empList = new ArrayList<Employee>();
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setJob("��дJava����,���Ե����졢�๤�Ӱ��˹�");
		zhangSan.setName("����");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Employee.MALE);
		empList.add(zhangSan);
		
		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("ҳ����������������̫��������!");
		liSi.setName("����");
		liSi.setSalary(1900);
		liSi.setSex(Employee.FEMALE);
		empList.add(liSi);
		
		Manager wangWu = new Manager();
		wangWu.setName("����");
		wangWu.setPerformance("�������Ǹ���,�����һ�����ƨѽ");
		wangWu.setSalary(18750);
		wangWu.setSex(Employee.MALE);
		empList.add(wangWu);
		
		return empList;
	}

}
