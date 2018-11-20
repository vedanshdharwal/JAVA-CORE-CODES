public class LoopLabel
{
public static void main(String args[])
{

x:	for(int i=1; i<=5; i++)
	{

y:		for(int j=1; j<=5; j++)
		{
			if(j==3)
			{

			continue x;

			   //break x;
			}

			System.out.println(j);

		}
	}

}
}
/*
*/