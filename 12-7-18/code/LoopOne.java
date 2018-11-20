public class LoopOne
{
public static void main(String args[])
{

	int x[]={10,20,30};

	for(int tmp:x)
	{
		System.out.println(tmp);
	}	
}
}
/*
	1st	tmp=x[0]		10
	2nd	tmp=x[1]		20
	3rd	tmp=x[2]		30
	4th	tmp=x[3]		40
	5th	tmp=x[4]		50
	--------terminate-----------------
*/