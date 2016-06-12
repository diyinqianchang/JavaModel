package compositepattern;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
//		Root ceo = new Root("王大麻子", "总经理", 100000);
//		Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
//		Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
//		Branch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
//		
//		Branch firstDevGroup = new Branch("杨三", "开发一组组长", 5000);
//		Branch secondDevGroup = new Branch("无打榜追", "开发二组组长", 6000);
//		
//		Leaf aLeaf = new Leaf("a", "开发人员", 2000);
//		Leaf bLeaf = new Leaf("b", "开发人员", 2000);
//		Leaf cLeaf = new Leaf("c", "开发人员", 2000);
//		Leaf dLeaf = new Leaf("d", "开发人员", 2000);
//		Leaf eLeaf = new Leaf("e", "开发人员", 2000);
//		Leaf fLeaf = new Leaf("f", "开发人员", 2000);
//		Leaf gLeaf = new Leaf("g", "开发人员", 2000);
//		
//		Leaf hLeaf = new Leaf("h", "销售人员", 2000);
//		Leaf iLeaf = new Leaf("i", "销售人员", 2000);
//		Leaf jLeaf = new Leaf("j", "财务人员", 5000);
//		Leaf kLeaf = new Leaf("g", "ceo秘书", 2000);
//		Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
//		
//		ceo.add(developDep);
//		ceo.add(salesDep);
//		ceo.add(financeDep);
//		
//		ceo.add(kLeaf);
//		
//		developDep.add(zhengLaoLiu);
//		developDep.add(firstDevGroup);
//		developDep.add(secondDevGroup);
//		
//		firstDevGroup.add(aLeaf);
//		firstDevGroup.add(bLeaf);
//		firstDevGroup.add(cLeaf);
//		
//		secondDevGroup.add(eLeaf);
//		secondDevGroup.add(fLeaf);
//		secondDevGroup.add(dLeaf);
//		secondDevGroup.add(gLeaf);
//		
//		salesDep.add(hLeaf);
//		salesDep.add(iLeaf);
//		
//		financeDep.add(jLeaf);
//		
//		System.out.println(ceo.getInfo());
//		getAllSuboridnateInfo(ceo.getSubordinateInfo());
		
		Branch ceo = compositeCropTree();
		System.out.println(ceo.getInfo());
		System.out.println(getTreeInfo(ceo));
	}
	
	public static Branch compositeCropTree() {
		Branch root = new Branch("王大麻子", "总经理", 100000); 
		Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
		Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
		Branch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
		
		Branch firstDevGroup = new Branch("杨三", "开发一组组长", 5000);
		Branch secondDevGroup = new Branch("无打榜追", "开发二组组长", 6000);
		
		Leaf aLeaf = new Leaf("a", "开发人员", 2000);
		Leaf bLeaf = new Leaf("b", "开发人员", 2000);
		Leaf cLeaf = new Leaf("c", "开发人员", 2000);
		Leaf dLeaf = new Leaf("d", "开发人员", 2000);
		Leaf eLeaf = new Leaf("e", "开发人员", 2000);
		Leaf fLeaf = new Leaf("f", "开发人员", 2000);
		Leaf gLeaf = new Leaf("g", "开发人员", 2000);
		
		Leaf hLeaf = new Leaf("h", "销售人员", 2000);
		Leaf iLeaf = new Leaf("i", "销售人员", 2000);
		Leaf jLeaf = new Leaf("j", "财务人员", 5000);
		Leaf kLeaf = new Leaf("g", "ceo秘书", 2000);
		Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
		
		root.add(developDep);
		root.add(salesDep);
		root.add(financeDep);
		
		root.add(kLeaf);
		
		developDep.add(zhengLaoLiu);
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		
		firstDevGroup.add(aLeaf);
		firstDevGroup.add(bLeaf);
		firstDevGroup.add(cLeaf);
		
		secondDevGroup.add(eLeaf);
		secondDevGroup.add(fLeaf);
		secondDevGroup.add(dLeaf);
		secondDevGroup.add(gLeaf);
		
		salesDep.add(hLeaf);
		salesDep.add(iLeaf);
		
		financeDep.add(jLeaf);
	
		return root;
	}
	
	public static String getTreeInfo(Branch root) {
		ArrayList<Icorp> subordinateList =  root.getSubordinateInfo();
		String info = "";
		//subordinateList中实现Icorp接口的类
		for (Icorp icorp : subordinateList) {
			if (icorp instanceof Leaf) {
				info = info + icorp.getInfo() + "\n";
			}else{
				info = info + icorp.getInfo() + "\n" + getTreeInfo((Branch)icorp);
			}
		}
		return info;
	}
	
	
//	//类方法
//	private static void getAllSuboridnateInfo(ArrayList<Object> subordinateList){
//		int length = subordinateList.size();
//		for (int i = 0; i < length; i++) {
//			Object sObject = subordinateList.get(i);
//			if (sObject instanceof Leaf) {
//				Leaf employee = (Leaf)sObject;
//				System.out.println(employee.getInfo());
//			}else{
//				Branch branch = (Branch)sObject;
//				System.out.println(branch.getInfo());
//				getAllSuboridnateInfo(branch.getSubordinateInfo());
//			}
//		}
//	}
}
