package controller;
import java.util.Arrays;

import navod.KeywordAndReservedWord;

import navod.SIzeController;
import inheritance.DirectInheritance;
import inheritance.IndirectInheritance;
import inheritance.InheritController;
import inheritance.Inheritance;
import inheritance.com;
import methods.Methodscontroller;

public class MainController {

	String Content[];
	SIzeController sIzeController = new SIzeController();
	//IndirectInheritance inher = new IndirectInheritance();
	InheritController inh = new InheritController();
	//Methodscontroller methodscontroller = new Methodscontroller();
	//com com = new com();
	int Nkw=0;
	int Ninher=0;
	//int Nmethod=0; 
	public void getFileContent(String content[]) { 
		System.out.println("In main conroller");
		Content = content;
	//	System.out.println(Arrays.toString(Content));
		Nkw = sIzeController.ComplexityDuetoSize(content);
		//Ninher = inher.Complexity(content);
		//Ninher = com.Complexity(content);
		Ninher = inh.ComplexityDuetoInheritance(content);
		//Nmethod = methodscontroller.ComplexityDuetoSize(content);
		
	}
	
}
