package inheritance;

public class DirectInheritance {
	private int complexityValue = 1;
	private int noOfDoublequotes = 0;
	private int noOfSinglequote = 0;
	private int numberOfInheritClass = 0;
	//private int totalnumberOfInheritClass = 0;
	private int i = 0;
	
	public int[] complexity(String[] code) {
		int complexity[] = new int[code.length];

	    for (String s : code) {
	    	String line = s;
	    	int length = s.length();    
			for(int i = 0; i < length-1; i++) {
				char character = line.charAt(i);
				char characterNext = 0;
				char characterPrev =0;
				char characterPrevPrev =0;

				if(character == '/' && characterNext =='/') {
					break;
				}
				if(i != line.length()) {
					characterNext = line.charAt(i+1);
		        }
		        if(i != 0) {
					characterPrev = line.charAt(i-1);
		        }
		        if(i != 1 && i != 0) {
		        	characterPrevPrev = line.charAt(i-2);
		        }
		          
		        if( character == '\'') {
					noOfSinglequote++;
				}
				if(character == '"' && noOfSinglequote%2 == 0) {
						noOfDoublequotes++;
				}
				else if(noOfDoublequotes%2 ==  1 || noOfSinglequote%2 ==  1) {
					
				}
				else if((noOfDoublequotes%2) == 0 && noOfSinglequote%2 ==  0){			
			    	  
					if(characterPrev == 'e' && character == 'x' && characterNext == 't' && line.charAt(i+2) == 'e' && line.charAt(i+3) == 'n' && line.charAt(i+4) == 'd' && line.charAt(i+5) == 's' && line.charAt(i+6) == ' ') {
						numberOfInheritClass++;
					}
					else if(characterPrev == 'i' && character == 'm' && characterNext == 'p' && line.charAt(i+2) == 'l' && line.charAt(i+3) == 'e' && line.charAt(i+4) == 'm' && line.charAt(i+5) == 'e' && line.charAt(i+6) == 'n' && line.charAt(i+7) == 't' && line.charAt(i+8) == 's' && line.charAt(i+9) == ' ') {
						numberOfInheritClass++;
					} 
					
					
				}
			}
			//System.out.println(s);
	        //System.out.println("\tNumber Of inherit class :"+ numberOfInheritClass);
	        //System.out.println("");
	        complexity[i] = numberOfInheritClass* complexityValue;

	    	
	        //totalnumberOfInheritClass = totalnumberOfInheritClass + numberOfInheritClass;
	        numberOfInheritClass = 0;
	        i++;
		}		
        //System.out.println("Total Number of inherit class :" +totalnumberOfInheritClass);

		return complexity;		
	}
}
