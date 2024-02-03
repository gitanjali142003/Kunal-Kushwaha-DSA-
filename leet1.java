class leet1
{
	public static void main(String args[])
	{
		int arr[]={2,4,5,6};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int add=arr[i]+arr[i+1];
				System.out.println(i+" "+i+1);
			}
		}
	}
}
