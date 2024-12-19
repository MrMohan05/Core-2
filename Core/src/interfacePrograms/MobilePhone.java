package interfacePrograms;

public class MobilePhone implements MobilePhoneInterface
{
	SIMCardInterface si;

	public MobilePhone(SIMCardInterface si) 
	{
	this.si = si;
	si.phonenumber();
	si.networkprovider();
	si.status();
	}

	@Override
	public void inserting() 
	{
		System.out.println("Sim interdetd");
	}

	@Override
	public void removing()
	{
		System.out.println("Sim removed");
	}

	@Override
	public void makingCalls() 
	{
		System.out.println("Making an phone call");
	}

	@Override
	public void sendingTextMessage() 
	{
		System.out.println("Sending text message");
	}
	
	public static void main(String[] args) 
	{	
		MobilePhone m=null;
		
		Jio j=new Jio(true);
		m=new MobilePhone(j);
		m.simOperation(m);
		
		BSNL b=new BSNL(true);
		m=new MobilePhone(b);
		m.simOperation(m);
		
		Airtel a=new Airtel(true);
		m=new MobilePhone(a);
		m.simOperation(m);
		
	}
	void simOperation(MobilePhone m)
	{
		m.inserting();
		m.removing();
		m.makingCalls();
		m.sendingTextMessage();
	}
}
