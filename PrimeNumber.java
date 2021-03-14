/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to display Prime numbers
 * Date: 03/14/2021
 */

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int i;
		for(i=2;i<n;i++)
		{
			if(i%2!=0)
				System.out.println(i);
				
		}
	

}
}