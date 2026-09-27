package tcs01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of intervals: ");
		int n=scan.nextInt();
		int[][] ar=new int[n][2];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the start and end of interval "+(i+1));
			
			ar[i][0]=scan.nextInt();
			ar[i][1]=scan.nextInt();
			
		}
		Arrays.sort(ar, (a, b) -> Integer.compare(a[0], b[0]));
		ArrayList<int[]> ans = new ArrayList<>();

		ans.add(ar[0]);
		for(int i=1;i<n;i++) {
			if(ar[i][0]<=ans.get(ans.size()-1)[1]) {
				ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1], ar[i-1][1]);
			}
			else {
				ans.add(ar[i]);
			}
		}
		
		System.out.println("Merged Intervals: ");
		
		for(int[] interval:ans) {
			System.out.println("["+interval[0]+" " +interval[1]+"]");
		}
		
	}
	
	

}
