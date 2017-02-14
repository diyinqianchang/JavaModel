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
		Branch root = new Branch("王大麻子", "总经理", 10000);
		//部门经理
		Branch developDep = new Branch("马二拐子", "研发部门经理", 20000);
		Branch salesDep = new Branch("赵三驼子", "销售部门经理", 20000);
		Branch financeDep = new Branch("刘大瘸子", "财务部门经理", 30000);
		//再把三个小组长产生出来
		Branch firstDevGroup = new Branch("杨三也斜", "开发一组组长", 5000);
		Branch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
		
		Leaf a = new Leaf("a", "开发人员", 2000);
		Leaf b = new Leaf("b", "开发人员", 2000);
		Leaf c = new Leaf("c", "开发人员", 2000);
		Leaf d = new Leaf("d", "开发人员", 2000);
		Leaf e = new Leaf("e", "开发人员", 2000);
		Leaf f = new Leaf("f", "开发人员", 2000);
		Leaf g = new Leaf("g", "开发人员", 2000);
		
		Leaf h = new Leaf("h", "销售人员", 5000);
		Leaf i  = new Leaf("i", "销售人员", 4000);
		Leaf j  = new Leaf("j", "财务人员", 5000);
		
		Leaf k = new Leaf("k", "CEO秘书", 8000);
		
		Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副经理", 20000);
		
		root.addSubordinate(k);
		
		root.addSubordinate(developDep);
		root.addSubordinate(salesDep);
		root.addSubordinate(financeDep);
		
		//研发部经理
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
