package ua.lviv.iot;

public class Clothes extends Exhibit{
    private String material;
    
    public Clothes() {
    	
    }
     public Clothes(ExhibitName name, ExhibitAge age, String kindOfArt, String placeOfManufacture, String condition, double weight, String material) {
    	     super(name, age, kindOfArt, placeOfManufacture, condition, weight);
    	     this.material = material;
     }
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", material: " + this.material  + "\n";
	}
}
