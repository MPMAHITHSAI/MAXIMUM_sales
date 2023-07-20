package Sales_perday;

import java.util.Scanner;

public class sales{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int values=profit(arr);
		System.out.println(values);

	}
static int profit(int arr[]) {
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return max-min;
}
}