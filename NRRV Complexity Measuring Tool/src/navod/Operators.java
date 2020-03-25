package navod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.FileModel;

public class Operators {
int Nop =0;
int empNop = 0;
List<Integer> valueAccordingtoLine = new ArrayList<>();
List<String> wordlist = new ArrayList<String>();
List<String> wordlist2 = new ArrayList<String>();
String[] wordsInFile;
String tempword;
String tempword2;
FileModel fm = new FileModel();
Operator_Arithmatic arithmatic_Operator = new Operator_Arithmatic();

int arraySize = 0;
	public int Complexity(String[] code) {
		
		Nop = arithmatic_Operator.Complexity(code);
		//ao.Complexity(code);
		wordlist = Arrays.asList(code);
		arraySize = code.length;
		//arraySize = wordlist.size();
		//System.out.println("new Array size"+arraySize);
		//tempword = wordlist.get(0);
		//wordsInFile = tempword.split("(?!^)");
		
		//System.out.println("vaue of array"+valueAccordingtoLine);
		
		
		return Nop;
		
	}
	
}
