package navod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numerical_Value {

	int Nnv = 0;
	int tempNnv =0;
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	List<String> wordlist = new ArrayList<String>();
	String word;
	
	
	public int Complexity(String[] code) {
		
		
		wordlist = Arrays.asList(code);
		for(String s : code) {
		tempNnv= 0;	
		word = s.toString().trim();
		String data1 = word;
		
		String regex = "\\b(\\d)\\b"; 
		//System.out.println(word);
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(data1);
		while (matcher.find())
		{
			
			tempNnv =1;
		//   System.out.print("Start index: " + matcher.start());
		 //   System.out.print(" End index: " + matcher.end() + " ");
		//    System.out.println(matcher.group());
		   
		    Nnv += tempNnv;			   
		    
		}
		
	    valueAccordingtoLine.add(tempNnv);
}
	    System.out.println("value of the numerical value array"+valueAccordingtoLine);	
		return Nnv; 
	}

	
}
