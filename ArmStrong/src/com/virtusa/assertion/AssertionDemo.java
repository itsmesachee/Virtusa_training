package com.virtusa.assertion;

public class AssertionDemo {

	public static void main(String[] args)
	{
		
		int nOfAdults=2,nOfChild=3,totalNoTickets=nOfAdults+nOfChild;
		int tickets[]=new int[totalNoTickets],pass=1;
		for(int i=0;i<tickets.length;i++)
		{
			tickets[i]=pass;
			pass++;
		}
		
		int n=0;
		do {
			assert tickets[n]>0:"Pass"
			System.out.println("Pass Issued:"+tickets[n]);
			n++;
		}while(n<tickets.length);
	}
}
