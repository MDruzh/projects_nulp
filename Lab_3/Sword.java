package ua.lviv.iot;

public class Sword extends Exhibit{
    private double swordLength;
    
    public Sword() {
    	
    }
     public Sword(ExhibitName name, ExhibitAge age, String kindOfArt, String placeOfManufacture, String condition, double weight, double swordLength) {
    	     super(name, age, kindOfArt, placeOfManufacture, condition, weight);
    	     this.swordLength = swordLength;
     }
	public double getSwordLength() {
		return swordLength;
	}
	public void setSwordLength(double swordLength) {
		this.swordLength = swordLength;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", sword length: " + this.swordLength + "\n";
	}
     
}
