package com.kodnest.Project;

public class Practice {
	public static void main(String[] args) {
		int n=123456;
		int rem;
		int even=0;
		int odd=0;
		
		while(n>0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				even=even+rem;
			}
			else {
				odd=odd+rem;
			}
			n=n/10;
			
			
		}
		System.out.println("the sum of even is = "+even);
		System.out.println("the sum of odd  is = "+odd);
	}

}
