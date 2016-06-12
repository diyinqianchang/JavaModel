package compositepattern;

import java.util.ArrayList;

public class NClient {

	public static void main(String[] args) {
		
		NBranch ceo = compositeCropTree();
		System.out.println(getTreeInfo(ceo));

	}
	
	public static NBranch compositeCropTree() {
		NBranch root = new NBranch("王大麻子", "总经理", 100000); 
		NBranch developDep = new NBranch("刘大瘸子", "研发部门经理", 10000);
		NBranch salesDep = new NBranch("马二拐子", "销售部门经理", 20000);
		NBranch financeDep = new NBranch("赵三驼子", "财务部门经理", 30000);
		
		NBranch firstDevGroup = new NBranch("杨三", "开发一组组长", 5000);
		NBranch secondDevGroup = new NBranch("无打榜追", "开发二组组长", 6000);
		
		NLeaf aNLeaf = new NLeaf("a", "开发人员", 2000);
		NLeaf bNLeaf = new NLeaf("b", "开发人员", 2000);
		NLeaf cNLeaf = new NLeaf("c", "开发人员", 2000);
		NLeaf dNLeaf = new NLeaf("d", "开发人员", 2000);
		NLeaf eNLeaf = new NLeaf("e", "开发人员", 2000);
		NLeaf fNLeaf = new NLeaf("f", "开发人员", 2000);
		NLeaf gNLeaf = new NLeaf("g", "开发人员", 2000);
		
		NLeaf hNLeaf = new NLeaf("h", "销售人员", 2000);
		NLeaf iNLeaf = new NLeaf("i", "销售人员", 2000);
		NLeaf jNLeaf = new NLeaf("j", "财务人员", 5000);
		NLeaf kNLeaf = new NLeaf("g", "ceo秘书", 2000);
		NLeaf zhengLaoLiu = new NLeaf("郑老六", "研发部副总", 20000);
		
		root.addSubordinate(developDep);
		root.addSubordinate(salesDep);
		root.addSubordinate(financeDep);
		
		root.addSubordinate(kNLeaf);
		
		developDep.addSubordinate(zhengLaoLiu);
		developDep.addSubordinate(firstDevGroup);
		developDep.addSubordinate(secondDevGroup);
		
		firstDevGroup.addSubordinate(aNLeaf);
		firstDevGroup.addSubordinate(bNLeaf);
		firstDevGroup.addSubordinate(cNLeaf);
		
		secondDevGroup.addSubordinate(eNLeaf);
		secondDevGroup.addSubordinate(fNLeaf);
		secondDevGroup.addSubordinate(dNLeaf);
		secondDevGroup.addSubordinate(gNLeaf);
		
		salesDep.addSubordinate(hNLeaf);
		salesDep.addSubordinate(iNLeaf);
		
		financeDep.addSubordinate(jNLeaf);
	
		return root;
	}
	
	public static String getTreeInfo(NBranch root) {
		ArrayList<Crop> subordinateList =  root.getSubordinate();
		String info = "";
		//subordinateList中实现Icorp接口的类
		for (Crop corp : subordinateList) {
			if (corp instanceof NLeaf) {
				info = info + corp.getInfo() + "\n";
			}else{
				info = info + corp.getInfo() + "\n" + getTreeInfo((NBranch)corp);
			}
		}
		return info;
	}

}
