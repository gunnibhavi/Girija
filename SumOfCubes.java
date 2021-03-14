/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to find sum of cubes of digits in a given number
 * Date: 03/14/2021
 */

import java.util.Scanner;

public class SumOfCubes {
	
	public static void sumofcubes()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int m,sum=0;
		while(num!=0)
		{
			
		m=num%10;
		sum=sum+(m*m*m);
		num=num/10;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		
		sumofcubes();
		
	}

}



