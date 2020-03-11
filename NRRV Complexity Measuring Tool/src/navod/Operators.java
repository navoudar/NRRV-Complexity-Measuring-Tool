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
Arithmatic_Operator arithmatic_Operator = new Arithmatic_Operator();
Arithmatic_Operator2 ao = new Arithmatic_Operator2();
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
		for(int i=0; i< arraySize  ; ++i) {
			tempword = wordlist.get(i);
			//System.out.println(tempword);
			
			wordsInFile = tempword.split(" ");
		
			tempword2 = Arrays.toString(wordsInFile);
			wordlist2 = Arrays.asList(wordsInFile);
			//System.out.println(tempword2);
			
		/*	if(tempword2.contains("+") || tempword2.contains("++")) {
				empNop += 1;
			}if(tempword2.contains("-")) {
				empNop += 1;
			}if(tempword2.contains("*")) {
				empNop += 1;
			}if(tempword2.contains("/")) {
				empNop += 1;
			}if(tempword2.contains("%")) {
				empNop += 1;
			}if(tempword2.contains("++")) {
				empNop += 1;
			}if(tempword2.contains("--")) {
				empNop += 1;
			}if(tempword2.contains("==")) {
				empNop += 1;
			}if(tempword2.contains("!=")) {
				empNop += 1;
			}if(tempword2.contains(">")) {
				empNop += 1;
			}if(tempword2.contains("<")) {
				empNop += 1;
			}if(tempword2.contains(">=")) {
				empNop += 1;
			}if(tempword2.contentEquals("<=")) {
				empNop += 1;
			}if(tempword2.contains("&&")) {
				empNop += 1;
			}if(tempword2.contains("||")) {
				empNop += 1;
			}if(tempword2.contains("!")) {
				empNop += 1;
			}if(tempword2.contains("|")) {
				empNop += 1;
			}if(tempword2.contains("^")) {
				empNop += 1;
			}if(tempword2.contains("~")) {
				empNop += 1;
			}if(tempword2.contains("<<")) {
				empNop += 1;
			}if(tempword2.contains(">>")) {
				empNop += 1;
			}if(tempword2.contains("<<<")) {
				empNop += 1;
			}if(tempword2.contains(">>>")) {
				empNop += 1;
			}if(tempword2.contains(",")) {
				empNop += 1;
			}if(tempword2.contains("->")) {
				empNop += 1;
			}if(tempword2.contains(".")) {
				empNop += 1;
			}if(tempword2.contains("::")) {
				empNop += 1;
			}if(tempword2.contains("+=")) {
				empNop += 1;
			}if(tempword2.contains("-=")) {
				empNop += 1;
			}if(tempword2.contains("*=")) {
				empNop += 1;
			}if(tempword2.contains("/=")) {
				empNop += 1;
			}if(tempword2.contains("=")) {
				empNop += 1;
			}if(tempword2.contains(">>>=")) {
				empNop += 1;
			}if(tempword2.contains("|=")) {
				empNop += 1;
			}if(tempword2.contains("-")) {
				empNop += 1;
			}if(tempword2.contains("&=")) {
				empNop += 1;
			}if(tempword2.contains("%=")) {
				empNop += 1;
			}if(tempword2.contains("<<=")) {
				empNop += 1;
			}if(tempword2.contains(">>=")) {
				empNop += 1;
			}if(tempword2.contains("^=")) {
				empNop += 1;
			}
			
			valueAccordingtoLine.add(empNop);
			Nop +=empNop;
			
			empNop = 0;
			//wordlist2.set(i, tempword.split(""));
		
			//wordsInFile = tempword.split(" ");
			*/
		}
	
			//System.out.println(wordlist2.get(0));
	//	System.out.println(Arrays.toString(wordsInFile));
	//	System.out.println(wordlist2);
	//	System.out.println(Arrays.toString(wordsInFile));
		
		
		for(String temp : wordlist) {
			//System.out.println(temp);
			
			//wordsInFile temp.split(" ");
		}
		//System.out.println(Arrays.toString(wordsInFile));
		for(String s : wordlist) {
		//	System.out.println(s);
			if(s.contains("+") || s.contains("++")) {
				empNop += 1;
			}if(s.contains("-")) {
				empNop += 1;
			}if(s.contains("*")) {
				empNop += 1;
			}if(s.contains("/")) {
				empNop += 1;
			}if(s.contains("%")) {
				empNop += 1;
			}/*if(s.contains("++")) {
				empNop += 1;
			}*/if(s.contains("--")) {
				empNop += 1;
			}if(s.contains("==")) {
				empNop += 1;
			}if(s.contains("!=")) {
				empNop += 1;
			}if(s.contains(">")) {
				empNop += 1;
			}if(s.contains("<")) {
				empNop += 1;
			}if(s.contains(">=")) {
				empNop += 1;
			}if(s.contentEquals("<=")) {
				empNop += 1;
			}if(s.contains("&&")) {
				empNop += 1;
			}if(s.contains("||")) {
				empNop += 1;
			}if(s.contains("!")) {
				empNop += 1;
			}if(s.contains("|")) {
				empNop += 1;
			}if(s.contains("^")) {
				empNop += 1;
			}if(s.contains("~")) {
				empNop += 1;
			}if(s.contains("<<")) {
				empNop += 1;
			}if(s.contains(">>")) {
				empNop += 1;
			}if(s.contains("<<<")) {
				empNop += 1;
			}if(s.contains(">>>")) {
				empNop += 1;
			}if(s.contains(",")) {
				empNop += 1;
			}if(s.contains("->")) {
				empNop += 1;
			}if(s.contains(".")) {
				empNop += 1;
			}if(s.contains("::")) {
				empNop += 1;
			}if(s.contains("+=")) {
				empNop += 1;
			}if(s.contains("-=")) {
				empNop += 1;
			}if(s.contains("*=")) {
				empNop += 1;
			}if(s.contains("/=")) {
				empNop += 1;
			}if(s.contains("=")) {
				empNop += 1;
			}if(s.contains(">>>=")) {
				empNop += 1;
			}if(s.contains("|=")) {
				empNop += 1;
			}if(s.contains("-")) {
				empNop += 1;
			}if(s.contains("&=")) {
				empNop += 1;
			}if(s.contains("%=")) {
				empNop += 1;
			}if(s.contains("<<=")) {
				empNop += 1;
			}if(s.contains(">>=")) {
				empNop += 1;
			}if(s.contains("^=")) {
				empNop += 1;
			}
			
			valueAccordingtoLine.add(empNop);
			Nop +=empNop;
			
			empNop = 0;
			
		}
		
		
		
		
		System.out.println("vaue of array"+valueAccordingtoLine);
		
		
		return Nop;
		
	}
	
}
