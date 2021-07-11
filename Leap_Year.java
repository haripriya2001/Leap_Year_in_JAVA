import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		int year;
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE YEAR :");
		year=s.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year+" is leap year");
				}
				else
				{
					System.out.println(year+" is not a leap year");
				}
			}
			else
			{
				System.out.println(year+" is a leap year");
			}
			
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}

	}

}
