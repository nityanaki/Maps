//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  - This lab converts Spanish words to English and provides a method that translates sentences.

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{
		pairs = new TreeMap<String,String>();


	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
		pairs.put(list[0],list[1]);
	}

	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";
		String[] sentence = sent.split(" ");
		for (int i=0;i<sentence.length;i++)
		{
			output+=pairs.get(sentence[i])+" ";			
		}
		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}
