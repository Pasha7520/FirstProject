package Pharmasy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date; 

public class Receipts {
	public void receipts(String name) throws IOException, SQLException{
		Inventory inventory = new Inventory();
		Goods goods = new Goods();
		Scanner scn = new Scanner(System.in);
		ArrayList<Medisine> ar = new ArrayList<Medisine>();
		ArrayList<Medisine> factGood = new ArrayList<Medisine>();
		ArrayList<Medisine> neww = new ArrayList<Medisine>();
		Date d  = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat sd1 = new SimpleDateFormat("dd.MM.yyyy' and time' hh.mm.ss ");
		File receipts = new File("C:\\Users\\я\\Desktop\\pharmasy","receipts");
		File receiptsExactly = new File("C:\\Users\\я\\Desktop\\pharmasy\\receipts","receipt "+sd.format(d));
		File newGoods = new File("C:\\Users\\я\\Desktop\\pharmasy\\receipts\\receipt "+sd.format(d),name+" "+sd1.format(d)+".txt");
		File good = new File("C:\\Users\\я\\Desktop\\pharmasy","Goods.txt");
		File factGoods = new File("C:\\Users\\я\\Desktop\\pharmasy\\List goods");
		if(receipts.exists()){
			
		}
		else {
			receipts.mkdir();
		}
		if(receiptsExactly.exists()){
			
		}
		else{
			receiptsExactly.mkdir();
		}
		goods.writeInArrayListGoods(ar);
		inventory.processFilesFromFolder(factGoods, factGood);//write in ArrayList all the fack goods

		int done=0;
		while(!(done==2)){
		System.out.println("Enter the product");
		String pro = scn.nextLine();
		System.out.println("Set the price");
		int price  = scn.nextInt();
		System.out.println("Set the number");
		int num = scn.nextInt();
		Medisine mNew = new Medisine();
		mNew.setName(pro);
		mNew.setNumber(num);
		mNew.setPrice(price);
		neww.add(mNew);
		checking(ar, pro, num, price);//перевірка на повторення(дописування) або запис як нового!(існуючого)
		checking(factGood, pro, num, price);//перевірка на повторення(дописування) або запис як нового!(повинного)
		
		System.out.println("Whant to continue Yes-pick:\"1\" No-pick:\"2\"");
		done = scn.nextInt();
	
		}
		goods.resetInGoods(ar);//запис в товар 
		
		goods.WriteInFile(neww, newGoods);//запис в конкретне наджодження
		File fact[] = factGoods.listFiles();
		goods.WriteInFile(factGood, fact[0]);//запис в фактичний товар
	
	}
	public void checking(ArrayList<Medisine> ar,String pro,int num,int price){
		int index = 0;
		boolean enter = true;
		for(Medisine m :ar){//провытка на повторення товару та дописування до Існуючого
			if(m.getName().equals(pro)){
				if(m.getNumber()==0){
					
				}
				Medisine m1 = new Medisine();
				m1.setName(m.getName());
				m1.setPrice(price);
				m1.setNumber(m.getNumber()+num);
				ar.set(index, m1);
				enter = false;
				
	
			}
			index++;
		}
		if(enter){//ЗАПИС НОВОГО ТОВАРУ
			Medisine m = new Medisine();
			m.setName(pro);
			m.setPrice(price);
			m.setNumber(num);
			ar.add(m);
		}
	}
}
