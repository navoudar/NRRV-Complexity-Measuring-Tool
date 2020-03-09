package navod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeywordAndReservedWord {
	List<String> list = new ArrayList<>();
	public int Complexity(String[] code) {
		List codelist = Arrays.asList(code); 
		String tempss = (String) codelist.get(0);
		
		String[] temp2 = tempss.split(" ");
		
		System.out.println(Arrays.toString(temp2));
		
		if(tempss.contains("class")) {
			//System.out.println("in the block , yeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		}
		
		
		int complexity[] = new int[code.length];
		
		  for (String s : code) {
			  
			  String temp = code.toString();
			
			  
		  }
		
		return 0;
		
		
		
	}

}
