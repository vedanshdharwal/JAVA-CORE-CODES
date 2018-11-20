public class EngStud	extends Stud
{
	private String branch;
	private int sem;

	public EngStud(){}
	public EngStud(int rno, String name, String branch, int sem)
	{
		super(rno,name);
		this.branch=branch;
		this.sem=sem;
	}

	public void show()
	{
		super.show();
		System.out.println(branch+","+sem);
	}

	public static void main(String args[])
	{
	EngStud s=new EngStud(111,"AAA","CS",3);
	s.show();
	}
}