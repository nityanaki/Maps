//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		SpanishToEnglish a = new SpanishToEnglish();
		Scanner input = new Scanner(new File("spantoeng.dat"));
		int size= input.nextInt();
		input.next();
		for (int i=1;i<=size;i++)
		{
			String k = input.nextLine();
			a.putEntry(k);
		}
		a.putEntry("rearrancar reboot");
		System.out.println(a);
		System.out.println("\n");
		while (input.hasNext())
		{
			String h = input.nextLine();
			System.out.println(a.translate(h));
		}
	}
}