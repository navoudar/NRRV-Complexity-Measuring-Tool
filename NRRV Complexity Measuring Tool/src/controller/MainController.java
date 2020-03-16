package controller;
import java.util.Arrays;

import navod.KeywordAndReservedWord;

import navod.SIzeController;
import inheritance.IndirectInheritance;
import inheritance.Inheritance;

public class MainController {

	String Content[];
	SIzeController sIzeController = new SIzeController();
	IndirectInheritance inher = new IndirectInheritance();
	int Nkw=0;
	int Ninher=0;
	public void getFileContent(String content[]) {
		System.out.println("In main conroller");
		Content = content;
	//	System.out.println(Arrays.toString(Content));
		Nkw = sIzeController.ComplexityDuetoSize(content);
		Ninher = inher.Complexity(content);
		
	}
	
}
