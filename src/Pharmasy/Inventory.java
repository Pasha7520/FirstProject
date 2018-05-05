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
import java.util.Date;
import java.util.Scanner;
public class Inventory {
	
	
	public static void getDateTotal(){//[хз яметод вроды треба стерти
		
		ArrayList<String> ar = new ArrayList<String>();
		File file = new File("C:\\Users\\я\\Desktop\\pharmasy\\Total");
		File [] f = file.listFiles();
		for(File ff:f){
			ar.add(ff.getName());
		}
		for(String s:ar){
			s.substring(s.lastIndexOf("o")+2);
			System.out.println(s);
		}
		
		
	}
	
	
	
	public void intventory() throws IOException, SQLException{
		total();
		Goods goods = new Goods();
		Scanner scn = new Scanner(System.in);
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");
		File file = new File("C:\\Users\\я\\Desktop\\pharmasy","Inventory");
		File total = new File("C:\\Users\\я\\Desktop\\pharmasy\\Total");
		File inventory = new File ("C:\\Users\\я\\Desktop\\pharmasy\\Inventory","Inventory "+sd.format(d)+".txt");
		File factGoods = new File("C:\\Users\\я\\Desktop\\pharmasy\\List goods");
		File factGoodsNew = new File("C:\\Users\\я\\Desktop\\pharmasy\\List goods","Good list "+sd.format(d)+".txt");
		if(file.exists()){
		}
		else file.mkdir();
		inventory.createNewFile();
		File factGoodOlds [] = factGoods.listFiles();
		File totalCheck [] = total.listFiles();
		File factGoodss []  =  factGoods.listFiles();
		ArrayList<Medisine> ArGoods = new ArrayList<Medisine>();
		ArrayList<Medisine> ArTotal = new ArrayList<Medisine>();
		ArrayList<Medisine> ArAllGoods = new ArrayList<Medisine>();
		ArrayList<Medisine> Invent = new ArrayList<Medisine>();
		
		goods.writeInArrayListGoods(ArGoods);//write from Goods
		processFilesFromFolder(factGoodss[0], ArAllGoods);//write from mustGoods
		processFilesFromFolder(totalCheck[0], ArTotal);//write from total check
		
		subtractionOfTheGoods(ArGoods, ArAllGoods);//віднімає фактичні товари від повинних
		
		subtractionOfTheGoods(ArTotal, ArAllGoods);//віднімає тотал чек від повинних товарів
		
		factGoodss[0].delete();//delete old mustGoods
		totalCheck[0].delete();//delete old total sales check
		factGoodsNew.createNewFile();
		Goods.WriteInFile(ArGoods, factGoodsNew);//Rewrite in Goods
		inventory.createNewFile();
		Inventory.writeInInventoryFile(inventory, ArAllGoods);//write in file Inventory
	}
	public void subtractionOfTheGoods(ArrayList<Medisine> ar1,ArrayList<Medisine> ar2){
		int num = 0;
		for(Medisine m : ar1){//по товарах всых та фактичних
			for(Medisine m1:ar2){
				if( m.getName().equals(m1.getName())){
				 num = m1.getNumber() - m.getNumber();
				 m1.setNumber(num);
				}
			}
		}
	}
	public static void writeInInventoryFile(File inventory,ArrayList<Medisine> ArAllGoods) throws IOException{
		FileWriter fw = new FileWriter(inventory);
		BufferedWriter bw = new BufferedWriter(fw);
		int nums = 1;
		for(Medisine m : ArAllGoods){//запис в інвентеризацію...
			if(m.getNumber()==0){
				bw.write(nums+++"."+m.getName()+" price:"+m.getPrice()+" number:"+m.getNumber()+" come down");
				bw.newLine();
			}
			if(m.getNumber()<0){
				bw.write(nums+++"."+m.getName()+" price:"+m.getPrice()+" number:"+m.getNumber()+" excess");
				bw.newLine();
			}
			
			else{
				bw.write(nums+++"."+m.getName()+" price:"+m.getPrice()+" number:"+m.getNumber()+" shortage");
				bw.newLine();
			}
		}
		bw.close();
		fw.close();
	}
	public void total() throws IOException{
		Goods goods = new Goods();
		Check c = new Check();
		Date d = new Date();
		ArrayList<Medisine> allChecks = new ArrayList<Medisine>();
		SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");
		File file = new File("C:\\Users\\я\\Desktop\\pharmasy","Total");
		File check = new File("C:\\Users\\я\\Desktop\\pharmasy","check");
		File goodsFile = new File("C:\\Users\\я\\Desktop\\pharmasy","Goods.txt");
		File total = new File("C:\\Users\\я\\Desktop\\pharmasy\\Total","Total from "+sd.format(d)+".txt");
		File OldCheck = new File("C:\\Users\\я\\Desktop\\pharmasy\\check");
		System.out.println(OldCheck.exists());
		if(file.exists()){
			
		}
		else {
			file.mkdir();
		}
		total.createNewFile();
		processFilesFromFolder(check,allChecks);//write all checks
		goods.writeInFileLikeCheck(allChecks, total);//write in total sales
		c.deleteOldCheck(OldCheck);
		
	}
	public ArrayList<Medisine> processFilesFromFolder(File file,ArrayList<Medisine> sell) throws IOException{
		if(file.isDirectory()){
			File [] files = file.listFiles();
			outer:for(File f: files){
				if(f.isDirectory()){
					processFilesFromFolder(f,sell);
					continue outer;	
				}
				if(f.getName().contains("TOTAL")){
					continue outer;
				}
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line ="";
		outer1:	while((line=br.readLine())!=null){
					if(!(line.contains("Total"))){
						for(Medisine m:sell){
							if(line.contains(m.getName())){
								
								String ss[] = line.split(" ");
								m.setNumber(m.getNumber()+Integer.parseInt(ss[2].substring(ss[2].lastIndexOf(":")+1)));
								continue outer1;
							}
						}
						
						String s[] = line.split(" ");
						Medisine med = new Medisine();
						med.setName(s[0].substring(s[0].lastIndexOf(".")+1));
						med.setPrice(Integer.parseInt(s[1].substring(s[1].lastIndexOf(":")+1, s[1].lastIndexOf("$"))));
						med.setNumber(Integer.parseInt(s[2].substring(s[2].lastIndexOf(":")+1)));
						sell.add(med);
					}
						
					
					
				}
				br.close();
				fr.close();
			}
			
			}
		else{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line ="";
	outer1:	while((line=br.readLine())!=null){
				if(!(line.contains("Total"))){
					for(Medisine m:sell){
						if(line.contains(m.getName())){
						
							String ss[] = line.split(" ");
							m.setNumber(m.getNumber()+Integer.parseInt(ss[2].substring(ss[2].lastIndexOf(":")+1)));
							continue outer1;
						}
					}
					
					String s[] = line.split(" ");
					Medisine med = new Medisine();
					med.setName(s[0].substring(s[0].lastIndexOf(".")+1));
					med.setPrice(Integer.parseInt(s[1].substring(s[1].lastIndexOf(":")+1, s[1].lastIndexOf("$"))));
					med.setNumber(Integer.parseInt(s[2].substring(s[2].lastIndexOf(":")+1)));
					sell.add(med);
				}
					
				
				
			}
			br.close();
			fr.close();
		}
		
			
			
			return sell;
			
		}
}
