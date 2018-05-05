package File3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;

public class File3 {
	public static void copyFile1(File f , File s) throws IOException{
		Files.copy(f.toPath(),s.toPath());
		System.out.println(f.toPath());
		System.out.println(s.toPath());
		
	}
	public static void copyFileLOL1(File f,File s) throws IOException{
		System.out.println("Hello");
		File file = new File(s.getAbsolutePath(),f.getName());
		System.out.println(f.getName());
		System.out.println(s.getName());
		if(file.createNewFile()) System.out.println("Was ceated");
		else System.out.println("Was not ceated");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		String save = "";
		String line = "";
		while((save=br.readLine())!=null){
			bw.write(save);
			bw.newLine();
		}
		bw.close();
		fw.close();
	}
	
	public static void writeF14(File f,String s) throws IOException{
	
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(s);
		bw.newLine();
		//------------//
		bw.close();
		fw.close();
		
	}
	public static void wordIn15(File f,String s) throws IOException{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		String d = "";
		String dd = "";
		int a =0;
		boolean as = false;
		System.out.println();
		while ((d=br.readLine())!=null){
			if(as){
				dd+="\n";
			}
			dd= dd+d;
			as =true;
		}

		for(int i =0; i <= dd.length()-s.length();i++){
			if(dd.substring(i, s.length()+i).equals(s)){
				a++;
				i+=(s.length()-1);
			}
				
			}
		System.out.println("inputing Sting:"+s+" "+a+" times");
		
		}
	public static void delete3(File f){
		if(f.delete())System.out.println("deleted!!!");
	}
	
	public static void reNameFile2(File f1,File f2){
		

		if(f1.exists() && !f2.exists()){
			if(f1.renameTo(f2)){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
	}
	public static void way4(File f){
		System.out.println(f.getAbsoluteFile());
	}
	public static void FolderFileExtension5and10(File f,String a){
		
		for(File file: new File(f.getAbsolutePath()).listFiles()){
			if(file.isFile()){
				if(File3.getFileExtension(file).equals(a)){
					System.out.println(file.toString());
				}
				
			}
			
		}
	}
public static void FolderFileExtension5(File f){
		
		for(File file: new File(f.getAbsolutePath()).listFiles()){
			if(file.isFile()){
					System.out.println(file.toString());
			}	
		}
	}
	public static String getFileExtension(File f){
		String s =f.getName();
		if(s.lastIndexOf('.')!=-1 && s.lastIndexOf('.')!=0){
			return s.substring(s.lastIndexOf('.')+1);
		}
		else {return "";}
	}
	public static void deleteAllFilesFolder(String a ){
		for(File f : new File(a).listFiles()){
			if(f.isFile()){
				f.delete();
				
			}
		}
	}
	public static void deleteAllFilesFolder(String a , String b){
		for(File f : new File(a).listFiles()){
			if(f.isFile()){
				if(File3.getFileExtension(f).equals(b)){
				f.delete();
				}
			}
		}
	}
	public static void createFile6(String name) throws IOException{
		String fs = System.getProperty("file.separator")+System.getProperty("file.separator");
		if(name.lastIndexOf('.')==-1){
			name=name+".txt";
		}
		String abcoluteFilePath = "C:"+fs + "Users"+fs+"я"+fs+"Desktop"+fs+"file"+fs;
		File file = new File(abcoluteFilePath,name);
		if(file.createNewFile()){
			System.out.println(abcoluteFilePath +" Was created");
		}
		else System.out.println(abcoluteFilePath +" Alredy exist");
	}
	public static void createFolder6(String name) throws IOException{
		File file = new File("C:\\Users\\я\\Desktop\\",name);
		if(file.mkdir()){
			System.out.println(" Was created");
		}
		else System.out.println(" Alredy exist");
	}
	
	public static void sizeDate7(File f){
		long l = f.lastModified();
		
		System.out.println(f.getName()+":"+f.length()/1024+" Kbytes");
		System.out.println(f.getName()+":"+new Date(l)+" Date of last modification");

	}
	public static void sizeAllFileFolder12(File f){
		for(File file: new File(f.getAbsolutePath()).listFiles()){
			long l = file.lastModified();
			System.out.println(file.getName()+":"+"extencion -"+File3.getFileExtension(file)+", size "+file.length()/1024+" Kbytes,"+
		"and Date last modification-"+new Date(l));
		}
	}
	public static void movingKindOfCopy8(File sourse,File dest) throws IOException{
		Files.copy(sourse.toPath(), dest.toPath());
		sourse.delete();
		
		}
	public static void movingKindOfStream8(File sourse,File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try{
			is = new FileInputStream(sourse);
			os = new FileOutputStream(dest);
		
		byte []buffer = new byte[1024];
		int length;
		while((length=is.read(buffer)) > 0){
			os.write(buffer,0,length);
			
		}
		}
	finally{
		is.close();
		os.close();
		
	}
	}
	public static void sumSize9(File f){
		String a =f.getPath();
		int sum = 0;
		for(File file : new File(a).listFiles()){
			if(file.isFile()){
				System.out.println(file.getName()+"and "+file.length()/1024+"Kbytes");
				sum +=(file.length()/1024);
			}
	}
		System.out.println("Sum of all files:"+sum+"Kbytes");
	}
	public static void mergerFiles11(File f,File g) throws IOException{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		FileReader fr1 = new FileReader(g);
		BufferedReader br1 = new BufferedReader(fr1);
		String s ="";
		while ((s=br1.readLine())!=null){
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		fw.close();
		
	}
	public static void changeWordLOL16(File f,String s,String a) throws IOException{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String dd = "";
		String ddd = "";
		String newddd = "";
		boolean b = false;
		while((dd=br.readLine())!=null){
			if(b){
				ddd= ddd+"\n";
			}
			
			ddd = ddd + dd;
			b =true;
			
		}
		System.out.println(ddd);
		System.out.println("------------");
		System.out.println("length "+ddd.length());
		int index = 0;
		for(int i = 0; i <= (ddd.length()-s.length());i++){
			if(ddd.substring(i,s.length()+i).equals(s)){
				newddd = newddd + a;
				index = i+s.length();
				i=i+(s.length()-1);
				System.out.println(newddd);
				System.out.println("index="+index);
			}
			else{
				newddd = newddd + ddd.charAt(i);
				index++;
			}
		
		}
		if(index > (ddd.length()-s.length())&&index <= ddd.length()){
			System.out.println("yes");
			newddd = newddd + ddd.substring(index);
		}
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		String [] string = newddd.split("\n");
		for(int i = 0;i < string.length;i++){
			bw.write(string[i]);
			bw.newLine();
		}
		bw.close();
		fw.close();
	}
	public static void changeWord16(File f,String s,String a) throws IOException{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		String strWork = "";
		boolean b = true;
		while((strWork = br.readLine())!=null){
			if(b){
				str +="\n";
			}
			str += strWork;
			b = true;
		}
		String newstr = "";
		newstr = str.replace(s, a);
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		String [] ss = newstr.split("\n");
		for(int i=0;i < ss.length;i++){
			bw.write(ss[i]);
			bw.newLine();
		}
		bw.close();
		fw.close();
		
	}
	public static void addUser17(String s) throws IOException{
		File f = new File("C:\\Users\\я\\Desktop\\file","Новый текстовый документ.txt");
		if(f.exists()){
		}else f.createNewFile();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		String ss = "";
		boolean exist = true;
		boolean b = false;
		while ((ss=br.readLine())!=null){
			if(b) {str +="\n";}
			str +=ss;
			b=true;
		}
		
		String [] strings = str.split("\n");
		String nick ="";
		for(int i=0;i < s.length();i++){// вирізати нік
			if(s.subSequence(i, i+1).equals(" ")){
				nick = s.substring(0,i);
				break;
			}
		}
		
		for(int i = 0; i < strings.length;i++){
			
			String [] sName = strings[i].split(" ");
			for(int j =0;j < sName[0].length();j++){
				if(sName[0].charAt(j)=='.'){
					sName[0] = sName[0].substring(j+1);
					
				}
			}

			if(sName[0].equals(nick)){
				exist = false;
			}
		}
		if(exist){
			FileWriter fw = new FileWriter(f,false);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i < strings.length;i++){
				bw.write((i+1)+".");
				bw.write(strings[i]);
				bw.newLine();
			}
			bw.write((strings.length+1)+".");
			bw.write(s);
			bw.newLine();
			System.out.println("Users attached");
			bw.close();
			fw.close();
		}
		else System.out.println("Users existed");

	}
	public static void correctUser18(String oldName,String name,String pas,String info) throws IOException{
		File f = new File("C:\\Users\\я\\Desktop\\file","Новый текстовый документ.txt");
		if(f.exists()){
			System.out.println("good");
		}
		else{
			f.createNewFile();
			System.out.println("bed");
		}
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String s = "";
		boolean nl = false;
		while ((line=br.readLine())!=null){
			if(nl) {s +="\n";}
			s +=line;
			nl = true;
		}
		System.out.println(s);
		int inLine = 0 ;
		String []strings = s.split("\n");
		for(int i=0;i < strings.length;i++){
			String [] sName = strings[i].split(" ");
			for(int j =0; j < sName[0].length();j++){
				if(sName[0].charAt(j)=='.'){
					sName[0] = sName[0].substring(j+1);
				}
			}
			if(sName[0].equals(oldName)){
				inLine = i;
			}
			
			
		}
		FileWriter fw = new FileWriter(f,false);
		BufferedWriter bw =new BufferedWriter(fw);
		for(int i = 0; i < strings.length;i++){
		if(inLine==i){
			System.out.println("inside");
			bw.write((i+1)+".");
			bw.write(name+" "+pas+" "+info);
			bw.newLine();
		}
		else{
			bw.write(strings[i]);
			bw.newLine();
			
		}
		}
		bw.close();
		fw.close();
	}
		public static void printFileGoods19(File f)throws IOException{
			
			if(f.exists()){
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String s ="";
				while ((s=br.readLine())!=null){
					
					String [] strings = s.split(" ");
					System.out.println(strings[0]);
				}
			}
			else System.out.println("File dont exists");
		}
		public static void printFeatures19(File f,int a) throws IOException{
			if(f.exists()){
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line ="";
				int lines = 0;
				while ((line=br.readLine())!=null){
					lines++;
					if(lines==a){
						System.out.println(line);
					}
				}
			}
			else System.out.println("File doesn't exists");
		}
		public static void buyGoods20(int a,int num) throws IOException{
			File f = new File("C:\\Users\\я\\Desktop\\file","Новый текстовый документ.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line ="";
			String s = "";
			boolean b = false;
			int sum = 0;
			if(f.exists()){
				while((line=br.readLine())!=null){
					if(b){ s +="\n";}
					s += line;
					b = true;
				}
				String strings [] = s.split("\n");
				for(int i=0; i < strings.length;i++){
					String partS [] = strings[i].split(" ");
					String val = "";
				
					System.out.println(partS[0].substring(0, partS[0].lastIndexOf(".")));
					if(partS[0].substring(0, partS[0].lastIndexOf(".")).equals(val.valueOf(a))){
						int prise = Integer.parseInt(partS[1]);
						System.out.println(prise);
						sum = (prise*num);
						
						System.out.println("Oder amount for "+partS[0].substring(partS[0].lastIndexOf(".")+1)+"s -"+sum);
						
					}
					
				}
			}
			else System.out.println("File dosn't exist");
		}
		public static void password22(String name,String password) throws IOException{
			File f = new File("C:\\Users\\я\\Desktop\\file","Новый текстовый документ (2).txt");
			if(f.exists()){
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line = "";
				String s = "";
				boolean b = false;
				while((line=br.readLine())!=null){
					if(b){s +="\n";}
					s+=line;
					b =true;
				}
				String string []=s.split("\n");
				for(int i=0; i < string.length;i++){
					String partS [] = string[i].split(" ");
					
					if(partS[0].substring(partS[0].lastIndexOf(".")+1).equals(name) ){
						if(partS[1].equals(password) ){
							System.out.println("Welcome "+partS[0].substring(partS[0].lastIndexOf(".")+1)+" "+partS[2]);
						}
					}
				}
				
			}
			else System.out.println("File dosn't exist");
		}
		public static void deleteLine23(File f,int a) throws IOException{
			File file = new File("C:\\Users\\я\\Desktop\\file","New.txt");
			if(file.exists()){
				
			}else {file.createNewFile();}
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String s ="";
		boolean b = false;
		int numline = 0;
		
		while((line=br.readLine())!=null){
			if(b){s+="\n";}
			s+=line;
			b = true;
			numline++;
		}
		if(numline==1){
			s+="\n";
		}
		String string [] = s.split("\n");
		FileWriter fw = new FileWriter(file,false);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i =0;i < string.length;i++){
			if(i+1==a);
			else{
			bw.write(string[i]);
			bw.newLine();
			}
		}
		bw.close();
		fw.close();
		FileReader frN = new FileReader(file);
		BufferedReader brN = new BufferedReader(frN);
		
		FileWriter fwN = new FileWriter(f,false);
		BufferedWriter bwN= new BufferedWriter(fwN);
		while((line = brN.readLine())!=null){
			bwN.write(line);
			bwN.newLine();
		}
		bwN.close();
		fwN.close();
		
		brN.close();
		frN.close();
		
		if(file.delete()) System.out.println("file deleted");
			
			
			
			
			
		}
	public static void censorship24(File f , String [] strings) throws IOException{
		if(f.exists()){
			
			
			if(f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf(".")).equals(".txt")){
				System.out.println("hear");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line ="";
			String s ="";
			boolean b = false;
			while((line = br.readLine())!=null){
				if(b){s+="\n";}
				s+=line;
				b=true;
			}
			if(b==false){
				s+="\n";
			}
			br.close();
			fr.close();
			
			for(int i =0; i < strings.length;i++){
				s = s.replace(strings[i], "oops");
			}
			String lines []  = s.split("\n");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i =0; i < lines.length;i++){
				bw.write(lines[i]);
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
		}
		else System.out.println("File doesn't exist");
	}
	public static void printSomeLines25(File f ,int [] a) throws IOException{
		if(f.exists()){
			if(f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf(".")).equals(".txt")){
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line = "";
				String s = "";
				boolean b = false;
				while((line = br.readLine())!=null){
					if(b) s+="\n";
					s+=line;
					b=true;
				}
				if(b==false){
					s+="\n";	
				}
				String [] strings = s.split("\n");
				int l ;
				for(int i =0;i < a.length;i++){
					l = a[i]-1;
					for(int j=0;j < strings.length;j++){
						if(j==l&&l<=strings.length){
							System.out.println(strings[j]);
						}
						if(l>strings.length) System.out.println("This line doesn't exist");
					}
				}
		br.close();
		fr.close();
			}
		}
		else System.out.println("File doesn't exist");
	}
	public static void printFiles29(File[] f) throws IOException{
		for(int i = 0;i<f.length;i++){
			if(f[i].exists()){
				FileReader fr = new FileReader(f[i]);
				BufferedReader br = new BufferedReader(fr);
				String line = "";
				boolean fileName = true;
				while((line = br.readLine())!=null){
					if(fileName){System.out.println("File contents :"+f[i].getName());
					fileName = false;
					}
					System.out.println(line);
					}
				}
			else System.out.println("File "+f[i].getName()+" doesn't exist!");
			}
		
		}
	public static void filesLength30(File[]f){
		double sumLen = 0;
		String fileName ="";
		for(int i =0; i < f.length;i++){
			if(f[i].exists()){
				sumLen +=f[i].length();
				System.out.println(f[i].length());
				fileName = fileName+f[i].getName()+";";
				
			}
			else{
				System.out.println("File -" + f[i].getName()+" does't exist!!!");
			}
		}
		System.out.println(Math.round(sumLen));
		System.out.println("Total volume on files "+fileName +Math.round(sumLen/1024)+"Kbytes");
		
	}
		public static void deleteAllFromFolder(File file){
			if(file.isDirectory()){
				File files [] = file.listFiles();
				for(File f:files){
					File f1 = new File(file,f.getName());
					deleteAllFromFolder(f1);
				}
				file.delete();
			}
			else file.delete();
		}
		public static void readAllFolder(File file , ArrayList<String> ar) throws IOException{
			if(file.isDirectory()){
				File [] files = file.listFiles();
				System.out.println(files.length);
			outer:	for(File f:files){
					if(f.isDirectory()){
						readAllFolder(f,ar);
						continue outer;
					}
					else{
						BufferedReader br = new BufferedReader(new FileReader(f));
						String line = "";
						while((line = br.readLine())!=null){
							ar.add(line);
						}
					}
				}
			}
			else{
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line = "";
				while((line = br.readLine())!=null){
					ar.add(line);
				}
				br.close();
			}
			
		}
		
		
	}
		
		
		
		
		
		
		
		
		



