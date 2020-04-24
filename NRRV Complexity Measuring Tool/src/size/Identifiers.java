package size;

import java.util.ArrayList;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Identifiers {
	int Nid = 0;
	int tempNid = 0;
	int count = 0;
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	List<String> wordlist = new ArrayList<String>();
	List<String> wordlist2 = new ArrayList<String>();
	String[] wordlist3;
	String word;
	String word2;

	public List<Integer> Complexity(String[] code) {

// this is a unique part for separating words, form this below for loop we can get word by word and passed it to wordlist3 and also iterate line by line	
		for (String s : code) {

			count = 0;
			// System.out.println(s);
			word = s.toString();

			wordlist3 = s.split("[\\s]");

			for (String w : wordlist3) {

				word2 = w.toString().trim();
				tempNid = 1;
				String regex = "(\\w)+";
				Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(word2);

				while (matcher.find()) {
					// System.out.println(matcher.group()+" 2");
					tempNid = 1;
					if (matcher.group().contains("abstract")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 1");
					} else if (matcher.group().contains("assert")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 2");
					} else if (matcher.group().contains("boolean")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 3");
					} else if (matcher.group().contains("break")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 4");
					} else if (matcher.group().contains("byte")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 5");
					} else if (matcher.group().contains("case")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 6");
					} else if (matcher.group().contains("catch")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 7");
					} else if (matcher.group().contains("char")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 8");
					} else if (matcher.group().contains("class")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 9");
					} else if (matcher.group().contains("const")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 10");
					} else if (matcher.group().contains("continue")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 11");
					} else if (matcher.group().contains("default")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 12");
					} else if (matcher.group().contains("do")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 13");
					} else if (matcher.group().contains("double")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 14");
					} else if (matcher.group().contains("else")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 15");
					} else if (matcher.group().contains("enum")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 16");
					} else if (matcher.group().contains("extends")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 17");
					} else if (matcher.group().contains("final")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 18");
					} else if (matcher.group().contains("finally")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 19");
					} else if (matcher.group().contains("float")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 20");
					} else if (matcher.group().contains("for")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 21");
					} else if (matcher.group().contains("goto")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 22");
					} else if (matcher.group().contains("if")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 23");
					} else if (matcher.group().contains("implements")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 24");
					} else if (matcher.group().contains("import")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 25");
					} else if (matcher.group().contains("instanceof")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 26");
					} else if (matcher.group().contains("print")) {
						tempNid = 1;
						//System.out.println(matcher.group());
					} else if (matcher.group().contains("int")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 27");
					} else if (matcher.group().contains("interface")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 28");
					} else if (matcher.group().contains("long")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 29");
					} else if (matcher.group().contains("native")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 30");
					} else if (matcher.group().contains("new")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 31");
					} else if (matcher.group().contains("package")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 32");
					} else if (matcher.group().contains("private")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 33");
					} else if (matcher.group().contains("protected")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 34");
					} else if (matcher.group().contains("public")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 35");
					} else if (matcher.group().contains("return")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 36");
					} else if (matcher.group().contains("short")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 37");
					} else if (matcher.group().contains("static")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 38");
					} else if (matcher.group().contains("strictfp")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 39");
					} else if (matcher.group().contains("super")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 40");
					} else if (matcher.group().contains("switch")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 41");
					} else if (matcher.group().contains("synchronized")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 42");
					} else if (matcher.group().contains("this")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 43");
					} else if (matcher.group().contains("throw")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 44");
					} else if (matcher.group().contains("throws")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 45");
					} else if (matcher.group().contains("transient")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 46");
					} else if (matcher.group().contains("try")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 47");
					} else if (matcher.group().contains("void")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 48");
					} else if (matcher.group().contains("volatile")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 49");
					} else if (matcher.group().contains("while")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 50");
					} else if (matcher.group().contains("true")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 51");
					} else if (matcher.group().contains("false")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 52");
					} else if (matcher.group().contains("0")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 53");
					} else if (matcher.group().contains("1")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 54");
					} else if (matcher.group().contains("2")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 55");
					} else if (matcher.group().contains("3")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 56");
					} else if (matcher.group().contains("4")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 57");
					} else if (matcher.group().contains("5")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 58");
					} else if (matcher.group().contains("6")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 59");
					} else if (matcher.group().contains("7")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 60");
					} else if (matcher.group().contains("8")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 61");
					} else if (matcher.group().contains("9")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 62");
					} else if (matcher.group().contains("String")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 63");
					} else if (matcher.group().contains("args")) {
						tempNid = 0;
						// System.out.println(matcher.group()+" 64");
					} else {
						//System.out.println(matcher.group());
					}

					count += tempNid;

				}

				// Collections.addAll(wordlist2, wordlist3);

			}
			Nid += count;
			//System.out.println("....................................................................");
			valueAccordingtoLine.add(count);
		}
		valueAccordingtoLine.add(Nid);
		System.out.println("value of the identifier array" + valueAccordingtoLine);
		return valueAccordingtoLine;

	}

}
