public class Student
{
	private int rollNo;
	private String name;
	private int marks;
	private final int PASSING_MARKS=33;
	
	public void reportCard()
	{
		private int x=10;

		System.out.println("____________________________________");
		System.out.println("Roll No.  : "+rollNo);
		System.out.println("Stud Name : "+name);
		System.out.println("Marks    .: "+marks);
		if(marks>=90)
		System.out.println("A+");
		else if(marks>=80)
		System.out.println("A");
		else
		System.out.println("B");
		System.out.println("____________________________________");
	}



	public void setData(int a, String b, int c)
	{
		rollNo=a;
		name=b;
		marks=c;
	}


}