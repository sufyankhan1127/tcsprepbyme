package tcs01;

import java.util.Scanner;

public class p8 {
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
		
		medianTwosorted(arr1, arr2);
	}
	
	
	public static void medianTwosorted(int [] arr1 ,int [] arr2) {
		int nums[]=new int[arr1.length+arr2.length];
		int first=arr1.length-1;
		int second=arr2.length-1;
		int k=arr1.length+arr2.length-1;
		
		while(first>=0 && second >=0) {
			if(arr1[first]>=arr2[second]) {
				nums[k]=arr1[first];
				first--;
			}
			else {
				nums[k]=arr2[second];
				second--;
			}
			
			k--;
		}
		
		while(first>=0) {
			nums[k]=arr1[first];
			first--;
			k--;
		}
		
		while(second>=0) {
			nums[k]=arr2[second];
			second--;
			k--;
		}
		System.out.println("The sorted merged array is:");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		if(nums.length%2!=0) {
			int median=nums[nums.length/2];
			System.out.println("Median is :"+median);
		}
		else {
			float median=(nums[nums.length/2-1]+nums[nums.length/2])/2.0f;
			System.out.println("Median is : "+median);
		}
		
	}

}
