package decorator;

public class Father {

	public static void main(String[] args) {
		
		SchoolReport schoolReport;
		schoolReport = new ForthGradeSchoolReport();                       //schoolReport--->Forth
		schoolReport = new HighScoreDecorater(schoolReport);          //schoolReport--->High
		schoolReport = new SortDecorator(schoolReport);                   //schoolReport--->Sort
		
		schoolReport.report();                                                              //schoolReport--->Sort  ��ִ�е��� Sort��report
		schoolReport.sign("����");
		System.out.println(schoolReport.getClass());
	}
}
