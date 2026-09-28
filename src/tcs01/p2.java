
//Merge two sorted arrays3

package tcs01;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of first array:");
		int len1=scan.nextInt();
		int [] arr1=new int[len1];
		for(int i=0;i<len1;i++) {
			System.out.println("Enter the element "+(i+1));
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("Enter the length of second array:");
		int len2=scan.nextInt();
		int [] arr2=new int[len2];
		for(int i=0;i<len2;i++) {
			System.out.println("Enter the element "+(i+1));
			arr2[i]=scan.nextInt();
		}
		
		mergearrayBasic(arr1, arr2);
	}
	
	public static void mergearrayBasic(int[] arr1,int [] arr2) {
		int m=arr1.length-1;
		int n=arr2.length-1;
		int k=arr1.length+arr2.length-1;
		
		int nums[]=new int[arr1.length+arr2.length];
		
		while(m>=0 && n>=0) {
			
			if(arr1[m]>arr2[n]) {
				nums[k]=arr1[m];
				m--;
			}
			else {
				nums[k]=arr2[n];
				n--;
			}
			
			k--;
		}
		
		while(n>=0) {
			nums[k]=arr2[n];
			n--;
			k--;
		}
		
		while(m>=0) {
			nums[k]=arr1[m];
			m--;
			k--;
		}
		
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
