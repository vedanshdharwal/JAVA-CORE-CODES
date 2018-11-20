public class Stud
{
	int rno;
	String name;

	public void result(int per)
	{
		if(per>=33)
		{
		System.out.println("Stud Passed");
		}
		else
		{
		System.out.println("Stud Failed");
		}
	}

	public void setPData(int rno, String name)
	{
	this.rno=rno;
	this.name=name;
	}
	public void showPData()
	{
	System.out.println(rno+","+name);
	}
}