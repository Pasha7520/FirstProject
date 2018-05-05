package Hostel;

public class Main {

	public static void main(String[] args) {
		Hostel Hl = new Hostel(16);
		Client c1 = new Client("Ivan","petrovish","Vlasov", "men", Date.addDate(21, 10, 1991),202,2225489);
		Client c2 = new Client("Ivanka","petrovna","Vlasova", "women", Date.addDate(4, 5, 1992),201,2225489);
		Client c3 = new Client("Volodimir","Ivanovish","Rembo", "men", Date.addDate(11, 1, 1990),102,2225489);
		Client c4 = new Client("Lida","petrovna","Vlasov", "women", Date.addDate(18, 11, 1989),104,2225489);
		Client c5 = new Client("Vasislina","Pavlovna","Rovin", "women", Date.addDate(11, 3, 1993),301,2225489);
		Hl.addClient(c1);
		Hl.addClient(c2);
		Hl.addClient(c3);
		Hl.addClient(c4);
		Hl.addClient(c5);
		Hl.addClient(c5);
		///////////////////////////////
	
		Hl.print();
		System.out.println("-------------------------------");
		Hl.findWomen();
		System.out.println("-------------------------------");
		Hl.findOld(1990);
		System.out.println("-------------------------------");
		Hl.setClient(c5, 0);
		Hl.print();

		}
	}