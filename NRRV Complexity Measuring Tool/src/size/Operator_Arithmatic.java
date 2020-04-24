package size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class Operator_Arithmatic {
	int Naop = 0;
	int tempNaop = 0;
	int count = 0;
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	List<String> wordlist = new ArrayList<String>();
	String[] wordlist3;
	String word;
	String word2;
	boolean test;

	public int Complexity2(String[] code) {

		wordlist = Arrays.asList(code);

		for (String s : code) {
			word = s.toString().trim();
			tempNaop = 0;

			wordlist3 = s.split("\\s");

			for (String w : wordlist3) {

				word2 = w.toString().trim();

				tempNaop = 1;

				String regex = "\\+[+]|\\+[=]|\\=[+]|\\+|\\-[-]|\\-[=]|\\=[-]|\\-|\\*[=]|\\=[*]|\\*|\\/[=]|\\=[/]|\\/|\\%[=]|\\=[%]|\\%";

				Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(word2);
				while (matcher.find()) {
					tempNaop = 0;
					if (matcher.group().startsWith("+") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found +=");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("+")) {
						// System.out.println(matcher.group()+"found =+");
						tempNaop = 0;
					} else if (matcher.group().startsWith("+") && matcher.group().endsWith("+")) {
						// System.out.println(matcher.group()+"found ++ and +");
						tempNaop = 1;
					}
					if (matcher.group().startsWith("-") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found -=");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("-")) {
						// System.out.println(matcher.group()+"found =-");
						tempNaop = 0;
					} else if (matcher.group().startsWith("-") && matcher.group().endsWith("-")) {
						// System.out.println(matcher.group()+"found -- and -");
						tempNaop = 1;
					}
					if (matcher.group().startsWith("*") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found -*");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("*")) {
						// System.out.println(matcher.group()+"found *-");
						tempNaop = 0;
					} else if (matcher.group().contentEquals("*")) {
						// System.out.println(matcher.group()+"found *");
						tempNaop = 1;
					}
					if (matcher.group().startsWith("/") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found /=");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("/")) {
						// System.out.println(matcher.group()+"found =/");
						tempNaop = 0;
					} else if (matcher.group().contentEquals("/")) {
						// System.out.println(matcher.group()+"found /");
						tempNaop = 1;
					}
					if (matcher.group().startsWith("%") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found %=");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("%")) {
						// System.out.println(matcher.group()+"found =%");
						tempNaop = 0;
					} else if (matcher.group().contentEquals("%")) {
						// System.out.println(matcher.group()+"found %");
						tempNaop = 1;
					}

					count += tempNaop;
				}

			}
			Naop += count;
			// valueAccordingtoLine.add(count);
			count = 0;
		}

		// System.out.println("value of the arithmatic operator
		// array"+valueAccordingtoLine);
		return Naop;
	}

	public List<Integer> Complexity(String[] code) {
		int total = 0;
		wordlist = Arrays.asList(code);

		for (String s : code) {
			word = s.toString().trim();
			tempNaop = 0;

			wordlist3 = s.split("\\s");

			for (String w : wordlist3) {

				word2 = w.toString().trim();

				tempNaop = 1;

				String regex = "\\+[+]|\\+[=]|\\=[+]|\\+|\\-[-]|\\-[=]|\\=[-]|\\-|\\*[=]|\\=[*]|\\*|\\/[=]|\\=[/]|\\/|\\%[=]|\\=[%]|\\%";

				Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(word2);
				while (matcher.find()) {
					tempNaop = 0;
					if (matcher.group().startsWith("+") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found +=");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("+")) {
						// System.out.println(matcher.group()+"found =+");
						tempNaop = 0;
					} else if (matcher.group().startsWith("+") && matcher.group().endsWith("+")) {
						// System.out.println(matcher.group()+"found ++ and +");
						tempNaop = 1;
					}
					if (matcher.group().startsWith("-") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found -=");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("-")) {
						// System.out.println(matcher.group()+"found =-");
						tempNaop = 0;
					} else if (matcher.group().startsWith("-") && matcher.group().endsWith("-")) {
						// System.out.println(matcher.group()+"found -- and -");
						tempNaop = 1;
					}
					if (matcher.group().startsWith("*") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found -*");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("*")) {
						// System.out.println(matcher.group()+"found *-");
						tempNaop = 0;
					} else if (matcher.group().contentEquals("*")) {
						// System.out.println(matcher.group()+"found *");
						tempNaop = 1;
					}
					if (matcher.group().startsWith("/") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found /=");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("/")) {
						// System.out.println(matcher.group()+"found =/");
						tempNaop = 0;
					} else if (matcher.group().contentEquals("/")) {
						// System.out.println(matcher.group()+"found /");
						tempNaop = 1;
					}
					if (matcher.group().startsWith("%") && matcher.group().endsWith("=")) {
						// System.out.println(matcher.group()+"found %=");
						tempNaop = 0;
					} else if (matcher.group().startsWith("=") && matcher.group().endsWith("%")) {
						// System.out.println(matcher.group()+"found =%");
						tempNaop = 0;
					} else if (matcher.group().contentEquals("%")) {
						// System.out.println(matcher.group()+"found %");
						tempNaop = 1;
					}

					count += tempNaop;
				}

			}
			total += count;
			valueAccordingtoLine.add(count);
			count = 0;

		}
		valueAccordingtoLine.add(total);
		System.out.println("value of the arithmatic operator array" + valueAccordingtoLine);
		return valueAccordingtoLine;
	}

}
