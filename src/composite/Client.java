package composite;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Branch ceo  = compositeCropTree();
//		System.out.println(ceo.getInfo());
//		System.out.println(getTreeInfo(ceo));
		
		
		

	}
	
	public static Branch  compositeCropTree() {
		Branch root = new Branch("��������", "�ܾ���", 10000);
		//���ž���
		Branch developDep = new Branch("�������", "�з����ž���", 20000);
		Branch salesDep = new Branch("��������", "���۲��ž���", 20000);
		Branch financeDep = new Branch("����ȳ��", "�����ž���", 30000);
		//�ٰ�����С�鳤��������
		Branch firstDevGroup = new Branch("����Ҳб", "����һ���鳤", 5000);
		Branch secondDevGroup = new Branch("�����", "���������鳤", 6000);
		
		Leaf a = new Leaf("a", "������Ա", 2000);
		Leaf b = new Leaf("b", "������Ա", 2000);
		Leaf c = new Leaf("c", "������Ա", 2000);
		Leaf d = new Leaf("d", "������Ա", 2000);
		Leaf e = new Leaf("e", "������Ա", 2000);
		Leaf f = new Leaf("f", "������Ա", 2000);
		Leaf g = new Leaf("g", "������Ա", 2000);
		
		Leaf h = new Leaf("h", "������Ա", 5000);
		Leaf i  = new Leaf("i", "������Ա", 4000);
		Leaf j  = new Leaf("j", "������Ա", 5000);
		
		Leaf k = new Leaf("k", "CEO����", 8000);
		
		Leaf zhengLaoLiu = new Leaf("֣����", "�з���������", 20000);
		
		root.addSubordinate(k);
		
		root.addSubordinate(developDep);
		root.addSubordinate(salesDep);
		root.addSubordinate(financeDep);
		
		//�з�������
		developDep.addSubordinate(zhengLaoLiu);
		developDep.addSubordinate(firstDevGroup);
		developDep.addSubordinate(secondDevGroup);
		
		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);
		secondDevGroup.addSubordinate(d);
		secondDevGroup.addSubordinate(e);
		secondDevGroup.addSubordinate(f);
		secondDevGroup.addSubordinate(g);
		salesDep.addSubordinate(h);
		salesDep.addSubordinate(i);
		financeDep.addSubordinate(j);
		return root;
	}
	
	public static String getTreeInfo(Branch root){
		ArrayList<ICop> subordinateList = root.getSubordinate();
		String info = "";
		for (ICop iCop : subordinateList) {
			if (iCop instanceof Leaf) {
				info = info + iCop.getInfo()+"\n";
			}else{
				info = info+iCop.getInfo()+"\n"+getTreeInfo((Branch)iCop);
			}
		}
		return info;
		
	}

}
