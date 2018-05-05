package Pharmasy;
import java.util.Date ;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Check {
	public void sales() throws IOException{
		Inventory inventory = new Inventory();
		Goods goods = new Goods();
		File check = new File("C:\\Users\\я\\Desktop\\pharmasy\\check");
		File sale = new File("C:\\Users\\я\\Desktop\\pharmasy\\sales");
		deleteOldCheck(sale);
		if(check.exists()){
			File names [] = check.listFiles();
			
			for(File f:names){
				ArrayList<Medisine> list = new ArrayList<Medisine>();
				inventory.processFilesFromFolder(f, list);
				
				File seller = new File("C:\\Users\\я\\Desktop\\pharmasy\\sales",f.getName()+".txt") ;
				if(sale.exists()){
					
				}
				else sale.mkdir();
				
				seller.createNewFile();
				goods.writeInFileLikeCheck(list, seller);//write like check style
			}
			goods.printLikeTotalSallers(sale);
			
		}
		else System.out.println(check.getName()+" doesn't exist!!");
	}
	public void check(String name) throws IOException, SQLException{
		JDBC jdbc = new JDBC("goods");
		
		//File f = new File("C:\\Users\\я\\Desktop\\pharmasy","Goods.txt");
		//if(f.exists()){
			Goods goods = new Goods();
			ArrayList <Medisine> ar = new ArrayList<Medisine>();
			ArrayList <Medisine> check = new ArrayList<Medisine>();
			ArrayList<Medisine> tot = new ArrayList<Medisine>();
			goods.printGoods();//print goods!!!
			Scanner scn = new Scanner(System.in);
			goods.writeInArrayListGoods(ar);//write in arraylist
			int done = 0;
			int i = 0;
		outer1:	while(!(done==2)){
				System.out.println("Select a product");
				int position = scn.nextInt();
				System.out.println("Set the number");
				int num= scn.nextInt();
				done = goods.FindInCheck(ar, check, position, num);//шукає в файлі та перезаписує його !!!записує в чек паралельно
		}
			Date d = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy' and time' hh.mm.ss ");
			SimpleDateFormat sd1 = new SimpleDateFormat("dd.MM.yyyy");
			File check1 = new File("C:\\Users\\я\\Desktop\\pharmasy","check");
			File folder = new File("C:\\Users\\я\\Desktop\\pharmasy\\check",name);
			File user = new File("C:\\Users\\я\\Desktop\\pharmasy\\check\\"+name,name+" "+sd1.format(d));
			if(check1.exists()){
				
			}
			else {
				check1.mkdir();
			}
			if(folder.exists()){
			}
			else{
				folder.mkdir();
			}
			if(user.exists()){
			}
			else{
				user.mkdir();
			}
			File checkFile = new File("C:\\Users\\я\\Desktop\\pharmasy\\check\\"+name+"\\"+name+" "+sd1.format(d),name+" "+sd.format(d)+".txt");
			File totalCheck = new File("C:\\Users\\я\\Desktop\\pharmasy\\check\\"+name+"\\"+name+" "+sd1.format(d),name+" "+sd1.format(d)+" TOTAL"+".txt");
			if(totalCheck.exists()){
				
			}
			else totalCheck.createNewFile();
			checkFile.createNewFile();
			goods.writeArrayListLikeChech(tot, totalCheck);//write in ArrayList like check
			goods.checkingForEntryLikeCheck(check, tot);//checking and writing int №2
			goods.writeInFileLikeCheck(tot, totalCheck);//write in total!!
			goods.writeInFileLikeCheck(check, checkFile);//write in check!!
			for(Medisine m : ar){
				System.out.println(m.getName());
			}
			goods.resetInGoods(ar);//reset all goods non-existent!!
	//	}
	//	else System.out.println("File doesn't exist!!");
	}
	public void deleteOldCheck(File file){
		if(file.isDirectory()){
			
		
		File [] f = file.listFiles();
		for(File ff:f){
			if(ff.isDirectory()){
				deleteOldCheck(ff);
			}
				ff.delete();
			
		  }
		}
		else{
			file.delete();
		}
	}
	

	
}
