class palindromeno1to1000
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000;i++){
			int n=i;
			int rev=0;
			while(n!=0)
			{
				int ld=n%10;
				rev=rev*10+ld;
				n=n/10;
			}
			if(i==rev)
			{
		System.out.println(i);
			}
	}
}
