class ReturnArrayFromFunc
{
	public static int[] getArray(int p)
	{
		int ar[]=new int[10],i=0;
		while(i<10)
		{
			ar[i++]=p*i;//check output due to this it should have started with zero as it seems but it doesnt and instead starts from 2*1 because of ++ operator
		}
		return ar;
	}
	public static void main(String args[])
	{
		int p=2;
		int art[]=getArray(p);
		for(int i=0;i<art.length;i++)
		{
			System.out.println("art["+i+"]="+art[i]);
		}
	}
}