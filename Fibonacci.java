/**
*Name:Girija Unnibhavi
*Description:compilation of java program to print the fibonacci series on screen
*Date: 3/14/2021
*/
import java.util.Scanner;
public class Fibonacci {
	static public void main(String args[])
	{
	int n, n1=0, n2=1;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	n=sc.nextInt();
	
	{
	for(int i=1;i<=n;i++){
		
		int sum=n1+n2;
	    n1=n2;
	    n2=sum;
	}
	    System.out.println(n1);
	}
	
}
}


