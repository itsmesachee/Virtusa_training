package com.virtusa.service;

import java.util.Scanner;

public class SimpleLoop {


		int array[]= {5,-2,78,-65,41,-52};
		public int findTotal(int n) {
			int total=0;
			if(n>0) {
				for(int count=0;count<n;count++)
					if(array[count]>0)
						total+=array[count];
				n--;
		}return total;
	}

		public static void main(String[] args) {
			
			SimpleLoop sl=new SimpleLoop();
			System.out.println("Enter the looping frequency:");
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			System.out.println(sl.findTotal(x));
			
		}
}