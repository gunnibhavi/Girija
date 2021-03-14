/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of Traffic light java program
 * Date: 03/14/2021
 */

import java.util.Scanner;
public class TrafficLight {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice 1. Red, 2. Green, 3. Yellow");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Stop");	
		}
		else if(choice==2)
		{
			System.out.println("Go");
		}
		else
		{
			System.out.println("Ready to go");
		}
	}

}
