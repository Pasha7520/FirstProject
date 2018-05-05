package continent;

public class main {

	public static void main(String[] args) {
		Europa europa = new Europa(34000,45,100000);
		europa.setArea(99000);
		europa.setNumCountry(68);
		Asia asia = new Asia(2300,33,123233);
		asia.setGeneralPopulation(350000000);
		asia.setArea(35000000);
		asia.printArea();
		europa.printnumCountry();
	}

}
