package lab1;

public class Main {

	public static void main(String[] args) {
		
		Chainsaw chainsawTatra = new Chainsaw();
		Chainsaw chainsawForesta = new Chainsaw("Foresta", 2800, 7, 45, 45);
		Chainsaw chainsawGruhnhelm = new Chainsaw("Gruhnhelm", 2300, 5, 38, 35);
		
		System.out.println(chainsawTatra.toString());
		System.out.println(chainsawForesta.toString());
		System.out.println(chainsawGruhnhelm.toString());
		
		Chainsaw.printStaticSum();
		chainsawGruhnhelm.printSum();
		
		chainsawTatra.resetValues("Tatra", 3500, 7, 50, 45);
		chainsawGruhnhelm.resetValues("Gruhnhelm", 2200, 5, 36, 35);
		chainsawForesta.setLengthOfTire(15);
		
		System.out.println(chainsawTatra.toString());
		System.out.println(chainsawForesta.toString());
		System.out.println(chainsawGruhnhelm.toString());
		
		Chainsaw.printStaticSum();
		chainsawTatra.printSum();

	}

}