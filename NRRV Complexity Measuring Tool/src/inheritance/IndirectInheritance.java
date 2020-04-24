package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	private ArrayList<String> inheritance = new ArrayList<>();
	private ArrayList<String> inherit = new ArrayList<>();
	private ArrayList<String> className = new ArrayList<>();
	private ArrayList<Integer> inher = new ArrayList<>();
	int Nin = 0 ;
	int tempNin = 0 ;
	
	public String ClassName(String[] code) {
		for (String s : code) {
	    	String line = s;
	    	int length = s.length();
		
        
	    	 if(line.contains("class"))
	            {
	                int j = 0;
	                while(!line.split(" ")[j].equalsIgnoreCase("class"))
	                {
	                	j++;
	                }
	                for(int i=0;i<s.length();i++) {
	                	className.add(line.split(" ")[j+1]);
	                }
	            }
	    	 
			
		}
		return className.get(index); 	
	}
	
	public int Complexity(String[] code) {
		//int total = 1;  //Default starting value should be 1
		int complexity[] = new int[code.length];
		//System.out.println("class name is: "+code.getClass().getName());
		
		
		/*for(String w : code) {
			
			wordlist3 = w.split("\\s");
			
			for(String x : wordlist3) {
				word2 = x.toString().trim();
				
				
				
				String regex = "(\\w)+";
				Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(word2);
				
				while(matcher.find()) {
				System.out.println(matcher.group());
				
				
				
				}
				
				}
			}*/
			
		// end of w loop	
		
		
		
	    for (String s : code) {
	    	String line = s;
	    	int length = s.length();
		
        
	    	 if(line.contains("class"))
	            {
	                int j = 0;
	                while(!line.split(" ")[j].equalsIgnoreCase("class"))
	                {
	                    j++;
	                   // System.out.println("class name:"+line.split(" ")[j+1]);           
	//}
	   // System.out.println("number of inheritance"+ total);
	    
	    	 
	    
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
	                    for(int a=0;a<inheritance.size();a++) {
	                    System.out.println("parent class:"+inheritance.get(a));
	                    }
	                }
	               
	                inherit.add(line.split(" ")[i-1]);  //word before 'extends' keyword 
	                for(int b=0;b<inheritance.size();b++) {
	                System.out.println("child class:"+inherit.get(b));
	                }
	                //total = total + (inheritance.indexOf(line.split(" ")[i-1])+1);
	                tempNin  += 1;
	            }
	    	 /*else
	            {
	            	System.out.println("class name:"+inheritance.get(1));
	            }*/
	            inher.add(tempNin);
	            Nin += tempNin;
				tempNin = 0;
	            }
	                if(Nin<=1) {
	                	System.out.println("class name:"+line.split(" ")[j+1]+ " no of direct inheritance:"+Nin);
	                	System.out.println("class name:"+line.split(" ")[j+1]+ " no of indirect inheritance:"+0);
	                }
	                else if(Nin>1) {
	                	int Ninder = Nin-1;
	                	System.out.println("class name:"+line.split(" ")[j+1]+ " no of direct inheritance:"+1);
	                	System.out.println("class name:"+line.split(" ")[j+1]+ " no of indirect inheritance:"+Ninder);
	            }
	            }
	    }
	    
	    return Nin;
	    
	    }	
	
}
