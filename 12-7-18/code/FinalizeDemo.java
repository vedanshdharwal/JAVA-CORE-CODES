public class FinalizeDemo
{
	int data;

public FinalizeDemo(int x)
{
	data=x;
	System.out.println("Constructor Called : "+data);
}
public void finalize()
{
	System.out.println("Finalized Called ===###====@@@@@========>"+data);
}

public static void main(String args[])
{
	int i=1;

	while(true)
	{
	if(i%5000==0)
	{
	System.gc();
	}
	new FinalizeDemo(i++);
	}


	
}
}