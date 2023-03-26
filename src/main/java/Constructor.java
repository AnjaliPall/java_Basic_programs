
public class Constructor {
    private int modelYear;
     private String modelName;
     
     public Constructor(int year,String name) {
    	this.modelYear= year;
    	this.modelName = name;
     }
     
	
	public int getModelYear() {
		return modelYear;
	}


	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public static void main(String[] args) {
	Constructor cons1 = new Constructor(24,"Alice");
	System.out.println(cons1.modelName +" "+ cons1.modelYear);
	

	}

}
