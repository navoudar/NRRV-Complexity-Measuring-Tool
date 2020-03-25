package navod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class Operator_Arithmatic {
	int Nop =0;
	int tempNop = 0;
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	List<String> wordlist = new ArrayList<String>();
	String word;
	boolean test;
	public int Complexity(String[] code) {
		
		wordlist = Arrays.asList(code);
		
		for(String s : code) {
			word = s.toString().trim();
			tempNop= 0;
			
			String data1 = word;
			
			String regex = "(\\+\\+|^\\+)"; 
		//	System.out.println(word);
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(data1);
			while (matcher.find())
			{
				
				tempNop =1;
			    System.out.print("Start index: " + matcher.start());
			    System.out.print(" End index: " + matcher.end() + " ");
			    System.out.println(matcher.group());
			   
			    Nop += tempNop;			   
			    
			}
			
		    valueAccordingtoLine.add(tempNop);
			 
			 
		}
		
		System.out.println("value of the array"+valueAccordingtoLine);	
		return Nop;
	}
	
}
