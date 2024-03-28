package com.kodnest.Project;
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		
	

int n=sc.nextInt();
int rem;

int count=0;

while(n>0)
{
	rem=n%10;
	n=n/10;
	count++;
	
	
}
System.out.println("the count is = "+count);
}

}
