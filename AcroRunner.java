//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner input = new Scanner(new File("acro.dat"));
		int size = input.nextInt();
		input.nextLine();
		Acronyms yay = new Acronyms();
		for (int i=1;i<=size;i++)
		{
			yay.putEntry(input.nextLine());
		}
		System.out.println(yay);
		System.out.println();
		while (input.hasNext())
		{
			System.out.println(yay.convert(input.nextLine()));
		}
	}
}