

public class mailcourse {

	public static void main(String[] args) {
		Course course = new Course();
		//Studend(String name1,String sarname,int age,int phone,String address,int room,double alcohol,String group)
		course.addPeople(new Studend("Vasil","Lomachenko",21,2217671,"Koss-Anatolskogo street",201,98,"qym"));
		course.addPeople(new Studend("Stepan","Koval",21,2217631,"Koss-Anatolskogo street",123,100,"qym"));
		course.addPeople(new Studend("Igor","Nesevich",21,2456275,"Koss-Anatolskogo street",123,0,"qym"));
		//Teachers(String name1,String sarname,int age,int phone,String address,String predmet,int sallary)
		course.addPeople(new Teacher("Bob","Petrovich",35,2214571,"Kolomiyska street","math",3000));
		course.addPeople(new Teacher("Vira","Ivanovna",88,2214585,"polubotka street","Geography",3000));
		//Professor(String name1,String sarname,int age,int phone,String address,String predmet,int sallary,int nomCab,String works)
		course.addPeople( new Professor("Jeyson","Stethem",45,2202020,"Chervona Kalina street","math",7000,701,"the dissertation doctoral"));
		course.printPeoples();
	}
	

}
