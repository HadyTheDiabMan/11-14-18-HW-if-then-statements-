import java.util.Scanner;
/**
 * 
 * @author Hady Diab, Season calculator.
 *
 */
public class whichseason 
{

	public static void main(String[] args) 
	{
		Scanner season=new Scanner(System.in);
		System.out.println("The season calculator!");
		System.out.print("Enter in the numerical value of your birthmonth: ");
		int numericalmonth=season.nextInt();
		
		
		
		if ( numericalmonth>12 || numericalmonth<1)
		{
			System.out.println("INVALID MONTH NUMBER!");
		}
		else if (numericalmonth==12||numericalmonth==1||numericalmonth==2)
		{
			System.out.println("You were born in winter!");
		}
		else if (numericalmonth==3||numericalmonth==4||numericalmonth==5)
		{
			System.out.println("You were born in spring!");
		}
		else if(numericalmonth==6||numericalmonth==7||numericalmonth==8)
		{
			System.out.println("You were born in summer!");
		}
		else if(numericalmonth==9||numericalmonth==10||numericalmonth==11)
		{
			System.out.println("You were born in autumn!");
		}
	}

}
