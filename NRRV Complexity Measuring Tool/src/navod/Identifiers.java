package navod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Identifiers {
	int Nid = 0 ;
	int tempNid = 0 ;
	List<Integer> valueAccordingtoLine = new ArrayList<>();	
	List<String> wordlist = new ArrayList<String>();
	List<String> wordlist2 = new ArrayList<String>();
	String[] wordlist3;
	String word;
	
	public int Complexity(String[] code) {
		
// this is a unique part for separating words, form this below for loop we can get word by word and passed it to wordlist2	
		for(String s : code) {
			
		word = s.toString();
		
		wordlist3 = s.split("[\\s]");
		
		Collections.addAll(wordlist2, wordlist3);
		
		}
	//	System.out.println(wordlist2);	
		
		for(String s : wordlist2) {
			
			word = s.toString().trim();
			tempNid = 1;
			String regex = "abstract|assert|boolean|break|";
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(word);
			
			while (matcher.find()) {

				tempNid = 0;
				 System.out.print("Start index: " + matcher.start());
				 System.out.print(" End index: " + matcher.end() + " ");
				 System.out.println(matcher.group());

				

			}
			Nid += tempNid;
			valueAccordingtoLine.add(tempNid);
		}
	
	/*	wordlist = Arrays.asList(code);
		
		for (String s : code) {
			

			word = s.toString().trim();
			tempNid = 0;
			
			String data1 = word;
			
			String regex = "[\"]\\b|[\"] |\"{2}";
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(data1);
			while (matcher.find()) {

				tempNid = 1;
				 System.out.print("Start index: " + matcher.start());
				 System.out.print(" End index: " + matcher.end() + " ");
				 System.out.println(matcher.group());

				Nid += tempNid;

			}

			valueAccordingtoLine.add(tempNid);
			
			
			
		}
		*/
		
		
		
		System.out.println("value of the identifier array"+valueAccordingtoLine);
		return Nid;
		
	}

}
