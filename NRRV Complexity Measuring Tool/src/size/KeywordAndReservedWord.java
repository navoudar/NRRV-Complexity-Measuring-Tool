package size;

import java.util.ArrayList;


import java.util.List;

public class KeywordAndReservedWord {
	
	List<String> list = new ArrayList<>();
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	int arraySize = 0;
	int Nkw = 0;
	int tempNkw = 0;
	
	
	public List<Integer> Complexity(String[] code) {
		
	//	List codelist = Arrays.asList(code); 
	//	String tempss = (String) codelist.get(0);
	//	arraySize = codelist.size();
	//	System.out.println("Array size"+ arraySize);
		
		
		
		for(String temp : code) {
			//System.out.println("in loop"+ temp);
		if(temp.contains("abstract")) {
			tempNkw  += 1;
			
		}if(temp.contains("catch")) {
			tempNkw += 1;
		}if(temp.contains("class")) {
			tempNkw += 1;
		}if(temp.contains("const")) {
			tempNkw += 1;
		}if(temp.contains("default")) {
			tempNkw += 1;
		}if(temp.contains("enum")) {
			tempNkw += 1;
		}if(temp.contains("extends")) {
			tempNkw += 1;
		}if(temp.contains("final")) {
			tempNkw += 1;
		}if(temp.contains("finally")) {
			tempNkw += 1;
		}if(temp.contains("implements")) {
			tempNkw += 1;
		}if(temp.contains("import")) {
			tempNkw += 1;
		}if(temp.contains("instanceof")) {
			tempNkw += 1;
		}if(temp.contains("interface")) {
			tempNkw += 1;
		}if(temp.contains("native")) {
			tempNkw += 1;
		}if(temp.contains("new")) {
			tempNkw += 1;
		}if(temp.contains("package")) {
			tempNkw += 1;
		}if(temp.contains("private")) {
			tempNkw += 1;
		}if(temp.contains("protected")) {
			tempNkw += 1;
		}if(temp.contains("public")) {
			tempNkw += 1;
		}if(temp.contains("return")) {
			tempNkw += 1;
		}if(temp.contains("static")) {
			tempNkw += 1;
		}if(temp.contains("strictfp")) {
			tempNkw += 1;
		}if(temp.contains("super")) {
			tempNkw += 1;
		}if(temp.contains("synchronized")) {
			tempNkw += 1;
		}if(temp.contains("this")) {
			tempNkw += 1;
		}if(temp.contains("throw")) {
			tempNkw += 1;
		}if(temp.contains("throws")) {
			tempNkw += 1;
		}if(temp.contains("transient")) {
			tempNkw += 1;
		}if(temp.contains("try")) {
			tempNkw += 1;
		}if(temp.contains("void")) {
			tempNkw += 1;
		}if(temp.contains("volatile")) {
			tempNkw += 1;
		}if(temp.contains("true")) {
			tempNkw += 1;
		}if(temp.contains("false")) {
			tempNkw += 1;
		}if(temp.contains("null")) {
			tempNkw += 1;
		}
		
		
		valueAccordingtoLine.add(tempNkw);
		Nkw += tempNkw;
		tempNkw = 0;
		
		}
		
		
		valueAccordingtoLine.add(Nkw);
		System.out.println("value of the keyword array"+valueAccordingtoLine);
		return valueAccordingtoLine;
		
		
		
	}

}
