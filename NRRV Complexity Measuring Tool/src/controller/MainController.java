package controller;
import java.util.Arrays;
public class MainController {

	String Content[];
	public void getFileContent(String content[]) {
		System.out.println("In main conroller");
		Content = content;
		System.out.println(Arrays.toString(Content));
		
	}
	
}
