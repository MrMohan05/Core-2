package interfacePrograms;

public class MobilePhone implements MobilePhoneInterface
{
	SIMCardInterface si;

	public MobilePhone(SIMCardInterface si) 
	{
	this.si = si;
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
		Jio j=new Jio(true);
		MobilePhone m=new MobilePhone(j);
		m.inserting();
		m.removing();
		m.makingCalls();
		m.sendingTextMessage();
		j.phonenumber();
		j.networkprovider();
		j.status();
	}
}
