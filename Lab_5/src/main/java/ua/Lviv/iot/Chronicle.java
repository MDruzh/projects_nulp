package ua.Lviv.iot;

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

    public String getHeaders() {
        return super.getHeaders() + "," + "numberOfPages";
    }

    public String toCVS() {
        return super.toCVS() + "," + getNumberOfPages();
    }

    @Override
    public String toString() {
        return super.toString() + ", number of pages: " + this.numberOfPages + "\n";
    }
}