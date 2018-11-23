public class MThread extends Thread{
public void run(){
try{
	String s=getName();
	System.out.println(s+"=>Statement-1");
	if(s.equals("BB"))
	{
	System.in.read();
	}
	System.out.println(s+"=>Statement-2");
	System.out.println(s+"=>Statement-3");
	System.out.println(s+"=>Statement-4");
}catch(Exception e){}
}
public static void main(String args[]){
	MThread t1=new MThread(); t1.setName("AA");
	MThread t2=new MThread(); t2.setName("BB");
	MThread t3=new MThread(); t3.setName("CC");
	MThread t4=new MThread(); t4.setName("DD");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	System.out.println("End-of-Main");
}
}
/*
	java.lang.Thread
	------------------
	1) extends Thread class.
	2) override the run method.
	3) create the threads.
	4) starts the threads.

*/