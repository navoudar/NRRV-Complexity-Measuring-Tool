package model;

import java.util.Arrays;

public class FileModel {
	
	private String filename;
	
	private String fileContent[];

	public FileModel(String filename, String[] fileContent) {
		super();
		this.filename = filename;
		this.fileContent = fileContent;
	}
	
	


	public FileModel(String[] fileContent) {
		super();
		this.fileContent = fileContent;
	}




	public FileModel() {
		System.out.println("In model");
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		System.out.println("In model"+filename);
		this.filename = filename;
	}

	public String[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(String[] fileContent) {
		this.fileContent = fileContent;
	}




	@Override
	public String toString() {
		return "FileModel [filename=" + filename + ", fileContent=" + Arrays.toString(fileContent) + "]";
	}

	
	
	
	
	
	

}
