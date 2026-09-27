//print duplicates


package tcs01;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length=scan.nextInt();
		int[] ar=new int[length];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter the element:"+(i+1));
			ar[i]=scan.nextInt();
		}
		
		findDuplicate(ar);
	}
	
	public static void findDuplicate(int [] ar) {
		for(int i=0;i<ar.length;i++) {
			boolean seen=false;
			for(int j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					seen=true;
					break;
				}
			}
			
			
			if(seen) {
				System.out.println(ar[i]);
			}
		}
	}
	
}
