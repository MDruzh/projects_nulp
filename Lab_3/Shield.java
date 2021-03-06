package ua.lviv.iot;

public class Shield extends Exhibit{
    private String shape;
    
    public Shield() {
    	
    }
     public Shield(ExhibitName name, ExhibitAge age, String kindOfArt, String placeOfManufacture, String condition, double weight, String shape) {
    	     super(name, age, kindOfArt, placeOfManufacture, condition, weight);
    	     this.shape = shape;
     }
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", shape: " + this.shape + "\n";
	}
}
