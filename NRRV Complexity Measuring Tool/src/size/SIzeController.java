package size;

import java.util.ArrayList;
import java.util.List;

public class SIzeController {
int Cs = 0;
int Wkw = 1;
int Nkw = 0;
int Wid = 1;
int Nid = 0;
int Wop = 1;
int Nop = 0;
int	Wnv = 1;
int	Nnv = 0;
int Wsl = 1;
int Nsl = 0;

KeywordAndReservedWord keywordAndReservedWord;
Identifiers identifiers;
Operators operators;
Operator_Arithmatic ao ;
Numerical_Value numerical_Value;
StringLiterals stringLiterals;

List<Integer> keywordArray = new ArrayList<>();
List<Integer> identifiersArray = new ArrayList<>();
List<Integer> operatorArray = new ArrayList<>();
List<Integer> numericalArray = new ArrayList<>();
List<Integer> stringArray = new ArrayList<>();
List<Integer> TotalSizeComplexityArray = new ArrayList<>();


List<Integer> nop = new ArrayList<>();

public int ComplexityDuetoSize(String[] code) {
		
		keywordAndReservedWord = new KeywordAndReservedWord();
		identifiers = new Identifiers();
		operators = new Operators();
		ao = new Operator_Arithmatic();
		numerical_Value = new Numerical_Value();
		stringLiterals = new StringLiterals();
		
	//	Nkw = keywordAndReservedWord.Complexity(code);
	//	Nid = identifiers.Complexity(code);
		//Nop = operators.Complexity(code);
	//	Nop = operators.Complexity(code);
		//nop = operators.Complexity(code);
	//	Nnv = numerical_Value.Complexity(code);
	//	Nsl = stringLiterals.Complexity(code);
		
		
		keywordArray = keywordAndReservedWord.Complexity(code);
		identifiersArray = identifiers.Complexity(code);
		numericalArray = numerical_Value.Complexity(code);
		operatorArray = operators.Complexity(code);
		stringArray =  stringLiterals.Complexity(code);
		
		for(int i = 0 ; i < keywordArray.size() ; i++) {
			TotalSizeComplexityArray.add(keywordArray.get(i) + identifiersArray.get(i) + numericalArray.get(i) + operatorArray.get(i) + stringArray.get(i));
		}
		System.out.println("Total Size Complexity " + TotalSizeComplexityArray);
		System.out.println("Nkw in size Controller"+ keywordArray.get(keywordArray.size() - 1));
		System.out.println("Nid in size Controller"+ identifiersArray.get(identifiersArray.size() - 1));
		System.out.println("Nop in size Controller"+ operatorArray.get(operatorArray.size() - 1));
		System.out.println("Nnv in size Controller"+ numericalArray.get(numericalArray.size() - 1));
		System.out.println("Nsl in size Controller"+ stringArray.get(stringArray.size() - 1));
		return 0;
		
	}
	
}
