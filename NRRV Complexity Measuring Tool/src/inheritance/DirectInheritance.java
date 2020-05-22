package inheritance;

import java.util.ArrayList;
import java.util.List;

public class DirectInheritance {
	List<String> list = new ArrayList<>();
	int index = 0;
	int arryLength = 0;
	String[] tempstore;
	String[] wordlist3;
	String word;
	String word2;
	String classname;
	int ninher=0;
	public boolean isJava = false;
	private ArrayList<String> inheritance = new ArrayList<>();
	private ArrayList<String> inherit = new ArrayList<>();
	private ArrayList<String> className = new ArrayList<>();
	private ArrayList<Integer> inher = new ArrayList<>();
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	int Nin = 0 ;
	int tempNin = 0 ;
	
	
	
	public int Complexity(String[] code) {
		//int total = 1;  //Default starting value should be 1
		int complexity[] = new int[code.length];
		//System.out.println("class name is: "+code.getClass().getName());
		
		
		for (String s : code) {
	    	String line = s;
	    	int length = s.length();
		
        
	    
	    //Java	 
	    if(isJava) {
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
	                    	System.out.println("Parent class array:"+inheritance);
	                    System.out.println("parent class:"+inheritance.get(a));
	                    
	                    }
	                    //tempNin +=1;
	                }
	               
	                inherit.add(line.split(" ")[i-1]);  //word before 'extends' keyword 
	                for(int b=0;b<inheritance.size();b++) {
	                	System.out.println("Child class array:"+inherit);
	                System.out.println("child class:"+inherit.get(b));
	                }
	                Nin = Nin + (inheritance.indexOf(line.split(" ")[i-1])+1);
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
                

                Nin = Nin + (inheritance.indexOf(line.split(" ")[y-1])+1);
                tempNin  += 1;
            }
            
        }
	    	 valueAccordingtoLine.add(tempNin);
	            Nin += tempNin;
				//tempNin = 0;
	            //}
	               /* if(Nin<=1) {
	                	System.out.println("class name:"+line.split(" ")[j+1]+ " no of direct inheritance:"+Nin);
	                	System.out.println("class name:"+line.split(" ")[j+1]+ " no of indirect inheritance:"+0);
	                }*/
	                
	            
	            
	    //}
		}
		System.out.println("value of the direct inheritance array"+ valueAccordingtoLine);
	    return Nin;
	    
	    }	
}
