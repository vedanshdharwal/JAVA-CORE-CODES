public class Student
{
	int rno, sem;
	String branch, name;

	public Student(int rno, String name, String branch, int sem)
	{
		this.rno=rno;
		this.name=name;
		this.branch=branch;
		this.sem=sem;
	}
	public String toString()
	{
		String res="["+rno+","+name+","+branch+","+sem+"]";
		return res;
	}
}