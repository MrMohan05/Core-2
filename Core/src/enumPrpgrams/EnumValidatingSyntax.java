package enumPrpgrams;

enum color
{
	red("dark red"),green("Light green"),blue("");
	String shade;
	color(String s)
	{
		shade=s;
		System.out.println("Constructor ");
	}
//	String getShade()
//	{
//		return shade;
//	}
	public String toString()
	{
		return "const "+name();
	}
}

public class EnumValidatingSyntax
{
	public static void main(String[] args)
	{
		EnumValidatingSyntax obj=new EnumValidatingSyntax();
		color clr[]=color.values();
		for(color c:clr)
		{
		System.err.println(c +" "+ c.ordinal() + " " /*+c.getShade()*/+" "+c.name());
		}
		//System.out.println(obj.name());
		color a=color.red;
		color b=color.green;
		color c=color.blue;
	}
}
