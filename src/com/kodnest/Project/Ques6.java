package com.kodnest.Project;
import java.util.Scanner;
public class Ques6 {
	public static void main(String[] args) {
		int s=1;
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.println("the factorial is " + s);
	}

}
