package navod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class Operator_Arithmatic {
	int Nop =0;
	int tempNop = 0;
	int count = 0;
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	List<String> wordlist = new ArrayList<String>();
	String[] wordlist3;
	String word;
	String word2;
	boolean test;
	public int Complexity(String[] code) {
		
		wordlist = Arrays.asList(code);
		
		for(String s : code) {
			word = s.toString().trim();
			tempNop= 0;
			
			wordlist3 = s.split("\\s");
			
				for(String w : wordlist3) {
				
					word2 = w.toString().trim();
			
					tempNop = 1;
					
					String regex = "\\+[+]|\\+[=]|\\=[+]|\\+";
					
					Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
					Matcher matcher = pattern.matcher(word2);
					while (matcher.find())
					{
						tempNop = 0;
						if(matcher.group().startsWith("+")&& matcher.group().endsWith("=")) {
							System.out.println(matcher.group()+"found +=");
							tempNop = 0;
						}else if(matcher.group().startsWith("=")&& matcher.group().endsWith("+")) {
							System.out.println(matcher.group()+"found =+");
							tempNop = 0;
						}else if(matcher.group().startsWith("+")&& matcher.group().endsWith("+")) {
							System.out.println(matcher.group()+"found ++ and +");
							tempNop = 1;
						}
						
						count+= tempNop;
					}
				
				}
			Nop += count;
			valueAccordingtoLine.add(count);
			count = 0;
		}
		
		System.out.println("value of the arithmatic operator array"+valueAccordingtoLine);	
		return Nop;
	}
	
}
