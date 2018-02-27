package ua.lviv.iot;

public class Chronicle extends Exhibit{
    private int  numberOfPages;
    
    public Chronicle() {
    	
    }
     public Chronicle(ExhibitName name, ExhibitAge age, String kindOfArt, String placeOfManufacture, String condition, double weight, int numberOfPages) {
    	     super(name, age, kindOfArt, placeOfManufacture, condition, weight);
    	     this.numberOfPages = numberOfPages;
     }
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	} 
	
	@Override
	public String toString() {
		return super.toString() + ", number of pages: " + this.numberOfPages + "\n";
	}
}
