//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  - This lab converts given acronyms to words or phrases.

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
		acronymTable= new TreeMap<String,String>();
	}

	public void putEntry(String entry)
	{
		String[] k = entry.split(" - ");
		acronymTable.put(k[0], k[1]);
	}

	public String convert(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";
		while (chop.hasNext())
		{
			String k = chop.next();
			if (acronymTable.get(k)!=null)
			{
				output+=acronymTable.get(k) + " ";
			}
			else if (acronymTable.containsKey(k.substring(0, k.length()-1)))
			{
				output+=acronymTable.get(k.substring(0, k.length()-1)) + ". ";
			}
			else
				output+=k + " ";
		}



		return output;
	}

	public String toString()
	{
		return acronymTable.toString().replaceAll("\\,","\n");
	}
}
