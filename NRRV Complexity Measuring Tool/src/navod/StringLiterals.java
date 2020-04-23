package navod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLiterals {
	int Nst = 0;
	int tempNst = 0;
	List<Integer> valueAccordingtoLine = new ArrayList<>();
	List<String> wordlist = new ArrayList<String>();
	String word;

	public int Complexity(String[] code) {

		wordlist = Arrays.asList(code);

		for (String s : code) {

			word = s.toString().trim();
			tempNst = 0;

			String data1 = word;

			String regex = "[\"]\\b|[\"] |\"{2}";
			// System.out.println(word);
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(data1);
			while (matcher.find()) {

				tempNst = 1;
				// System.out.print("Start index: " + matcher.start());
				// System.out.print(" End index: " + matcher.end() + " ");
				// System.out.println(matcher.group());

				Nst += tempNst;

			}

			valueAccordingtoLine.add(tempNst);

		}
		System.out.println("value of the string literal array" + valueAccordingtoLine);
		return Nst;
	}

}
