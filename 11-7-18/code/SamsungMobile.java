public class SamsungMobile
{
	SIM sim;

	public void insertSIM(SIM sim)
	{
		this.sim=sim;
	}	
	public void callButton()
	{
		sim.call();
	}
	public void messageButton()
	{
		sim.sms();
	}
	public static void main(String args[])
	{
		SamsungMobile ob=new SamsungMobile();
		ob.insertSIM(new AirtelSIM());		
		ob.callButton();
		ob.messageButton();
	}
}