package com.interview;

public class StarPattern {
	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {                  
			for(int j =1; j<=i;j++) {                 
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k=5;k>=0;k--) {
			for(int l=1;l<=k;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
    
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    
		int i = 5;
		while(i>=0) {
			for(int j=0;j<5;j++) {
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			i--;
		}
	}
}
