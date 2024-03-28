package com.kodnest.Project;
import java.util.Scanner;
public class Ques7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ori = n;
		int rem1=0;



		while(n>0)
		{

			rem1=rem1* 10 + n%10;
			n=n/10;


		}
		System.out.println(rem1+">>");
		System.out.println();
		if(ori==rem1)
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
