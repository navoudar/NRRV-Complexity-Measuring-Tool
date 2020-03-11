package controller;
import java.util.Arrays;

import navod.KeywordAndReservedWord;

import navod.SIzeController;

import inheritance.Inheritance;

public class MainController {

	String Content[];
	SIzeController sIzeController = new SIzeController();
	int Nkw=0;
	public void getFileContent(String content[]) {
		System.out.println("In main conroller");
		Content = content;
	//	System.out.println(Arrays.toString(Content));
		Nkw = sIzeController.ComplexityDuetoSize(content);
		
	}
	
}
