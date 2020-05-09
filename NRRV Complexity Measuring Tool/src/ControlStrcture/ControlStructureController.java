package ControlStrcture;

public class ControlStructureController {
	int Cs = 0;
	int Wcc = 2;
	int NCc = 0;
	int Wci = 3;
	int NCi = 0;
	int Wcs = 2;
	int NCs = 0;
	

	ConditionalControlStructure conditional;
	IterativeControlStructure iterative;
	SwitchControlStructure switchcontrol;
	
	


	public int ComplexityDuetoControlStructure(String[] code) {
			
		conditional = new ConditionalControlStructure();
		iterative = new IterativeControlStructure();
		switchcontrol = new SwitchControlStructure();
		
			NCc = conditional.Complexity(code);
			NCi = iterative.Complexity(code);
			NCs = switchcontrol.Complexity(code);
			
			System.out.println("Weight of condtional control structure "+Wcc);
			System.out.println("Weight of iterative control structure "+Wci);
			System.out.println("Weight of switch control structure "+Wcs);
			
			System.out.println("Number of conditional control structure"+ NCc);
			System.out.println("Number of iterative control structure"+ NCi);
			System.out.println("Number of switch control structure"+ NCs);
			
			System.out.println("Ccs of conditional control structure"+ NCc*Wcc);
			System.out.println("Ccs of iterative control structure"+ NCi*Wci);
			System.out.println("Ccs of switch control structure"+ NCs*Wcs);
			
			return 0;
			
		}
}
