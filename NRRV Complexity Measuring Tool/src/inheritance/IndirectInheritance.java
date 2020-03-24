package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndirectInheritance {
	List<String> list = new ArrayList<>();
	int index = 0;
	int arryLength = 0;
	String[] tempstore;
	String word;
	int ninher=0;
	private ArrayList<String> inheritance = new ArrayList<>();
	private ArrayList<Integer> inher = new ArrayList<>();
	int Nin = 0 ;
	int tempNin = 0 ;
	
	public int Complexity(String[] code) {
		//int total = 1;  //Default starting value should be 1
		int complexity[] = new int[code.length];

	    for (String s : code) {
	    	String line = s;
	    	int length = s.length();
		
        
        //boolean isJava=false;
		//Java
        //if(isJava)
        //{
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
                    System.out.println("parent class:"+inheritance.get(0));
                }
                else    //If not a chain inheritance
                {
                    if(inheritance.indexOf(line.split(" ")[i+1]) == 0)
                    {
                        inheritance.remove(1);
                    }
                }
                inheritance.add(line.split(" ")[i-1]);  //word before 'extends' keyword     
                System.out.println("child class:"+inheritance.get(1));

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
		
        
	//}
	   // System.out.println("number of inheritance"+ total);
	    
	    return Nin;
	    
		
	}
}
