package practice2;

public class MeargSorted2Arrays 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {1,10,115};
		int b[]=new int[] {0,60,120};
		int c[]=new int[6];
		int i=0,j=0,k=0;
		//System.out.println(a.length);
		String arg=""; arg.length();
		while(i<a.length && j<b.length)
		{
			System.out.println("Elements :"+a[i]+"  "+b[j]);
			if(a[i]<b[j])
			{
				System.out.println("in if :"+a[i]+" "+b[j]);
				c[k]=a[i];
				a[i]=0;
				System.err.println("added :"+a[i]);
				i++;
			}
			else
			{
				System.out.println("in else :"+a[i]+" "+b[j]);
				c[k]=b[j];
				b[j]=0;
				System.err.println("added :"+b[j]);
				j++;
			}
			k++;
		}
		System.out.println("i="+i+" j="+j);
		while (j <b.length) 
		{
			System.out.println("b="+b[j]);
            c[k++] = b[j++];
        }
		while (i <b.length) 
		{
			System.out.println(a[j]);
            c[k++] = a[j++];
        }
		for(int x:c)
		{
			System.out.println(x);
		}
	}
}
