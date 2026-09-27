//Kadanes Algorithm for max subarray sum

package tcs01;

import java.util.Scanner;

public class p4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of "+(i+1));
			ar[i]=scan.nextInt();
		}
		
		kadanesMaxsubarraySum(ar);
	}
	
	public static void kadanesMaxsubarraySum(int[] ar) {
		int res=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			
			int currsum=0;
			for(int j=i;j<ar.length;j++) {
				currsum=currsum+ar[j];
				
				
				res=Math.max(res, currsum);
			}
		}
		
		System.out.println(res);
	}

}
