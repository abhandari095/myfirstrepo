package test;
import java.util.Scanner;
public class test {
	public static void main(String[] args) 
	{
		System.out.println("This program is to find out the day of week");
		System.out.println("Enter a number from 1 to 7:");
		Scanner kb=new Scanner(System.in);
		int day=kb.nextInt();
		
		{
				switch (day)
		{
		case 1:
			System.out.println("Today is Sunday");
			break;
		case 2:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wednesday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Finally it is Saturday");
		default:
			System.out.println("Enter a valid number");
			break;
		}
		}
				}
		
	}
