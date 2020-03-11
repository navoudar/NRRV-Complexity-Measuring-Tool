package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inheritance {
	List<String> list = new ArrayList<>();
	public int Complexity(String[] code) {
		List codelist = Arrays.asList(code); 
		String tempss = (String) codelist.get(0);
		
		String[] temp2 = tempss.split(" ");
		
		System.out.println(Arrays.toString(temp2));
		
		if(temp2[3].contains("extends")) {
			System.out.println(temp2[4]);
		}
		else
			System.out.println("not inherit class");
		
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
