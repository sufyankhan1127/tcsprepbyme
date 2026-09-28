package tcs01;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=scan.nextLine();
		
		System.out.println("Enter the second string");
		String s2=scan.nextLine();
		
		
		if(isanagram(s1, s2)) {
			System.out.println("This two are anagram");
		}
		else {
			System.out.println("This is not an anagram");
		}
	}

	public static boolean isanagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		int[] count=new int[256];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
		}
		
		for(int i=0;i<s2.length();i++) {
			count[s2.charAt(i)]--;
		}
		
		for(int i=0;i<256;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		
		return true;
	}
}
