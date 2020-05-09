package ControlStrcture;

import java.util.ArrayList;
import java.util.List;

public class IterativeControlStructure {
	 int braces = 1;
	 boolean isDoWhileLoop = false;   //Used to skip the next 'while' keyword after 'do' detected
	 boolean nestedBlock = false;     //Used to identify nested blocks inside loops or 'if' statements
	 int total = 0;
	 List<String> list = new ArrayList<>();
		List<Integer> valueAccordingtoLine = new ArrayList<>();
		int arraySize = 0;
		int NCi = 0;
		
	
	public int Complexity(String[] code) {
		//int total = 1;  //Default starting value should be 1
		int complexity[] = new int[code.length];
		//System.out.println("class name is: "+code.getClass().getName());
		
		
		for (String s : code) {
	    	String line = s;
	    	int length = s.length();
	    	
	    	System.out.println("loop begin"+total);
	        System.out.println(s); 
	    	
	        total = total + (((line.length() - line.replaceAll("(?<!\\w)for(?!\\w)", "").length()) / 3));
	        total = total + (((line.length() - line.replaceAll("(?<!\\w)while(?!\\w)", "").length()) / 5));
	        total = total + ((line.length() - line.replaceAll("\\bdo\\b", "").length()) / 2);  //Not needed becaues of 'while' at end?
	        //dont need add a seperate method to calculate do-while
	        
	        if(total > 0)  //a loop detected detected
	        {            
	            //Detecting &&
	            total = total + ((line.length() - line.replaceAll("(?<![\\=\\<\\>\\!\\+\\-\\?\\|\\@\\#\\$\\%\\^\\&\\*\\/])&&(?![\\=\\<\\>\\!\\+\\-\\?\\|\\@\\#\\$\\%\\^\\&\\*\\/])", "").length()));
	            //Detecting ||
	            total = total + ((line.length() - line.replaceAll("\\|\\|", "").length()));
	            //Detecting &
	            total = total + ((line.length() - line.replaceAll("(?<![\\=\\<\\>\\!\\+\\-\\?\\|\\@\\#\\$\\%\\^\\&\\*\\/])&(?![\\=\\<\\>\\!\\+\\-\\?\\|\\@\\#\\$\\%\\^\\&\\*\\/])", "").length())*2);
	            //Detecting |
	            total = total + ((line.length() - line.replaceAll("(?<!\\|)\\|(?!\\|)", "").length())*2);
	        }      
	        System.out.println("after deetcting if"+total); 
	         
	        System.out.println("before array"+total);
	 		valueAccordingtoLine.add(total);
	 		System.out.println("after array"+total);
	 		NCi += total;
	 		total = 0;
	        
		}
		System.out.println("value of the iterative control strcture array"+valueAccordingtoLine);
		return NCi;
	}


}
