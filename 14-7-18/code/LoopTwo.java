public class LoopTwo
{

public static void add(int ar[])
{
	int sum=0;

	for(int tmp:ar)
	{
		sum=sum+tmp;
	}


	System.out.println(sum);

}



public static void main(String args[])
{

	int x[]={10,20,30,40,50};
	int y[]={11,12,13,14,15,16,17,18,19,20};
	int z[]={20,40,60};

	add(x);
	add(y);
	add(z);	



}
}
/*
*/