package ua.lviv.iot;

public abstract class Exhibit {
	
	private ExhibitName name;
	private ExhibitAge age;
    private String kindOfArt;
    private String placeOfManufacture;
    private String condition;
    private double weight;
    
    public Exhibit() {
    	
    }
    
    public Exhibit(ExhibitName name, ExhibitAge age, String kindOfArt, String placeOfManufacture, String condition, double weight) {
    	    this.name = name;
    	    this.age = age;
    	    this.kindOfArt = kindOfArt;
    	    this.placeOfManufacture = placeOfManufacture;
    	    this.condition = condition;
    	    this.weight = weight;
    }
    
    public Exhibit(ExhibitName name, ExhibitAge age) {
    	    this.name = name;
    	    this.age = age;
    }
    
    public ExhibitName getName() {
    	    return name;
    }
    
    public void setName(ExhibitName name) {
    	    this.name=name;
    }
    
    public int getAge() {
    	    if(this.age == ExhibitAge.FIVEBC) {
    	    	 return 5;
    	    }
    	    else if(this.age == ExhibitAge.SIXBC) {
    	    		return 6;
    	    }
    	    else if (this.age == ExhibitAge.SEVENBC) {
    	    		return 7;
    	    }
    	    else {
    	    		return 8;
    	    }
    }
    
    public void setAge(ExhibitAge age) {
    	    this.age = age;
    }
    
    public String getKindOfArt() {
    	    return kindOfArt;
    }
    
	public void setKindOfArt(String kindOfArt) {
		this.kindOfArt = kindOfArt;
	}

	public String getPlaceOfManufacture() {
		return placeOfManufacture;
	}

	public void setPlaceOfManufacture(String placeOfManufacture) {
		this.placeOfManufacture = placeOfManufacture;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return   " Name: " + this.name + ", age: " +
	    this.age + ", kind of art: " +
	    this.kindOfArt + ", place of manufacture: " +
	    this.placeOfManufacture + ", condition: " +
	    this.condition + ", weight: " +
	    this.weight;
	}
    
}
