package ControlStrcture;

import java.util.ArrayList;
import java.util.List;

public class ConditionalControlStructure {
	 int total = 0;
	 List<String> list = new ArrayList<>();
		List<Integer> valueAccordingtoLine = new ArrayList<>();
		int arraySize = 0;
		int NCc = 0;
		
	
	public int Complexity(String[] code) {
		//int total = 1;  //Default starting value should be 1
		int complexity[] = new int[code.length];
		//System.out.println("class name is: "+code.getClass().getName());
		
		
		for (String s : code) {
	    	String line = s;
	    	int length = s.length();
	    	
	    	
	         
	         total = total + ((line.length() - line.replaceAll("(?<!\\w)if(?!\\w)", "").length()) / 2);
	         if(total > 0)  // 'if' detected
	         {            
	             //Detecting &&
	             total = total + ((line.length() - line.replaceAll("&&", "").length()) / 2);
	             //Detecting &
	             total = total + ((line.length() - line.replaceAll("(?<!&)&(?![&=])", "").length()));
	             //Detecting ||
	             total = total + ((line.length() - line.replaceAll("\\|\\|", "").length()) / 2);
	             //Detecting |
	             total = total + ((line.length() - line.replaceAll("(?<!\\|)\\|(?!\\|)", "").length()));
	         }
	         valueAccordingtoLine.add(total);
	 		NCc += total;
	 		total = 0;
	        
		}
		System.out.println("value of the conditional control strcture array"+valueAccordingtoLine);
		return NCc;
	}

}
