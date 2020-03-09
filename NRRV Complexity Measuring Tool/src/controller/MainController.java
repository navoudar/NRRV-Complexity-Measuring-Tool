package controller;
import java.util.Arrays;

import navod.KeywordAndReservedWord;
public class MainController {

	String Content[];
	KeywordAndReservedWord kwrw = new KeywordAndReservedWord();
	public void getFileContent(String content[]) {
		System.out.println("In main conroller");
		Content = content;
	//	System.out.println(Arrays.toString(Content));
		kwrw.Complexity(Content);
	}
	
}
