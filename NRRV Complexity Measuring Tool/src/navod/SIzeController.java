package navod;

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


public int ComplexityDuetoSize(String[] code) {
		
		keywordAndReservedWord = new KeywordAndReservedWord();
		identifiers = new Identifiers();
		operators = new Operators();
		ao = new Operator_Arithmatic();
		numerical_Value = new Numerical_Value();
		stringLiterals = new StringLiterals();
		
		Nkw = keywordAndReservedWord.Complexity(code);
		Nid = identifiers.Complexity(code);
		//Nop = operators.Complexity(code);
		Nop = ao.Complexity(code);
		Nnv = numerical_Value.Complexity(code);
		Nsl = stringLiterals.Complexity(code);
		
		System.out.println("Nkw in size Controller"+ Nkw);
		System.out.println("Nid in size Controller"+ Nid);
		System.out.println("Nop in size Controller"+ Nop);
		System.out.println("Nnv in size Controller"+ Nnv);
		System.out.println("Nsl in size Controller"+ Nsl);
		return 0;
		
	}
	
}
