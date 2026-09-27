//Two sum problem without using HashMap,Arrays.sort



package tcs01;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n=scan.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element"+(i+1));
			ar[i]=scan.nextInt();
		}
		
		System.out.println("Enter the target element");
		int target=scan.nextInt();
		
		twoSum(ar, target);
	}
	
	
	public static void twoSum(int [] ar,int target) {
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		int left=0;
		int right=ar.length-1;
		
		
		while(left<right) {
			int sum=ar[left]+ar[right];
			if(target==sum) {
				System.out.println(ar[left]+" "+ar[right]);
				right--;
				left++;
			}
			
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
	}

}
