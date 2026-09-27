//Find maximum and minimum


package tcs01;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length=scan.nextInt();
		int[] ar=new int[length];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter the element:"+(i+1));
			ar[i]=scan.nextInt();
		}
		
		maxAndMin(ar);
	}
	
	public static void maxAndMin(int[] ar) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		
		
		System.out.println("Minimum value in the array is : "+min);
		System.out.println("Maximum value in the array is : "+max);
	}

}
