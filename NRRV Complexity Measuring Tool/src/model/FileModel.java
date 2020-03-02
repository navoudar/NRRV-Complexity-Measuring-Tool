package model;

public class FileModel {
	
	private String filename;

	public FileModel(String filename) {
		
		this.filename = filename;
	}

	public FileModel() {
		
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "FileModel [filename=" + filename + "]";
	}
	
	
	
	
	

}
