package ControlStrcture;

import java.util.ArrayList;
import java.util.List;

public class SwitchControlStructure {
	 int total = 0;
	 private int noSwitch = 0;
	 List<String> list = new ArrayList<>();
		List<Integer> valueAccordingtoLine = new ArrayList<>();
		int arraySize = 0;
		int NCs = 0;
		
	
	public int Complexity(String[] code) {
		//int total = 1;  //Default starting value should be 1
		int complexity[] = new int[code.length];
		//System.out.println("class name is: "+code.getClass().getName());
		
		
		for (String s : code) {
	    	String line = s;
	    	int length = s.length();
	    	
	    	
	         
	    	noSwitch += (((line.length() - line.replaceAll("(?<!\\w)switch(?!\\w)", "").length()) / 6));
	        
	        
	        if(noSwitch > 0)  //switch detected
	        {            
	            //Detecting cases
	            total = total + ((line.length() - line.replaceAll("(?<!\\w)case(?!\\w)", "").length()) / 4);
	        
	        } 
	         valueAccordingtoLine.add(total);
	 		NCs += total;
	 		total = 0;
	        
		}
		System.out.println("value of the switch control strcture array"+valueAccordingtoLine);
		return NCs;
	}
}
