import java.util.Scanner;

public class Reader
	{
	static long imput;

	public static void reader()
		{
		long[] newNumb = new long[16];
		long[] multiplier = new long[2];
		long timesTwo;
		long total = 0;
		long newImput = imput;
		Scanner file = new Scanner(System.in);
		System.out
				.println("Enter your 16 digit credit card number now...or pay the consequences!");
		long numb = file.nextLong();
		long imput=numb;
		for (int i = 0; i < 16; i++)
			{
			newNumb[i] = newImput;
			numb=numb%10;
			}
		for (int z=0;z<16;z++)
			{
			if(z%2==1)
				{
				timesTwo=newNumb[z]*2;
				if(timesTwo>9)
					{
					for (int r=0; r<16;r=r++)
						{
						multiplier[r]=timesTwo%10;
						timesTwo=timesTwo/10;
						}
					timesTwo=multiplier[0]+multiplier[1];
					}
				newNumb[z]=timesTwo;
				}
			total=total+newNumb[z];
			}
		if (total%10==0)
			{
			System.out.println("The card number "+imput+" is potentially valid.");
			else
			System.out.println("The card number "+imput+"is invalid.");
			}
		}
			
		public static void main(String[] args){
		
		reader();
		}
		}

	
