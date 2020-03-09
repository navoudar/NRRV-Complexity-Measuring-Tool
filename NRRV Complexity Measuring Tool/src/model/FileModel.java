package model;

public class FileModel {
	
	private String filename;

	public FileModel(String filename) {
		
		this.filename = filename;
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

	@Override
	public String toString() {
		return "FileModel [filename=" + filename + "]";
	}
	
	
	
	
	

}
