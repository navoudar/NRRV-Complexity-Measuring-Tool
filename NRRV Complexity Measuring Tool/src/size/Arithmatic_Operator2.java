package navod;

public class Arithmatic_Operator2 {

	public int Complexity(String[] code) {
		
		for(String s : code) {
			System.out.println(s);
			String text = s;
			String pattern = "extends";
			
			int count = 0;
		//	boolean result = false;
			
			int textLength = text.length();
			int patternLength =  pattern.length();
			//System.out.println("length of pattern"+patternLength);
			char c,p;
			
			for(int i=0 ; i<=textLength-patternLength ; i++ ) {
				
				c =  text.charAt(i);
				p =  pattern.charAt(0);
				
				if(c == p) {
					for(int j= i ,k=0;  j<i+patternLength ; j++, k++) {
						
						c = text.charAt(j);
						p = pattern.charAt(k);
						
							if(c == p) {
								count++;
								
							}
					}
				}
				
				
			}
			if(count==patternLength) {
				System.out.println("new method working"+count);
			}else {
				System.out.println("new method not found"+count);
			}
			
		}
		
		
	
		return 0;
	}
	
}
