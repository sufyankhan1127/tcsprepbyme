package tcs01;

import java.util.Scanner;

public class p9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		
		findmissing(ar);
	}
	
	public static void findmissing(int [] ar) {
		
		int actdiff=Integer.MAX_VALUE;
		for(int i=0;i<ar.length-1;i++) {
			int currdiff=ar[i+1]-ar[i];
			if(currdiff<actdiff) {
				actdiff=currdiff;
			}
		}
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i+1]-ar[i]!=actdiff) {
				System.out.println("Missing Number is : "+ar[i]+actdiff);
				return;
			}
		}
		
	}

}
