package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndirectInheritance {
	List<String> list = new ArrayList<>();
	int index = 0;
	int arryLength = 0;
	String[] tempstore;
	String[] wordlist3;
	String word;
	String word2;
	String classname;
	int ninher=0;
	public boolean isJava = false;      //will be true if code sample is in java
	private ArrayList<String> inheritance = new ArrayList<>();
	private ArrayList<String> inherit = new ArrayList<>();
	private ArrayList<String> className = new ArrayList<>();
	private ArrayList<Integer> inher = new ArrayList<>();
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	
	int tempNin = 0 ;
	
	
	
	public int Complexity(String[] code) {
		//int total = 1;  //Default starting value should be 1
		int complexity[] = new int[code.length];
		//System.out.println("class name is: "+code.getClass().getName());
		int Nindir = 1 ;
		
	    for (String s : code) {
	    	String line = s;
	    	int length = s.length();
		
	    	
	    	 //Java
	        if(isJava)
	        {
	            if(line.contains("extends"))
	            {
	            	
	                int i = 0;
	                while(!line.split(" ")[i].equalsIgnoreCase("extends"))
	                {
	                    i++;
	                }

	                if(!inheritance.contains(line.split(" ")[i+1]))
	                {
	                    inheritance.add(line.split(" ")[i+1]);  //word after 'extends' keyword
	                    
	                }
	                else    //If not a chain inheritance
	                {
	                    if(inheritance.indexOf(line.split(" ")[i+1]) == 0)
	                    {
	                        inheritance.remove(1);
	                    }
	                }
	                inheritance.add(line.split(" ")[i-1]);  //word before 'extends' keyword           

	                Nindir = Nindir + (inheritance.indexOf(line.split(" ")[i-1])+1);
	                tempNin  += 1;
	            }
	        }
	        //C++
	        else
	        {
	            if(line.matches(".*\\bclass\\b(?=.*:).*")) //Contains character ':' somewhere after keyword 'class'
	            {
	            	
	                int i = 0;
	                while(!line.split(" ")[i].equalsIgnoreCase(":"))
	                {
	                    i++;
	                }
	                int y = i;               
	                
	                if(line.split(" ")[i+1].matches(".*\\b(public|private|protected)\\b.*"))    //If word after ':' is private/public/protected, then skip it
	                {
	                    i++;
	                }

	                if(!inheritance.contains(line.split(" ")[i+1]))
	                {
	                    inheritance.add(line.split(" ")[i+1]);  //word after ':'
	                }
	                else    //If not a chain inheritance
	                {
	                    if(inheritance.indexOf(line.split(" ")[i+1]) == 0)
	                    {
	                        inheritance.remove(1);
	                    }
	                }
	                
	                inheritance.add(line.split(" ")[y-1]);  //word before ':'    
	                

	               Nindir = Nindir + (inheritance.indexOf(line.split(" ")[y-1])+1);
	               tempNin  += 1; 
	            }
	            
	        }
	        
	        
	        valueAccordingtoLine.add(tempNin);
			Nindir += tempNin;
			//tempNin = 0;
	    }
	    System.out.println("value of the indirect inheritance array"+valueAccordingtoLine);
	    return Nindir;
	    
	    
	}
}
