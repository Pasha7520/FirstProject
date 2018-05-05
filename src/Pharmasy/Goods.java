package Pharmasy;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.mysql.cj.api.jdbc.Statement;

public class Goods {
	public void printGoods() throws IOException, SQLException{
		ArrayList<Medisine> ar =new  ArrayList<Medisine>();
		writeInArrayListGoods(ar);
		int num =0;
			for(Medisine s:ar){
				System.out.println(++num+")"+s.getName()+" price = "+s.getPrice()+"$ number = "+s.getNumber());
			}
		
	}
	public void sortGoods() throws SQLException{
		ArrayList<Medisine> ar =new  ArrayList<Medisine>();
		writeInArrayListGoods(ar);
			Collections.sort(ar);
			resetInGoods(ar);
	}
	
	public void printLikeTotalSallers(File file) throws IOException{
	if(file.exists()){
		File f [] = file.listFiles();
		HashMap<String,Integer> sums = new HashMap<String,Integer>();
		int index =0;
		int value = 0;
		for(File ff: f){
		FileReader fr = new FileReader(ff);
		BufferedReader br = new BufferedReader(fr);
		String line ="";
		while((line=br.readLine())!=null){
			if(line.contains("Total")){
				value = Integer.parseInt(line.substring(line.lastIndexOf("=")+2,line.lastIndexOf("$")));
				sums.put(ff.getName(), value);
			}
		}
		br.close();
		fr.close();
		}
		LinkedList<Map.Entry<String,Integer>> list = new LinkedList<>(sums.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
				
				return o2.getValue()-o1.getValue();
			}
			
		});
		int ind = 0;
		for(Map.Entry<String, Integer> entry:list){
			String name = entry.getKey().substring(0,entry.getKey().lastIndexOf("."));
			System.out.println("Sales rating "+(++ind)+"."+name+" sold for the amount = "+entry.getValue()+"$");			
		}
	}
	else System.out.println("File non-existed!!!");
	}
	
	public static void WriteInFile(ArrayList<Medisine> ar ,File file) throws IOException{
		if(file.exists()){
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			int num =1;
			for(Medisine m: ar){
				bw.write(num+++"."+m.getName()+" price:"+m.getPrice()+"$ number:"+m.getNumber());
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
		else{
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			int num =1;
			for(Medisine m: ar){
				bw.write(num+++"."+m.getName()+" price:"+m.getPrice()+"$ number:"+m.getNumber());
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
	}
	
	public void writeInFileLikeCheck(ArrayList<Medisine> ar ,File file) throws IOException{
		if(file.exists()){
			int sum =0;
			int total = 0;
			int num = 1;
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Medisine m : ar){
				sum = m.getNumber()*m.getPrice();
				total +=sum;
				bw.write(num+++"."+m.getName()+" prise:"+m.getPrice()+"$ number:"+m.getNumber()+" sum ="+sum+"$");
				bw.newLine();
			}
			bw.write("Total sum = "+total+"$");
			bw.close();
			fw.close();
		}
		
	}
	
	public void writeInArrayListGoods(ArrayList<Medisine> ar) throws SQLException{

		JDBC jdbc = new JDBC("goods");
		
		ResultSet resultSet = jdbc.getResultSet();
		while(resultSet.next()){
			Medisine m = new Medisine();
			m.setName(resultSet.getString("medisine"));
			m.setPrice(Integer.parseInt(resultSet.getString("price_$")));
			m.setNumber(Integer.parseInt(resultSet.getString("number")));
			ar.add(m);
		}
		jdbc.closeStatement();
		jdbc.closeConnection();
	}
	public void writeInArrayListUsers(ArrayList<String> ar,String Tab,String column) throws SQLException{
		JDBC jdbc = new JDBC(Tab);
		
		ResultSet resultSet = jdbc.getResultSet();
		while(resultSet.next()){
			ar.add(resultSet.getString(column));
		}
		jdbc.closeStatement();
		jdbc.closeConnection();
	}
	
	public void writeArrayListLikeChech(ArrayList<Medisine> tot, File file) throws IOException{
		FileReader frT = new FileReader(file);
		BufferedReader brT = new BufferedReader(frT);
		String LineT = "";
	outer:while((LineT=brT.readLine())!=null){
			if(LineT.contains("Total")){
				continue outer;
			}
			String str[] = LineT.split(" ");
			Medisine m = new Medisine();
			m.setName(str[0].substring(str[0].lastIndexOf(".")+1));
			m.setPrice(Integer.parseInt(str[1].substring(str[1].lastIndexOf(":")+1, str[1].lastIndexOf("$"))));
			m.setNumber(Integer.parseInt(str[2].substring(str[2].lastIndexOf(":")+1)));
			tot.add(m);
		}
	}
	
	public void checkingForEntryLikeCheck(ArrayList<Medisine> ar1,ArrayList<Medisine> ar2){
		for(Medisine m :ar1){
			boolean  b= true;
			for(Medisine me:ar2){	
			if(m.getName().equals(me.getName())){
				me.setNumber(m.getNumber()+me.getNumber());
				b = false;
			}
			}
			if(b){
				ar2.add(m);
			}
		}
		
	}
	
	public void resetInGoods(ArrayList<Medisine> ar) throws SQLException{
		JDBC jdbc = new JDBC("goods");
		ResultSet resultSet = jdbc.getResultSet();
		String lineNew ="";
		int num = 0;
		for(Medisine m:ar){
			Statement statement = jdbc.getStatement();
			num++;
			statement.execute("UPDATE goods SET medisine ='" + m.getName()+"' WHERE id='"+(num)+"'");
			statement.execute("UPDATE goods SET price_$ ='" + m.getPrice()+"' WHERE id='"+(num)+"'");
		  statement.execute("UPDATE goods SET  number ='" + m.getNumber()+"' WHERE id='"+(num)+"'");
		}
	}
	
	public int FindInCheck(ArrayList<Medisine> ar,ArrayList<Medisine> check,int position,int num){
		Scanner scn = new Scanner(System.in);
		int done =0;
		String med = "";
		Medisine m1 = new Medisine();
		Medisine m2 = new Medisine();
		int numberAll = 0;
		m1=ar.get(position -1);
		int index=0;
		for(Medisine m:check){
			index++;
			if(m1.getName().equals(m.getName())){
				if(!(m1.getNumber()==0)) {					
					
					numberAll = m1.getNumber()-num;
					if(numberAll <=0){
						if(numberAll==0){
						
						}
						else {
							System.out.print("You can bay only "+m1.getNumber()+"number");
						}
						m.setNumber(m1.getNumber()+m.getNumber());
						check.set(index-1, m);
						m1.setNumber(0);
						ar.set(position -1, m1);//обнул€эмо пусту кылькысть препарату
				}
						
						
					
						if(numberAll > 0){
					m1.setNumber(numberAll);//мын€эм реальну кылькысть
					ar.set(position -1, m1);
					m.setNumber(num+m.getNumber());
					check.set(index-1, m);
					
						}
					}else System.out.println(m1.getName()+" isn't available!!");
					
					System.out.println("Continue:next pick 1"+" Exit:done pick 2");
					 done = scn.nextInt();
					 return done;
			}
		}
		if(!(m1.getNumber()==0)) {
			
		
		numberAll = m1.getNumber()-num;
		if(numberAll <=0){
			if(numberAll==0){
			
			}
			else {
				System.out.print("You can bay only "+m1.getNumber()+"number");
			}
			
			m2.setName(m1.getName());
			m2.setNumber(m1.getNumber());
			m2.setPrice(m1.getPrice());
			m1.setNumber(0);
			ar.set(position -1, m1);//обнул€эмо пусту кылькысть препарату
	}
			
			
		
			if(numberAll > 0){
		m1.setNumber(numberAll);//мын€эм реальну кылькысть
		ar.set(position -1, m1);
		m2.setName(m1.getName());
		m2.setNumber(num);
		m2.setPrice(m1.getPrice());
		
			}
		check.add(m2);
		}else System.out.println(m1.getName()+" isn't available!!");
		
		System.out.println("Continue:next pick 1"+" Exit:done pick 2");
		 done = scn.nextInt();
		 return done;
		}
	
	public void register()throws IOException, SQLException{
		JDBC jdbc = new JDBC("users");
		ArrayList<String> ar = new ArrayList<String>();
		Goods goods = new Goods();
		goods.writeInArrayListUsers(ar,"users","login");
		
		ResultSet resultSet = jdbc.getResultSet();
		Scanner scn = new Scanner(System.in);
		String name = "";
		String password = "";
		String password2 = "";
		int lon = 4;
		boolean step = true;
	outer:while(step){
		System.out.println("Enter a new login");
		name = scn.nextLine();
		if(name.length()>=lon){
			for(String s: ar){
				if(name.equals(s)){
					System.out.println("Such a login already exist!!");
					continue outer;
				}
			}
			
				System.out.println("Enter the password!!");
				password = scn.nextLine();
				if(password.length()>=lon){
					System.out.println("Please repeat the password!!");
					password2 = scn.nextLine();
					if(password.equals(password2)){
						Statement statement = jdbc.getStatement();
						statement.execute("INSERT INTO users (id , login ,password) VALUE (null,'"+name+"','"+password+"')");

						System.out.println("User with names created!!!");
						step = false;
					}
					else {
						System.out.println("Password doesn't open!!");
						continue outer;
					}
					
				}
				else{
					System.out.println("password must be longer than " +lon+" characters");
				}
		}
		else{
			System.out.println("Login must be longer than "+(lon-1)+" characters");
		}
		}
		jdbc.closeStatement();
		jdbc.closeConnection();
	}
	
	
	}
	

