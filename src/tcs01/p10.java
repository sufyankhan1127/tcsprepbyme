//reverse a string


package tcs01;

import java.util.Scanner;

public class p10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		revString(s);
	}
	
	public static void revString(String s) {
		int end=s.length()-1;
		
		while(end>=0) {
			System.out.print(s.charAt(end));
			end--;
		}
	}

}
