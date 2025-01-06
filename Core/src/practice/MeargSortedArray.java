package practice;

public class MeargSortedArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {1,3,8};
		int b[]=new int[] {4,12,16};
		int c[]=new int[6];
		int l1=0,l2=0,l3=0;
		while(l1<a.length && l3<b.length)
		{
			if(a[l1]<b[l3])
			{
				c[l2]=a[l1];
				l1++;l2++;
			}
			else 
			{
				c[l2]=b[l3];
				l3++;l2++;
			}			
		}
		while (l3 <b.length) {
            c[l2++] = b[l3++];
        }
		while (l1 <b.length) {
            c[l2++] = a[l1++];
        }
		for(int x:c)
		{
			System.out.println(x);
		}
	}
}
