public class MediStud extends Stud
{
	String spec;
	int prof;

	public void result(int per)
	{
		if(per>=50)
		{
		System.out.println("MediStud Passed");
		}
		else
		{
		System.out.println("MediStud Failed");
		}
	}

	public void setMData(String spec, int prof)
	{
		this.spec=spec;
		this.prof=prof;
	}
	public void showMData()
	{
		System.out.println(spec+","+prof);
	}
}