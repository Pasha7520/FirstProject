package Toy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Task {
	public static void task24(HashMap<Integer,Toy> hm){
		ArrayList<Toy> ar = new ArrayList<Toy>();
		for(Toy t:hm.values()){
			ar.add(t);
		}
		Collections.sort(ar);
		

		for(Toy t:ar){
			if(t.getAgeLimitsMin()<=5 && t.getAgeLimitsMax()>=6){
				System.out.println(t.toString());
			}
		}
		
		}
	public static void task25(HashMap<Integer,Toy> hm){
		ArrayList<Toy> ar = new ArrayList<Toy>();
		for(Toy t:hm.values()){
			ar.add(t);
		}
		Collections.sort(ar,new Comparator<Toy>(){

			@Override
			public int compare(Toy t1, Toy t2) {
				return (t1.getPrice()*27)-(t2.getPrice()*27);
			}
			
		});
		for(Toy t:ar){
			if(t.getName().equals("Cubes")){
				System.out.println(t.toStringGrn());
			}
		}
	}
	public static void task26(HashMap<Integer,Toy> hm,int age,int price){
		ArrayList<Toy> ar = new ArrayList<Toy>();
		for(Toy t:hm.values()){
			ar.add(t);
		}
		
		Collections.sort(ar,new Comparator<Toy>(){

			@Override
			public int compare(Toy t1, Toy t2) {
				
				return t2.getPrice()-t1.getPrice();
			}
			
		});
		for(Toy t: ar){
			if(!(t.getName().equals("Designer"))){
				if(t.getAgeLimitsMin() <= age && t.getAgeLimitsMax()>= age && t.getPrice() <= price){
					System.out.println(t);
				}
			}
		}
	}
	public static void task27(HashMap<Integer,Toy> hm,int min,int max,int price){
		ArrayList<Toy> ar = new ArrayList();
		for(Toy t : hm.values()){
			ar.add(t);
		}
		Collections.sort(ar,new Comparator<Toy>(){

			@Override
			public int compare(Toy o1, Toy o2) {
				
				return o1.getFeature()-o2.getFeature();
			}
			
		});
		for(Toy t:ar){
			if(t.getName().equals("Ball") && t.getAgeLimitsMin() <= min && t.getAgeLimitsMax() >= max && t.getPrice() <= price){
				System.out.println(t);
			}
		}
	}
	public static void task28(HashMap<Integer,Toy> hm,int age,int size){
		ArrayList<Toy> ar = new ArrayList<Toy>();
		for(Toy t : hm.values()){
			ar.add(t);
		}
		Collections.sort(ar,new Comparator<Toy>(){

			@Override
			public int compare(Toy o1, Toy o2) {
				return o1.getFeature()-o2.getFeature();
			}
			
		});
		for(Toy t : ar){
			if(t.getName().equals("Doll") && t.getAgeLimitsMin() <= age && t.getAgeLimitsMax() >= age && t.getFeature() <= size){
				System.out.println(t);
			}
		}
	}
	public static void task29(HashMap<Integer,Toy> hm,int age,int price){
		ArrayList<Toy> ar = new ArrayList<Toy>();
		for(Toy t : hm.values()){
			ar.add(t);
		}
		Collections.sort(ar,new Comparator<Toy>(){

			@Override
			public int compare(Toy o1, Toy o2) {

				return o1.getPrice()-o2.getPrice();
			}
			
		});
		for(Toy t : ar){
			if(t.getName().equals("Cubes") && t.getAgeLimitsMin() <= age && t.getAgeLimitsMax() >= age && t.getPrice() <= price && t.getPrice()>=15){
				System.out.println(t);
			}
		}
	}
	public static void task30(HashMap<Integer,Toy> hm,int persent){
		ArrayList<Toy> ar = new ArrayList<Toy>();
		for(Toy t : hm.values()){
			ar.add(t);
		}
		Collections.sort(ar,new Comparator<Toy>(){

			@Override
			public int compare(Toy o1, Toy o2) {
				// TODO Auto-generated method stub
				return o1.getPrice()-o2.getPrice();
			}
			
		});
		int min = ar.get(0).getPrice();
		double pers = min*((double)persent/100);
		double borders = pers+min;
		System.out.println(min);
		System.out.println(pers);
		System.out.println(borders);
		for(Toy t:ar){
			if(t.getPrice() <= borders){
				System.out.println(t);
			}
		}
	}
	
}

