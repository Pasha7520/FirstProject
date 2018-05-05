package Man;

public class Main {

	public static void main(String[] args) {
		Train LvivMoskva = new Train(10);
		Wagon w = new Wagon();
		Person p1 = new Person("Jonni",25,"men",90);
		Person p2 = new Person("Jenny",22,"women",60);
		Person p3 = new Person("Jessy",28,"women",55);
		Person p4 = new Person("Rick",24,"men",80);
		Student s1 = new Student("Stiv",23,"men",77,2010);
		Student s2 = new Student("Lola",33,"women",62,2001);
		Student s3 = new Student("Stella",26,"women",58,2008);
		Student s4 = new Student("Sten",22,"men",82,2011);
		LvivMoskva.takePlace(p1);
		LvivMoskva.takePlace(p2);
		LvivMoskva.takePlace(p3);
		LvivMoskva.takePlace(p4);
		LvivMoskva.takePlace(p1);
		LvivMoskva.takePlace(p2);
		LvivMoskva.takePlace(p3);
		LvivMoskva.takePlace(p4);
		LvivMoskva.takePlace(p1);
		LvivMoskva.takePlace(p2);
		LvivMoskva.takePlace(p3);
		LvivMoskva.takePlace(p4);
	}

}
