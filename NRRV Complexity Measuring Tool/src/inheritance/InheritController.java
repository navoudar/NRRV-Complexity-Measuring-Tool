package inheritance;

import size.Identifiers;
import size.KeywordAndReservedWord;
import size.Operator_Arithmatic;
import size.Operators;

public class InheritController {
	/*int Cs = 0;
	int Wkw = 1;
	int Nkw = 0;
	int Wid = 1;
	int Nid = 0;
	int Wop = 1;
	int Nop = 0;
	int	Wnv = 1;
	int	Nnv = 0;
	int Wsl = 1;
	int Nsl = 0;*/
	
	int Ci=0;
	int Nin=0;
	int Win=1;

	/*KeywordAndReservedWord keywordAndReservedWord;
	Identifiers identifiers;
	Operators operators;
	Arithmatic_Operator ao ;*/
	
	//com com;
	IndirectInheritance IndirectInheritance;


	public int ComplexityDuetoSize(String[] code) {
			
			/*keywordAndReservedWord = new KeywordAndReservedWord();
			identifiers = new Identifiers();
			operators = new Operators();
			ao = new Arithmatic_Operator();*/
		
			//com = new com();
			IndirectInheritance = new IndirectInheritance();
			
			/*Nkw = keywordAndReservedWord.Complexity(code);
			Nid = identifiers.Complexity(code);
			//Nop = operators.Complexity(code);
			Nop = ao.Complexity(code);*/
			
			//Nin = com.Complexity(code);
			Nin = IndirectInheritance.Complexity(code);
			
			/*System.out.println("Nkw in size Controller"+ Nkw);
			System.out.println("Nid in size Controller"+ Nid);
			System.out.println("Nop in size Controller"+ Nop);
			return 0;*/
			
			System.out.println("Nin in inherit controller:"+ Nin);
			return 0;
			
		}
		
}
