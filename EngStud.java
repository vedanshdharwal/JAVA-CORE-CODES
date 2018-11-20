public class EngStud	extends Stud
{
	String branch;
	int sem;

	public void setAData(String branch, int sem)
	{
		this.branch=branch;
		this.sem=sem;
	}
	public void showAData()
	{
		System.out.println(branch+","+sem);
	}
}