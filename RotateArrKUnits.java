package Preparation;

public class RotateArrKUnits {
	
	public static int[] reverse(int[] arr,int start,int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
	
	public static void rotate(int[] arr,int k)
	{
		int n=arr.length;
		if(n==0)
			return;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		int k=3;
		rotate(arr,k);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
