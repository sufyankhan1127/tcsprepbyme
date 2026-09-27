//Rotate an array by k times


package tcs01;

import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of element : "+(i+1));
			ar[i]=scan.nextInt();
		}
		
		System.out.println("Enter the k value (rotating value): ");
		int k=scan.nextInt();
		
		int [] result=rotateArray(ar, k);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
	
	public static int [] rotateArray(int[] ar,int k) {
		
		int [] ans=new int[ar.length];
		int st=0;
		for(int i=k;i<ar.length;i++) {
			ans[st]=ar[i];
			st++;
		}
		
		for(int i=0;i<k;i++) {
			ans[st]=ar[i];
			st++;
		}
		
		return ans;

	}

}
