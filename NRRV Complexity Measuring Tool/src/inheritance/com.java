package inheritance;

import java.util.ArrayList;

public class com {
	int Nin = 0 ;
	int tempNin = 0 ;
	private ArrayList<Integer> inheritance = new ArrayList<>();
	public int Complexity(String[] code) {
		for(String s : code) {
			String line = s;
	    	int length = s.length();
	    	
	    	if(line.contains("extends"))
            {
	    		tempNin  += 1;
            
            }if(line.contains("implements")) {
				tempNin += 1;
			}
			
			
            inheritance.add(tempNin);
            Nin += tempNin;
			tempNin = 0;
		}
		
		
		
		//System.out.println("value of inherit:"+inheritance);
		
		
		return Nin;
		}

}
