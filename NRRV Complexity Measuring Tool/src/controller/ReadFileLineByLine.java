package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.FileModel;

public class ReadFileLineByLine {
	public String[] file(String filePath) throws FileNotFoundException {
		FileModel fm = new FileModel();
		String token1 = "";
		String[] token2= null ;
		 Scanner inFile1 = new Scanner(new File(filePath)).useDelimiter("\n\\s*");
		 List<String> temps = new ArrayList<String>();
		
		// while loop
		    while (inFile1.hasNext()) {
		      // find next line
		      token1 = inFile1.next();
		      token2 = token1.split(" ");
		      temps.add(token1);
		      
		    }
		    inFile1.close();

		    String[] tempsArray = temps.toArray(new String[0]);
		    
		    fm.setFileContent(token2);
		    //System.out.println(temps.toString());
		    return tempsArray;
			
	}

}
