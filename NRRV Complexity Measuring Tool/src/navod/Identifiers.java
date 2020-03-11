package navod;

import java.util.ArrayList;
import java.util.List;

public class Identifiers {
	int Nid = 0 ;
	int tempNid = 0 ;
	List<Integer> valueAccordingtoLine = new ArrayList<>();	
	
	public int Complexity(String[] code) {
		
		for(String s : code) {
			// check the class
			if(s.startsWith("class") || s.startsWith("public class") || s.startsWith("private class") || s.startsWith("protected class") || s.contains("class")) {
				tempNid  += 1;
				
			}if(s.startsWith("public static void") ||s.startsWith("private static void") ||s.startsWith("protected static void") ||s.startsWith("public static int") ||s.startsWith("private static int") ||s.startsWith("protected static int") ||s.startsWith("public static String") ||s.startsWith("private static String") ||s.startsWith("protected static String") ||s.startsWith("public static boolean") ||s.startsWith("private static boolean") ||s.startsWith("protected static boolean") ||s.startsWith("public static char") ||s.startsWith("private static char") ||s.startsWith("protected static char") ||s.startsWith("public static short") ||s.startsWith("private static short") ||s.startsWith("protected static short") ||s.startsWith("public static long") ||s.startsWith("private static long") ||s.startsWith("protected static long") ||s.startsWith("public static float") ||s.startsWith("private static float") ||s.startsWith("protected static float") ||s.startsWith("public static double") ||s.startsWith("private static double") ||s.startsWith("protected static double") || s.contains("public int")|| s.contains("public string")|| s.contains("public boolean")|| s.contains("public char")|| s.contains("public short")|| s.contains("public long")|| s.contains("public float")|| s.contains("public double")|| s.contains("public byte") || s.contains("private int")|| s.contains("private string")|| s.contains("private boolean")|| s.contains("private char")|| s.contains("private short")|| s.contains("private long")|| s.contains("private float")|| s.contains("private double")|| s.contains("private byte")|| s.contains("protected int")|| s.contains("protected string")|| s.contains("protected boolean")|| s.contains("protected char")|| s.contains("protected short")|| s.contains("protected long")|| s.contains("protected float")|| s.contains("protected double")|| s.contains("protected byte")) {
				tempNid += 1;
			}
			
			
			valueAccordingtoLine.add(tempNid);
			tempNid = 0;
		}
		Nid += tempNid;
		
		
		System.out.println("vaue of array"+valueAccordingtoLine);
		
		
		return Nid;
		
	}

}
