public class College
{
public static void main(String args[])
{
	EngStud s1=new EngStud();
	s1.setPData(111,"AAA");
	s1.setAData("CS",3);
	s1.showPData();
	s1.showAData();
	s1.result(40);

	System.out.println("__________________________________");
	MediStud s2=new MediStud();
	s2.setPData(112,"BBB");
	s2.setMData("orthp",2);
	s2.showPData();
	s2.showMData();
	s2.result(45);
}
}