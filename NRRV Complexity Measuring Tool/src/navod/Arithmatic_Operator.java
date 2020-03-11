package navod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class Arithmatic_Operator {
	int Nop =0;
	int empNop = 0;
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	List<String> wordlist = new ArrayList<String>();
	String word;
	boolean test;
	public int Complexity(String[] code) {
		
		wordlist = Arrays.asList(code);
		
	//	boolean b = Pattern.compile(".m").matcher("am").matches();
	//	System.out.println(b);
	/*	String data1 = "Today, java class is object oriented language";
		String regex = "\\bclass\\b";
		 
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(data1);
		while (matcher.find())
		{
		    System.out.print("Start index: " + matcher.start());
		    System.out.print(" End index: " + matcher.end() + " ");
		    System.out.println(matcher.group());
		}
		
		*/
		for(String s : code) {
			word = s.toString().trim();
			
			
			String data1 = word;
			String regex = "\\b++i\\b";
			 
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(data1);
			while (matcher.find())
			{
			    System.out.print("Start index: " + matcher.start());
			    System.out.print(" End index: " + matcher.end() + " ");
			    System.out.println(matcher.group());
			}
			
			
			
			
			
			
			
			
			
			
			
			
			//System.out.println(word);
			
			//test = Pattern.compile("[amn]").matcher(word.toString().trim()).matches();
		//	System.out.println("boolean "+ test);
			
			if(Pattern.compile("\\bclass\\b").matcher(word).matches()) {
			//	System.out.println("working");
			}else {
			//	System.out.println("Not working");
			}
			
		}
		
		
		
		
		return Nop;
	}
	
}
