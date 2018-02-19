package lab1;

public class Chainsaw {
	
	private String model = "no name";
	private double power;
	private double weight;
	private int engineCapacity;
	private double lengthOfTire;
	private static double totalLengthOfTire = 0;
	
	public Chainsaw() {		
	}
	
	public Chainsaw(String model, double power, double weight, int engineCapacity) {
		setModel(model);
		setPower(power);
		setWeight(weight);
		setEngineCapacity(engineCapacity);	
	}
	
	public Chainsaw(String model, double power, double weight, int engineCapacity, double lengthOfTire) {
		setModel(model);
		setPower(power);
		setWeight(weight);
		setEngineCapacity(engineCapacity);
		setLengthOfTire(lengthOfTire);
	}
	
	public String toString() {
		return "Info about chainsaw: \nmodel: " + getModel() 
				+ "\npower: " + getPower() 
				+ "\nweight: " + getWeight() 
				+ "\nengine capacity: " + getEngineCapacity() 
				+ "\nlength of Tire: " + getLengthOfTire()
				+ "\n";	
	}
	
	public static void printStaticSum() {
		System.out.print("Length of tire of all chainsaws is " + totalLengthOfTire + " centimeters\n");
	}
	
	public void printSum() {
		System.out.println("Length of tire of the chainsaw " + getModel() + " is " + getLengthOfTire() + " centimeters\n");
	}
	
	public void resetValues(String model, double power, double weight, int engineCapacity, double lengthOfTire) {
		setModel(model);
		setPower(power);
		setWeight(weight);
		setEngineCapacity(engineCapacity);
		setLengthOfTire(lengthOfTire);
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this. model = model;
	}
	
	public double getPower() {
		return power;
	}
	
	public void setPower(double power) {
		this. power = power;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this. weight = weight;
	}
	
	
	public int getEngineCapacity() {
		return engineCapacity;
	}
	
	public void setEngineCapacity(int engineCapacity) {
		this. engineCapacity = engineCapacity;
	}
	
	
	public double getLengthOfTire() {
		return lengthOfTire;
	}
	
	public void setLengthOfTire(double lengthOfTire) {
		totalLengthOfTire -= this.lengthOfTire;
		totalLengthOfTire += lengthOfTire;
		this.lengthOfTire = lengthOfTire;
	}
}