public class ThreadEx
{
public static void main(String args[])
{

Thread t1=new Thread(new Runnable()
{
	public void run(){
		for(int i=1;i<=10;i++){	
		System.out.println(i*5);
		}
	}
});


Thread t2=new Thread(new Runnable()
{
	public void run(){
		for(int i=1;i<=10;i++){
		System.out.println(i*6);
		}
	}
});



t1.start();
t2.start();

}
}