package Toys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Sort  {
	public static class SortToys implements Comparable<Toys>{
		@Override
		public int compareTo(Toys arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	public static ArrayList<Toy> sortArray(ArrayList<Toy> fa,int age){
		ArrayList<Toy> list = new ArrayList<Toy>();
		Toy t = new Toy();
		for(int i =0;i < fa.size();i++){
			for(int j=0; j < fa.size()-1;j++){
				if(fa.get(j).getPrice() > fa.get(j+1).getPrice()){
					t = fa.get(j+1);
					fa.set(j+1, fa.get(j));
					fa.set(j, t);
				}
			}
		}
		for(Toy tt: fa){
			if(tt.getAgeLimitsMin()<=age && tt.getAgeLimitsMax()>=age)
			list.add(tt)	;
			}
		return list;
	}
	public static void sort1(ArrayList<Toy> ar,int age){
		ArrayList<Toy> toys = new ArrayList();	
		for(Toy tt:ar){
			if(tt.getAgeLimitsMin() <= age && tt.getAgeLimitsMax() >= age){
				toys.add(tt);
			}
		}
	Collections.sort(toys, new Comparator<Toy>(){
		public int compare(Toy t1 , Toy t2){
			if(((Integer)t1.getPrice()).compareTo((Integer)t2.getPrice())==0){
				return ((Integer)t2.getAgeLimitsMin())-((Integer)t1.getAgeLimitsMin());
			}
			else return ((Integer)t1.getPrice()).compareTo((Integer)t2.getPrice());
		}
	});
	
	for(Toy tt:toys){
		System.out.println(tt);
	}
	
		
		
		
	}
	
	public static void comparableDefault(ArrayList<Toy> ar){
	Collections.sort(ar);
	for(Toy d:ar){
		System.out.println(d);
	}
	}
	public static void sort2(ArrayList<Toy> ar){
		for(Toy t: ar){
			int a = t.getPrice()*27;
			t.setPrise(a);
		}
		Collections.sort(ar);
		for(Toy t:ar){
			String a =t.toStringGrn();
				if(a.matches("(.*)desingner(.*)")){
					System.out.println(t.toStringGrn());
				}
				
			
		}
		
	}
	public static void sort3(ArrayList<Toy> ar){
		int maxPrice = 0;
		Collections.sort(ar,new Comparator<Toy>(){

			public int compare(Toy o1, Toy o2) {
				
				return (Integer)o2.getPrice()-(Integer)o1.getPrice();
			}
			
		});
		Toy toy = ar.get(0);
		maxPrice = toy.getPrice();
		for(Toy t:ar){
			if(maxPrice-t.getPrice() < 10){
				System.out.println(t.toString());
			}
		}
	}
	public static void sort4(ArrayList<Toy> ar,int min,int max){
		Collections.sort(ar);
		for(Toy t:ar){
			if(min >= t.getAgeLimitsMin() && max <= t.getAgeLimitsMax()){
				System.out.println(t);
			}
		}
	}
	public static void sort5(ArrayList<Toy> ar,String s){
		int grn = 0;
		for(Toy t : ar){
			grn = t.getPrice()*27;
			t.setPrise(grn);
		}
		Collections.sort(ar,new Comparator<Toy>(){
			public int compare(Toy t1,Toy t2){
				return t1.getPrice()-t2.getPrice();
			}
		});
		String s1 = "(.*)"+s+"(.*)";
		for(Toy t:ar){
			
			if(t.toStringGrn().matches(s1)){
				System.out.println(t);
			}
		}
	
	}
	public static void sort6(ArrayList<Toy> ar,String s ,int a){
		Collections.sort(ar,new Comparator<Toy>(){
			public int compare(Toy t1, Toy t2) {
				return t2.getPrice()-t1.getPrice();
			}
		});
		String s1 = "(.*)"+s+"(.*)";
		for(Toy t:ar){
			if(!(t.toString().matches(s1))&&t.getAgeLimitsMin() <= a && t.getAgeLimitsMax() >=a){
				System.out.println(t);
			}
		}
		
	}
	public static void sort7(ArrayList<Toy> ar,String s,int price,int min,int max){
		ArrayList<Ball> ab = new ArrayList<Ball>();
		String s1 = "(.*)"+s+"(.*)";
		for(Toy t:ar){
			if(t.toString().matches(s1) && price >= t.getPrice() && t.getAgeLimitsMin()<=min && max <= t.getAgeLimitsMax()){
				
				String strings []= t.toString().split(" ");
				int weight = Integer.parseInt(strings[strings.length-1]);
				Ball b = new Ball(t.getPrice(),t.getAgeLimitsMin(),t.getAgeLimitsMax(),weight);
				ab.add(b);
			}
		}
		Collections.sort(ab,new Comparator<Ball>(){
			public int compare(Ball o1, Ball o2) {
				
				
				return o1.getWeight()-o2.getWeight();
			}
			
		});
		for(Ball b:ab){
			System.out.println(b);
		}
	}
	public static void sort8(ArrayList<Toy> ar,String s, int age,int lon){
		ArrayList<Doll> ad = new ArrayList<Doll>();
		String s1 = "(.*)"+s+"(.*)";
		for(Toy t : ar){
			if(t.toString().matches(s1) && age >=t.getAgeLimitsMin() && age <= t.getAgeLimitsMax()){
				String strings [] = t.toString().split(" ");
				int lon1 = Integer.parseInt(strings[strings.length-1]);
				if(lon1 <=lon){
					Doll d = new Doll(t.getPrice(),t.getAgeLimitsMin(),t.getAgeLimitsMax(),lon1);
					ad.add(d);
				}
			}
		}
		Collections.sort(ad,new Comparator<Doll>(){

			@Override
			public int compare(Doll d1, Doll d2) {
				// TODO Auto-generated method stub
				return d1.getLon()-d2.getLon();
			}
			
		});
		for(Doll d :ad){
			System.out.println(d);
		}
		
		
		
		
	}
	public static void sort9(ArrayList<Toy> ar,String s,int age,int sum){
		Collections.sort(ar);
		String s1=  "(.*)"+s+"(.*)";
		for(Toy t : ar){
			if(t.toString().matches(s1) && age >=t.getAgeLimitsMin() && age <= t.getAgeLimitsMax() && sum < t.getPrice() && t.getPrice() < 200){
				System.out.println(t);
			}
		}
	}
	public static void sort10(ArrayList<Toy> ar ,int persent){
		Collections.sort(ar);
		double min = ar.get(0).getPrice();
		System.out.println(min);
		double range = min * ((double)persent / 100);
		double max = min+range;
		System.out.println(max);
		for(Toy t : ar){
			if(((double)t.getPrice())<=max){
				System.out.println(t);
			}
		}
	}
	public static void sort11(ArrayList<Toy> ar , int sum,int age){
		Collections.sort(ar);
		for(Toy t: ar){
			if(t.getPrice()<sum && age >= t.getAgeLimitsMin() && age <= t.getAgeLimitsMax()){
				System.out.println(t);
			}
		}
		
	}
	public static void sort12(ArrayList<Toy> ar ,String s){
		String s1 = "(.*)"+s+"(.*)";
		Collections.sort(ar);
		for(Toy t :ar){
			if(t.toString().matches(s1)){
				System.out.println(t.toStringGrn());
			}
		}
	}
	public static void sort13(ArrayList<Toy> ar, int persent){
		Collections.sort(ar,new Comparator<Toy>(){

			@Override
			public int compare(Toy o1, Toy o2) {
				return o2.getPrice()-o1.getPrice();
			}
			
		});
		double max = (double)ar.get(0).getPrice();
		double range = max * ((double)persent / 100);
		double min = max -range;
		System.out.println(max);
		System.out.println(min);

		for(Toy t : ar){
			if(t.getPrice() >= min){
				System.out.println(t);
			}
		}
	}
	public static void sort14(ArrayList<Toy> ar,int min, int max){
		Collections.sort(ar, new Comparator<Toy>(){

			@Override
			public int compare(Toy o1, Toy o2) {
				return o1.toString().compareTo(o2.toString());
			}
			
		});
		for(Toy t : ar){
			if(min >= t.getAgeLimitsMin() && max <= t.getAgeLimitsMax()){
				System.out.println(t);
			}
		}
	}
	public static void sort15(ArrayList<Toy> ar,String s){
		String s1 = "(.*)"+s+"(.*)";
		for(Toy t : ar){
		t.setPrise(t.getPrice()*27);
		}
		Collections.sort(ar,new Comparator<Toy>(){

			@Override
			public int compare(Toy o1, Toy o2) {
				return ((Integer)o1.getPrice()).compareTo((Integer)o2.getPrice());
			}
			
		});
		for(Toy t : ar){
			if(t.toString().matches(s1)){
			System.out.println(t.toStringGrn());
			}
		}
	}
	public static void sort16(ArrayList<Toy> ar,String s,int age){
		String s1 = "(.*)"+s+"(.*)";
		Collections.sort(ar,new Comparator<Toy>(){
			public int compare(Toy t1,Toy t2){
				return t2.getPrice()-t1.getPrice();
			}
		});
		for(Toy t: ar){
			if(!(t.toString().matches(s1)) && age >= t.getAgeLimitsMin() && age <= t.getAgeLimitsMax()){
				System.out.println(t);
			}
		}
	}
	public static void sort17(ArrayList<Toy> ar ,String s,int sum,int age){
		ArrayList<Ball> abb = new ArrayList<Ball>();
		ArrayList<Doll> ad = new ArrayList<Doll>();
		ArrayList<Cubes> ac = new ArrayList<Cubes>();
		ArrayList<Designer> add = new ArrayList<Designer>();
		
		String s1 = "(.*)"+s+"(.*)";
		boolean b1 = false;
		boolean b2 = false;
		boolean b3 = false;
		boolean b4 = false;
		for(Toy t: ar){
			if(t.toString().matches(s1) && sum >= t.getPrice() && age >= t.getAgeLimitsMin() && age <= t.getAgeLimitsMax()){
				String strings [] = t.toString().split(" ");
				if(s.equals("ball")){
				Ball b = new Ball(t.getPrice(),t.getAgeLimitsMin(),t.getAgeLimitsMax(),Integer.parseInt(strings[strings.length-1]));
				abb.add(b);
				b1 = true;
				}
				else if(s.equals("doll")){
					Doll d = new Doll(t.getPrice(),t.getAgeLimitsMin(),t.getAgeLimitsMax(),Integer.parseInt(strings[strings.length-1]));
					ad.add(d);
					b2 = true;
				}
				else if(s.equals("cubes")){
					Cubes c = new Cubes(t.getPrice(),t.getAgeLimitsMin(),t.getAgeLimitsMax(),Integer.parseInt(strings[strings.length-1]));
					ac.add(c);
					b3 = true;
				}
				else if(s.equals("desingner")){
					Designer d = new Designer(t.getPrice(),t.getAgeLimitsMin(),t.getAgeLimitsMax(),Integer.parseInt(strings[strings.length-1]));
					add.add(d);
					b4 = true;
				}
			}
		}
		if(b1){
		Collections.sort(abb,new Comparator<Ball> (){

			@Override
			public int compare(Ball o1, Ball o2) {
				if(o1.getWeight()==o2.getWeight()){
					return o2.getPrice()-o1.getPrice();
				}
				else return o1.getWeight()-o2.getWeight();
			}
			
		});
		for(Ball t : abb){
			System.out.println(t);
		}
	}
	
	if(b2){
		Collections.sort(ad,new Comparator<Doll> (){

			@Override
			public int compare(Doll o1, Doll o2) {
				if(o1.getLon()==o2.getLon()){
					return o2.getPrice()-o1.getPrice();
				}
				else return o1.getLon()-o2.getLon();
			}
			
		});
		for(Doll t : ad){
			System.out.println(t);
		}
		
	}
	if(b3){
		Collections.sort(ac,new Comparator<Cubes> (){

			@Override
			public int compare(Cubes o1, Cubes o2) {
				if(o1.getNumber()==o2.getNumber()){
					return o2.getPrice()-o1.getPrice();
				}
				else return o1.getNumber()-o2.getNumber();
			}
			
		});
		for(Cubes t : ac){
			System.out.println(t);
		}
	}
	if(b4){
		Collections.sort(add,new Comparator<Designer> (){

			@Override
			public int compare(Designer o1, Designer o2) {
				if(o1.getPlural()==o2.getPlural()){
					return o2.getPrice()-o1.getPrice();
				}
				else return o1.getPlural()-o2.getPlural();
			}
			
		});
		for(Designer t : add){
			System.out.println(t);
		}
		
	}
	}
	public static void sort18(ArrayList<Toy> ar,int maxLon,int age){
		ArrayList<Doll> ad = new ArrayList<Doll>();
		String s = "(.*)doll(.*)";
		for(Toy t : ar){
			if(t.toString().matches(s) && age >= t.getAgeLimitsMin() && age <= t.getAgeLimitsMax()){
				String string[] = t.toString().split(" ");
				Doll d = new Doll(t.getPrice(),t.getAgeLimitsMin(),t.getAgeLimitsMax(),Integer.parseInt(string[string.length-1]));
				ad.add(d);
			}
		}
		Collections.sort(ad,new Comparator<Doll>(){

			@Override
			public int compare(Doll o1, Doll o2) {
				// TODO Auto-generated method stub
				return ((Integer)o1.getLon()).compareTo((Integer)o2.getLon());
			}
			
		});
		for(Doll d : ad){
			if(d.getLon()<=maxLon){
				System.out.println(d);
			}
		}
	}
	public static void sort19(ArrayList<Toy> ar,int minSum,int age){
		Collections.sort(ar);
		String s = "(.*)cubes(.*)";
		for(Toy t: ar){
			if(t.toString().matches(s) && minSum <= t.getPrice() && t.getPrice() <=200 && age >=t.getAgeLimitsMin() && age <= t.getAgeLimitsMax()){
				System.out.println(t);
			}
			
		}
	}
	public static void sort20(ArrayList<Toy> ar,int persent){
		Collections.sort(ar);
		double minPrice = ar.get(0).getPrice();
		double range = minPrice *((double)persent/100);
		double maxPrice = minPrice + range;
		System.out.println(range);
		System.out.println(maxPrice);
		for(Toy t : ar){
			if(t.getPrice() <= maxPrice){
				System.out.println(t);
			}
		}
	}
	public static void sort21(Hashtable<Integer,Toys> ht){
		List <Toys> ar = new ArrayList<Toys>();
		for(Toys t: ht.values()){
			ar.add(t);
		}
		Collections.sort(ar,new Comparator<Toys>(){

			@Override
			public int compare(Toys t1, Toys t2) {
				if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("doll")){
					return t1.getDoll().getPrice()-t2.getDoll().getPrice();
				}
				if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("ball")){
					return t1.getDoll().getPrice()-t2.getBall().getPrice();
				}
				if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("cubes")){
					return t1.getDoll().getPrice()-t2.getCubes().getPrice();
				}
				if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("designer")){
					return t1.getDoll().getPrice()- t2.getDesigner().getPrice();
				}
				if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("doll")){
					return t1.getBall().getPrice()-t2.getDoll().getPrice();
				}
				if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("ball")){
					return t1.getBall().getPrice()-t2.getBall().getPrice();
				}
				if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("cubes")){
					return t1.getBall().getPrice() - t2.getCubes().getPrice();
				}
				if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("designer")){
					return t1.getBall().getPrice() - t2.getDesigner().getPrice();
				}
				if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("doll")){
					return t1.getCubes().getPrice()-t2.getDoll().getPrice();
				}
				if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("ball")){
					return t1.getCubes().getPrice()-t2.getBall().getPrice();
				}
				if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("cubes")){
					return t1.getCubes().getPrice()-t2.getCubes().getPrice();
				}
				if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("designer")){
					return t1.getCubes().getPrice()- t2.getDesigner().getPrice();
				}
				if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("doll")){
					return t1.getDesigner().getPrice()-t2.getDoll().getPrice();
				}
				if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("ball")){
					return t1.getDesigner().getPrice()-t2.getBall().getPrice();
				}
				if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("cubes")){
					return t1.getDesigner().getPrice()-t2.getCubes().getPrice();
				}
				else{
					return t1.getDesigner().getPrice()- t2.getDesigner().getPrice();
				}
				
			}
			
		});
		for(Toys t: ar){
			switch (t.getStringToy()){
			case "doll":
				System.out.println(t.getDoll());
				break;
			case "ball":
				System.out.println(t.getBall());
				break;
			case "cubes":
				System.out.println(t.getCubes());
				break;
			case "designer":
				System.out.println(t.getDesigner());
				break;
				
			}
		}
	}
	public static void sort22(Hashtable<Integer,Toys>ht){
		List<Toys> list =new ArrayList<Toys>();
		for(Toys t :ht.values()){
			list.add(t);
		}
		Collections.sort(list,new Comparator<Toys>(){

			@Override
			public int compare(Toys t1, Toys t2) {
				if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("doll")){
					return t1.getDoll().getPrice()-t2.getDoll().getPrice();
				}
				if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("ball")){
					return t1.getDoll().getPrice()-t2.getBall().getPrice();
				}
				if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("cubes")){
					return t1.getDoll().getPrice()-t2.getCubes().getPrice();
				}
				if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("designer")){
					return t1.getDoll().getPrice()- t2.getDesigner().getPrice();
				}
				if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("doll")){
					return t1.getBall().getPrice()-t2.getDoll().getPrice();
				}
				if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("ball")){
					return t1.getBall().getPrice()-t2.getBall().getPrice();
				}
				if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("cubes")){
					return t1.getBall().getPrice() - t2.getCubes().getPrice();
				}
				if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("designer")){
					return t1.getBall().getPrice() - t2.getDesigner().getPrice();
				}
				if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("doll")){
					return t1.getCubes().getPrice()-t2.getDoll().getPrice();
				}
				if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("ball")){
					return t1.getCubes().getPrice()-t2.getBall().getPrice();
				}
				if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("cubes")){
					return t1.getCubes().getPrice()-t2.getCubes().getPrice();
				}
				if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("designer")){
					return t1.getCubes().getPrice()- t2.getDesigner().getPrice();
				}
				if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("doll")){
					return t1.getDesigner().getPrice()-t2.getDoll().getPrice();
				}
				if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("ball")){
					return t1.getDesigner().getPrice()-t2.getBall().getPrice();
				}
				if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("cubes")){
					return t1.getDesigner().getPrice()-t2.getCubes().getPrice();
				}
				else{
					return t1.getDesigner().getPrice()- t2.getDesigner().getPrice();
				}
			}
			
			
		});
		for(Toys t : list){
			if(t.getStringToy().equals("designer")){
				System.out.println(t.getDesigner());
			}
		}
	}
	public static void sort23(Hashtable<Integer,Toys> ht,int persent){
		Toys t [] = new Toys[ht.size()];
		int i=0;
		for(Map.Entry<Integer,Toys>entry:ht.entrySet()){
			t[i++]=entry.getValue();
			
		}
		System.out.println("------------------------------");
		Arrays.sort(t,Collections.reverseOrder());
		double min = 0;
		if(t[0].getStringToy().equals("doll")) min = (double)t[0].getDoll().getPrice();
		if(t[0].getStringToy().equals("ball")) min =(double) t[0].getBall().getPrice();
		if(t[0].getStringToy().equals("cubes")) min = (double)t[0].getCubes().getPrice();
		if(t[0].getStringToy().equals("designer")) min =(double) t[0].getDesigner().getPrice();
		System.out.println(min);
		double max = min -(min *((double)persent/100));
		System.out.println(max);
		for(Toys toys : t){
				if(toys.getStringToy().equals("doll")) if((double)toys.getDoll().getPrice() > max)System.out.println(" value:"+toys.getDoll());
				if(toys.getStringToy().equals("ball"))if((double)toys.getBall().getPrice() > max) System.out.println(" value:"+toys.getBall());
				if(toys.getStringToy().equals("cubes")) if((double)toys.getCubes().getPrice() > max)System.out.println(" value:"+toys.getCubes());
				if(toys.getStringToy().equals("designer"))if((double)toys.getDesigner().getPrice() > max) System.out.println(" value:"+toys.getDesigner());
		}
	}
}


	
