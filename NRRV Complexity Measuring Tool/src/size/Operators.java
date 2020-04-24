package size;

import java.util.ArrayList;


import java.util.List;

import model.FileModel;

public class Operators {
int Nop =0;
int empNop = 0;
int Naop = 0;
int Nrop = 0;
int Nlop =  0;
int Nbop = 0;
int Nmop = 0;
int NAsop = 0;
List<Integer> valueAccordingtoLine = new ArrayList<>();
List<String> wordlist = new ArrayList<String>();
List<String> wordlist2 = new ArrayList<String>();
String[] wordsInFile;
String tempword;
String tempword2;
FileModel fm = new FileModel();


List<Integer> arithmaticArray = new ArrayList<>();
List<Integer> relationArray = new ArrayList<>();
List<Integer> logicalArray = new ArrayList<>();
List<Integer> bitwiseArray = new ArrayList<>();
List<Integer> miscellaneousArray = new ArrayList<>();
List<Integer> assignmentArray = new ArrayList<>();
List<Integer> totalOperatorArray = new ArrayList<>();


Operator_Arithmatic arithmatic_Operator = new Operator_Arithmatic();
Operators_Relation operators_Relation = new Operators_Relation();
Operators_Logical operators_Logical = new Operators_Logical();
Operators_Bitwise operators_Bitwise = new Operators_Bitwise();
Operators_Miscellaneous operators_Miscellaneous = new Operators_Miscellaneous();
Operators_Assignment operators_Assignment = new Operators_Assignment();

int arraySize = 0;
	public List<Integer> Complexity(String[] code) {
		
		Naop = arithmatic_Operator.Complexity2(code);
		Nrop = operators_Relation.Complexity2(code);
		Nlop = operators_Logical.Complexity2(code);
		Nbop = operators_Bitwise.Complexity2(code);
		Nmop = operators_Miscellaneous.Complexity2(code);
		NAsop = operators_Assignment.Complexity2(code);
		
		
		
		arithmaticArray = arithmatic_Operator.Complexity(code);
		relationArray = operators_Relation.Complexity(code);
		logicalArray = operators_Logical.Complexity(code);
		bitwiseArray = operators_Bitwise.Complexity(code);
		miscellaneousArray = operators_Miscellaneous.Complexity(code);
		assignmentArray = operators_Assignment.Complexity(code);
	
		for(int i=0;i<arithmaticArray.size();i++) {
			
			totalOperatorArray.add(arithmaticArray.get(i) + relationArray.get(i) + logicalArray.get(i) + bitwiseArray.get(i) + miscellaneousArray.get(i) + assignmentArray.get(i));
		}
		
		System.out.println("Total operators array"+ totalOperatorArray);
		
		
		Nop = Naop + Nrop + Nlop + Nbop + Nmop + NAsop;
		totalOperatorArray.add(Nop);
		return totalOperatorArray;
		
	}
	
}
