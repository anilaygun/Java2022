package kodlamaioWithNLayerApp.entities;

public class Educator {
	private int educatorId;
	private String fName;
	private String lName;
	
	public Educator() {
		
	}

	public Educator(int educatorId, String fName, String lName) {
		this.educatorId = educatorId;
		this.fName = fName;
		this.lName = lName;
	}

	public int getEducatorId() {
		return educatorId;
	}

	public void setEducatorId(int educatorId) {
		this.educatorId = educatorId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	
	
	
	
	
	
	
}
