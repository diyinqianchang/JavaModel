package decorator;

public class Father {

	public static void main(String[] args) {
		
		SchoolReport schoolReport;
		schoolReport = new ForthGradeSchoolReport();                       //schoolReport--->Forth
		schoolReport = new HighScoreDecorater(schoolReport);          //schoolReport--->High
		schoolReport = new SortDecorator(schoolReport);                   //schoolReport--->Sort
		
		schoolReport.report();                                                              //schoolReport--->Sort  先执行的是 Sort的report
		schoolReport.sign("老三");
		System.out.println(schoolReport.getClass());
	}
}
