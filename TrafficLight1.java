/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of Traffic light java program
 * Date: 03/14/2021
 */

import java.util.Scanner;
public class TrafficLight1 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice");
		String choice=sc.next();
		
		switch(choice)
		{
		case "RED":
			System.out.println("Stop");
			break;
		case "GREEN":
			System.out.println("Go");
			break;
		case "YELLOW":
			System.out.println("Ready to go");
			break;
			default:
				System.out.println("Invalidchoice");
		}
	}

}
