package decorator;

public class ForthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		System.out.println(System.currentTimeMillis());
		System.out.println("�𾴵�XXX�ҳ�:");
		System.out.println("...........");
		System.out.println("���� 62 ��ѧ 65 ���� 98 ��Ȼ 63");
		System.out.println("...........");
		System.out.println("                      �ҳ�ǩ��:           ");
		
	}

	@Override
	public void sign(String name) {
		// TODO Auto-generated method stub
		System.out.println("�ҳ�ǩ��:"+name);
	}

}
