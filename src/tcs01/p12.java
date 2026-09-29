//longest rectangle that can be formed


package tcs01;

import java.util.Scanner;

public class p12 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of heights array");
		int n=scan.nextInt();
		int[] heights=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the height "+(i+1));
			heights[i]=scan.nextInt();
			
		}
		rectangleformed(heights);
	}
	
	public static void rectangleformed(int [] heights) {
		int maxarea=0;
		for(int i=0;i<heights.length;i++) {
			int minheight=heights[i];
			for(int j=i;j<heights.length;j++) {
				minheight=Math.min(minheight, heights[j]);
				int width=j-i+1;
				int currarea=minheight*width;
				
				maxarea=Math.max(maxarea, currarea);
			}
		}
		
		System.out.println("Max area rectangle that can be formed is : "+maxarea);
	}

}

